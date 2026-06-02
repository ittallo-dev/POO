# Relatório de Git e GitHub

**Tema:** criação e clonagem de repositórios, edição de conteúdo, criação e alteração de ramo (*branch*).

Este relatório apresenta, de forma direta e objetiva, o fluxo básico de trabalho com Git e GitHub. O processo envolve criar um repositório remoto, editar arquivos, registrar alterações com *commits*, criar branches e clonar o projeto para edição local no VS Code.

## Visão geral dos processos

| Processo | Ferramenta | Resultado esperado |
|---|---|---|
| Criação do repositório | GitHub | Projeto criado com nome, descrição e estrutura inicial. |
| Edição de conteúdo | GitHub / VS Code | Arquivos modificados e salvos no repositório. |
| Criação de commit | GitHub / Git | Alterações registradas no histórico do projeto. |
| Criação e troca de branch | GitHub / Git | Ramo separado para testes, ajustes ou novas versões. |
| Clonagem | VS Code / Git | Cópia local do repositório para edição no computador. |

---

## Criação do repositório no GitHub

A criação de um repositório começa na tela **New repository** do GitHub. Nessa etapa são definidos o nome do projeto, a descrição, o proprietário, a visibilidade e as configurações iniciais, como a criação de um arquivo `README.md`.

Esse repositório passa a funcionar como o ponto central do projeto. Nele ficam armazenados os arquivos, o histórico de alterações, os commits, as branches e possíveis contribuições futuras.

**Etapas principais:**

1. Acessar a opção de criação de novo repositório no GitHub.
2. Definir um nome claro para o projeto.
3. Adicionar uma descrição objetiva.
4. Escolher se o repositório será público ou privado.
5. Criar ou adicionar um `README.md` para documentar o projeto.
6. Confirmar a criação do repositório.

<table>
<tr>
<td width="50%">
<img src="imagens/image1.png" alt="Tela de criação de um novo repositório no GitHub"><br>
<strong>Imagem 1:</strong> tela de criação de um novo repositório.
</td>
<td width="50%">
<img src="imagens/image2.png" alt="Repositório criado no GitHub"><br>
<strong>Imagem 2:</strong> repositório criado com estrutura inicial.
</td>
</tr>
</table>

Após a criação, o GitHub exibe a página principal do repositório. A partir dela é possível adicionar arquivos, editar conteúdo, visualizar commits e acessar as opções de branch.

<table>
<tr>
<td width="50%">
<img src="imagens/image3.png" alt="Área de envio de arquivo no GitHub"><br>
<strong>Imagem 3:</strong> área para adicionar arquivos ao repositório.
</td>
<td width="50%">
<img src="imagens/image4.png" alt="Commit de novo arquivo no GitHub"><br>
<strong>Imagem 4:</strong> envio de arquivo com mensagem de commit.
</td>
</tr>
</table>

---

## Edição de conteúdo no GitHub

A edição de arquivos pode ser feita diretamente pelo GitHub quando a alteração é simples. O usuário abre o arquivo, acessa o editor web, modifica o conteúdo e registra a mudança por meio de um commit.

O commit é o registro oficial da alteração. Ele funciona como uma marca no histórico do projeto, indicando o que foi modificado e quando a modificação foi feita.

**Etapas principais:**

1. Abrir o arquivo desejado no repositório.
2. Acessar a opção de edição.
3. Modificar o conteúdo no editor web.
4. Escrever uma mensagem curta e clara para o commit.
5. Confirmar a alteração na branch selecionada.

<table>
<tr>
<td width="50%">
<img src="imagens/image5.png" alt="Arquivo aberto no editor web do GitHub"><br>
<strong>Imagem 5:</strong> arquivo aberto no editor do GitHub.
</td>
<td width="50%">
<img src="imagens/image6.png" alt="Conteúdo alterado no GitHub"><br>
<strong>Imagem 6:</strong> conteúdo alterado antes da confirmação.
</td>
</tr>
</table>

<table>
<tr>
<td width="50%">
<img src="imagens/image7.png" alt="Janela de commit no GitHub"><br>
<strong>Imagem 7:</strong> janela de commit com mensagem e descrição.
</td>
<td width="50%">
<img src="imagens/image8.png" alt="Confirmação de alteração no GitHub"><br>
<strong>Imagem 8:</strong> confirmação da alteração no repositório.
</td>
</tr>
</table>

Uma boa mensagem de commit facilita a leitura do histórico. Em vez de registrar mudanças genéricas, o ideal é usar descrições objetivas, como `Adiciona README inicial`, `Corrige texto da página inicial` ou `Atualiza arquivo de exemplo`.

<table>
<tr>
<td width="50%">
<img src="imagens/image9.png" alt="Alteração registrada no repositório"><br>
<strong>Imagem 9:</strong> alteração registrada no histórico do repositório.
</td>
<td width="50%">
<img src="imagens/image10.png" alt="Nova edição com commit"><br>
<strong>Imagem 10:</strong> nova edição antes de registrar outro commit.
</td>
</tr>
</table>

---

## Criação e alteração de branch

Uma **branch** é um ramo separado do projeto. Ela permite desenvolver alterações sem modificar diretamente a branch principal. Esse recurso é útil para testar ideias, corrigir erros, criar novas funcionalidades e organizar versões diferentes do mesmo projeto.

Ao criar uma branch, o conteúdo da branch principal é copiado para um novo ramo. Depois disso, as mudanças feitas nesse ramo ficam separadas até que sejam comparadas ou integradas novamente.

**Etapas principais:**

1. Acessar a área de branches do repositório.
2. Criar uma nova branch a partir da branch principal.
3. Selecionar a branch desejada antes de editar arquivos.
4. Fazer alterações e commits dentro dessa branch.
5. Comparar ou integrar as mudanças quando estiverem prontas.

<table>
<tr>
<td width="50%">
<img src="imagens/image11.png" alt="Tela de branches no GitHub"><br>
<strong>Imagem 11:</strong> tela de branches do repositório.
</td>
<td width="50%">
<img src="imagens/image12.png" alt="Criação de nova branch"><br>
<strong>Imagem 12:</strong> criação de nova branch a partir da principal.
</td>
</tr>
</table>

<table>
<tr>
<td width="50%">
<img src="imagens/image13.png" alt="Lista de branches"><br>
<strong>Imagem 13:</strong> lista de branches após a criação do novo ramo.
</td>
<td width="50%">
<img src="imagens/image14.png" alt="Branch selecionada no repositório"><br>
<strong>Imagem 14:</strong> repositório com uma branch selecionada.
</td>
</tr>
</table>

A troca de branch permite escolher em qual versão do projeto o usuário deseja trabalhar. Assim, alterações experimentais podem ser feitas em um ramo separado, mantendo a branch principal mais estável.

<table>
<tr>
<td width="50%">
<img src="imagens/image15.png" alt="Menu de troca de branch"><br>
<strong>Imagem 15:</strong> menu usado para alternar entre branches.
</td>
<td width="50%">
<img src="imagens/image16.png" alt="Histórico da branch"><br>
<strong>Imagem 16:</strong> branch com alterações disponíveis no histórico.
</td>
</tr>
</table>

Quando as alterações feitas na branch estiverem prontas, elas podem ser comparadas com a branch principal. Esse processo ajuda a revisar o que mudou antes de integrar o conteúdo ao projeto principal.

<table>
<tr>
<td width="50%">
<img src="imagens/image17.png" alt="Comparação entre branches"><br>
<strong>Imagem 17:</strong> comparação ou integração de alterações entre branches.
</td>
<td width="50%">
<img src="imagens/image18.png" alt="Comandos de branch no terminal"><br>
<strong>Imagem 18:</strong> comandos locais relacionados ao uso de branch.
</td>
</tr>
</table>

---

## Clonagem do repositório no VS Code

Clonar um repositório significa criar uma cópia local do projeto. Com isso, os arquivos hospedados no GitHub passam a existir também no computador do usuário, podendo ser editados pelo VS Code ou por outro editor.

Depois da clonagem, o trabalho local segue o fluxo comum do Git: editar arquivos, verificar alterações, registrar commits e enviar as mudanças de volta ao GitHub com `push`.

**Etapas principais:**

1. Copiar a URL do repositório no GitHub.
2. Abrir o VS Code.
3. Escolher a opção de clonar repositório.
4. Informar a URL do repositório remoto.
5. Selecionar uma pasta local para salvar o projeto.
6. Abrir o projeto clonado no editor.

<table>
<tr>
<td width="50%">
<img src="imagens/image19.png" alt="VS Code antes da clonagem"><br>
<strong>Imagem 19:</strong> VS Code aberto para iniciar a clonagem.
</td>
<td width="50%">
<img src="imagens/image20.png" alt="Comando de clonagem no VS Code"><br>
<strong>Imagem 20:</strong> comando de clonagem com seleção do repositório.
</td>
</tr>
</table>

<table>
<tr>
<td width="50%">
<img src="imagens/image21.png" alt="Projeto aberto no VS Code"><br>
<strong>Imagem 21:</strong> projeto aberto localmente após a clonagem.
</td>
<td width="50%">
<img src="imagens/image22.png" alt="Terminal mostrando processo Git"><br>
<strong>Imagem 22:</strong> terminal exibindo informações do Git.
</td>
</tr>
</table>

Com o projeto aberto no VS Code, o usuário pode alterar arquivos, acompanhar mudanças pelo controle de código-fonte e executar comandos Git pelo terminal integrado.

<table>
<tr>
<td width="50%">
<img src="imagens/image23.png" alt="Código sendo editado no VS Code"><br>
<strong>Imagem 23:</strong> código sendo editado no VS Code.
</td>
<td width="50%">
<img src="imagens/image24.png" alt="Terminal do VS Code com comandos Git"><br>
<strong>Imagem 24:</strong> terminal do VS Code com comandos Git executados.
</td>
</tr>
</table>

---

## Fluxo resumido

O fluxo completo apresentado nas imagens pode ser resumido da seguinte forma:

1. Criar o repositório no GitHub.
2. Adicionar ou editar arquivos no repositório remoto.
3. Registrar as mudanças usando commits.
4. Criar uma branch para separar alterações específicas.
5. Clonar o repositório no VS Code.
6. Editar os arquivos no computador.
7. Usar comandos Git para controlar as versões.
8. Enviar as alterações ao GitHub.

| Etapa | Ação | Finalidade |
|---|---|---|
| 1 | Criar repositório | Iniciar o projeto no GitHub. |
| 2 | Clonar | Trazer o projeto para o computador. |
| 3 | Editar | Modificar arquivos do projeto. |
| 4 | Commitar | Registrar alterações no histórico. |
| 5 | Criar/usar branch | Separar mudanças da branch principal. |
| 6 | Enviar alterações | Atualizar o repositório remoto. |

O Git e GitHub permitem trabalhar com versões de forma mais segura, rastreável e organizada, evitando práticas confusas como múltiplas cópias manuais do mesmo projeto.
