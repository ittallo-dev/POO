import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class MobiusAnimation extends JPanel {

    private double angle = 0;

    public MobiusAnimation() {
        Timer timer = new Timer(16, e -> {
            angle += 0.02;
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
	
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int w = getWidth();
        int h = getHeight();

        g2.setColor(Color.BLACK);
        g2.fillRect(0, 0, w, h);

        g2.translate(w / 2, h / 2);

        double scale = 120;
        int stepsU = 120;
        int stepsV = 16;

        for (int i = 0; i < stepsU; i++) {
            double u1 = 2 * Math.PI * i / stepsU;
            double u2 = 2 * Math.PI * (i + 1) / stepsU;

            for (int j = 0; j < stepsV; j++) {
                double v1 = -0.35 + 0.7 * j / stepsV;
                double v2 = -0.35 + 0.7 * (j + 1) / stepsV;

                Point p1 = project(mobius(u1, v1), scale);
                Point p2 = project(mobius(u2, v1), scale);
                Point p3 = project(mobius(u2, v2), scale);
                Point p4 = project(mobius(u1, v2), scale);

                float hue = (float) (i / (double) stepsU);
                g2.setColor(Color.getHSBColor(hue, 0.8f, 1.0f));

                Path2D face = new Path2D.Double();
                face.moveTo(p1.x, p1.y);
                face.lineTo(p2.x, p2.y);
                face.lineTo(p3.x, p3.y);
                face.lineTo(p4.x, p4.y);
                face.closePath();

                g2.fill(face);

                g2.setColor(new Color(0, 0, 0, 80));
                g2.draw(face);
            }
        }
    }

    private double[] mobius(double u, double v) {
        double x = (1 + v * Math.cos(u / 2)) * Math.cos(u);
        double y = (1 + v * Math.cos(u / 2)) * Math.sin(u);
        double z = v * Math.sin(u / 2);

        return rotate(x, y, z);
    }

    private double[] rotate(double x, double y, double z) {
        double cosY = Math.cos(angle);
        double sinY = Math.sin(angle);

        double x1 = x * cosY + z * sinY;
        double z1 = -x * sinY + z * cosY;

        double cosX = Math.cos(angle * 0.6);
        double sinX = Math.sin(angle * 0.6);

        double y1 = y * cosX - z1 * sinX;
        double z2 = y * sinX + z1 * cosX;

        return new double[]{x1, y1, z2};
    }

    private Point project(double[] p, double scale) {
        double distance = 4;
        double factor = distance / (distance - p[2]);

        int x = (int) (p[0] * scale * factor);
        int y = (int) (p[1] * scale * factor);

        return new Point(x, y);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Fita de Möbius Animada");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.add(new MobiusAnimation());
        frame.setVisible(true);
    }
}
