package VetorezMatriz;

import java.util.Arrays;
import java.util.Scanner;
public class matriz3x3 {
public static void main(String[] args) {
        //Scanner para ler o que o user digitar.
        Scanner sc = new Scanner(System.in);

        //Aqui, nossa matriz de marcas de carros.
        String[][] marcaCarros = new String[3][3];

    System.out.println("VAMOS COLOCAR MARCAS DE CARROS EM UMA MATRIZ");

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite três marcas de carros.");// quando da o ciclo de 3, repete a frase.
            for (int j = 0; j < 3; j++) {
                marcaCarros[i][j] = sc.next();
            }
        }

            System.out.println("As marcas automotivas digitadas são:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(marcaCarros[i][j] + " ");
                }
                System.out.println();
            }
sc.close();
        }
    }


    /* O LENDÁRIO DICIONÁRIO DA CODIFICAÇÃO PARA O LEIGO (Gustavo)

   Padrão FIFA que você já sabe, começamos o código com Scanner sc = new(Scanner.in); para escanear
   o que o user digitar.

   Agora vamos trabalhar com matriz, que é basicamente um adicional do vetor, onde além de trabalhar com linhas, passamos
   a trabalhar com colunas.

   Para declarar uma matriz, você vai fazer quase como um vetor, adicionando um array a mais e na parte
   to new tipo [][] você declara o valor do array. ex.:

   tipo [][] nome = new tipo [tamanhoLinha][tamanhoColuna];
    int [][] valorSalario = new int [3][3];

   Lembrando sempre que o primeiro array é relacionado ao tamanho de armazenamento da linha e o segundo
   é do tamanho de armazenamento das colunas.


!IMPORTANTE INFORMAÇÃO LOGO A BAIXO:::::::::::::::::::::::::::::::::::

   Se para acessar as informações do primeiro array em um vetor [] utilizamos o laço de repetição "for", como
   vamos acessar mais um []???

   UÉ, UTILIZANDO MAIS UM LAÇO FOR, ÓBVIO KKKKKKK  ;-)

   Para o array de linha, utilizamos um for e dentro dele, puxamos outro for para percorrer o array de coluna, da seguinte
   maneira:

       for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                nomeArray[i][j] = sc.next();
            }
       }

!IMPORTANTE INFORMAÇÃO LOGO A CIMA:::::::::::::::::::::::::::::::::::


  Neste código, vamos pedir ao usuário que digite algumas marcas de carros. Nossa tabela será de 9 nomes,
  nesse caso, 3 linhas e 3 colunas.

  String [][] marcaCarros = new String[3][3];

  Agora, vamos pedir para o usuário digitar esses nomes, começamos com um laço for,

LEMBRE-SE: for (inicialização; condição; incremento)

for (int i = 0; i < 3; i++) {
            System.out.println("Digite três marcas de carros.");// quando da o ciclo de 3, repete a frase.
            for (int j = 0; j < 3; j++) {
                marcaCarros[i][j] = sc.next();
            }
        }

Basicamente, no primeiro for, vamos iniciar uma contagem onde começa com o SOUT. Cada linha seria digitado 3 nomes em sequencia.
Digitado os 3 nomes ele reinicia e pula para outra linha, novamente pedindo mais 3 nomes.

No outro for, cada vez que o user digita um nome e o mesmo completa um espaço na coluna, ele realiza
o armazenamento dentro do: marcaCarros[i][j] = sc.next();


Na ultima parte do código nós solicitamos que o sistema mostre quais foram os valores digitados pelo user,
com:     System.out.print(marcaCarros[i][j] + " "); no ultimo for.


Fácil, FIM.
     */