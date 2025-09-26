package VetorezMatriz;

import java.util.Scanner;

public class matrizTransposta {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);  //Scanner para obter valores digitados pelo user.

        int [][] matriz3x2 = new int[3][2]; //Nossa matriz que será transposta
        int [][] matriz2x3 =  new int[2][3]; //Matriz transpostada


        //Criando a primeira matriz
        System.out.println("Digite os valores da matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matriz3x2[i][j] = sc.nextInt();
            }
        }

//agora, vamos mostrar ao user quais são as duas matrizes.
        System.out.println("A matriz 3x2 montada é:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz3x2[i][j] + " ");
            }
            System.out.println();
        }
//agora vamos realizar a transposição de valores das matrizes.
        //Se na original o número está em (linha=2, coluna=1), na transposta ele vai para (linha=1, coluna=2).
       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 2; j++) {
               matriz2x3[j][i] = matriz3x2[i][j];
           }
       }
//Aqui, vamos mostrara ao user a matriz transposta.
        System.out.println("Realizando a transposição da matriz 3x2 para a 2x3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz2x3[i][j] + " ");
            }
            System.out.println();
        }
sc.close();
    }
}
/* O LENDÁRIO DICIONÁRIO DA CODIFICAÇÃO PARA O LEIGO (Gustavo)

Bom, começamos solicitando para que o user digite os valores, claro, colocamos um Scanner no topo do código e também criamos duas váriaveis

        int [][] matriz3x2 = new int[3][2];
        int [][] matriz2x3 =  new int[2][3];

        Como vamos trocar os valores da linha pela coluna, na logica já imaginei que criariamos duas matrizes.

        Vamos solicitar os digitos da primeira matriz com um clássico laço for:

        System.out.println("A matriz 3x2 montada é:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz3x2[i][j] + " ");
            }
            System.out.println();
        }

     Agora, vamos digitar os valores da outra matriz, a 2x3.

System.out.println("A matriz 3x2 montada é:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz3x2[i][j] + " ");
            }
            System.out.println();
        }


        Para realizar a troca de valores, vamos com um laço for bem simples, onde faremos basicamente isso:

        LINHA / COLUNA
        COLUNA / LINHA

       Precisamos que a linha e coluna da matriz 3x2 se torne respectivamente coluna / linha. Vamos a um exemplo:
       3X2              2X3
       ---              ---
       1 2    >>>>>>   1 2 3
       3 4    >>>>>>   4 5 6
       5 6

        Vamos então ao laço for
         for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 2; j++) {
               matriz2x3[j][i] = matriz3x2[i][j];
           }
       }


Notou que nós queremos que a coluna da matriz 2x3 tenha os valores linhas da 3x2 e queremos que as linhas da 2x3 tenham os
valores das colunas da 3x2.

Assim invertemos os valores, agora solicitaremos que essa tabela seja mostrada ao user


  System.out.println("Realizando a transposição da matriz 3x2 para a 2x3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz2x3[i][j] + " ");
            }
            System.out.println();
        }



        fim.
 */