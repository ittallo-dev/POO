import java.util.Scanner;
//Use cinco funções que: contenham o número PI, use arredondamento, use trigonometria, use potenciação ou logaritmo.//
public class Calculation
{
    public static void main (String[] argus)
  {
    Scanner scanum = new Scanner(System.in);
    Scanner scandois = new Scanner(System.in);
    Scanner scantres = new Scanner(System.in);
    Scanner scanquatro = new Scanner(System.in);
    Scanner scancinco = new Scanner(System.in);
    int reset;
    do{
    System.out.println("Escolha UMA das operações à seguir:\n\n'1' - Circunferência\n'2' - Circunferência-Arredondada\n'3' - Área\n'4' - Área-Arredondada\n'5' - Relação Seno\n'6' - Distância entre dois pontos\n\nOperação selecionada:");
    int operation = scanum.nextInt();
    if (operation==6){
        System.out.println("Digite o valor de X & depois o valor de Y:");
        double X = scantres.nextDouble();
	System.out.println("Valor de X: "+X);
        double Y = scanquatro.nextDouble();
	System.out.println("Valor de Y: "+Y);
        Operação.Distância(X,Y);
    }else if(operation>6 || operation<0){
	System.out.println("\nOperação inválida, reinicie o programa!");
	return;
    }
                     else{
                         System.out.println("Digite um número para a operação:");
                         double number = scandois.nextDouble();
                         switch (operation){
                         case 1: Operação.Circunferencia(number);break;
                         case 2: Operação.Circunferencia_Arredondada(number);break;
                         case 3: Operação.Area(number);break;
                         case 4: Operação.Area_Arredondada(number);break;
                         case 5: Operação.Relação_Seno(number);break;
                                          }
                         }                
      System.out.println("Deseja realizar outra operação?\n'1' - SIM\n'2' - NÃO");
      reset = scancinco.nextInt();
      }
      while(reset==1);
      System.out.println("Cálculos finalizados.");
  }
  class Operação
  {
    public static void Circunferencia (double raio){
        double resultado = 2 * Math.PI * raio;
        System.out.println("Circunferência: C = 2\u00B7\u03C0\u00B7r");
        System.out.println("Resultado: " +resultado);
       }
    public static void Circunferencia_Arredondada (double raio){
        double resultado = Math.round(2 * Math.PI * raio);
        System.out.println("Resultado Arredondado: " +resultado);
       }
    public static void Area (double raio){
        double resultado = Math.PI * Math.pow(raio, 2);
        System.out.println("Área do Circulo: A = \u03C0\u00B7r\u00B2");
        System.out.println("Resultado: " +resultado);
       }

    public static void Area_Arredondada (double raio){
        double resultado = Math.round(Math.PI * Math.pow(raio, 2));
        System.out.println("Resultado Arredondado: " +resultado);
       }
    public static void Relação_Seno (double ângulo){
        double resultado = Math.sin(ângulo);
        System.out.println("Relação Seno: Sin(\u03B8) = Cateto Oposto/Hipotenusa");
        System.out.println("Resultado: " +resultado);
       }
    public static void Distância (double x, double y){
        double resultado = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.println("Distância entre dois pontos: Dxy = \u221A((x\u2082 - x\u2081)\u00B2 + (y\u2082 - y\u2081)\u00B2)");
        System.out.println("Resultado: " +resultado);
       }
  }
}
