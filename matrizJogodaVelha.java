package VetorezMatriz;
import java.util.Scanner;

public class matrizJogodaVelha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scan do valor digitado pelo user
        char [][] jogoDaVelha = new char [3][3]; // matriz 3x3 que servirá como tabuleiro do nosso jogo da velha

//Aqui, começa o titulo de nosso codigo (Voltado aqui e adicionado a função mostrarTabuleiroMarcado) após criar.
        System.out.println("*****VAMOS JOGAR O JOGO DA VELHA!*****");
        System.out.println(" ");
        System.out.println("INSTRUÇÕES: Para jogar, basta digitar o primeiro numero referênte a linha e o segundo número referênte a coluna.");
        System.out.println("As linhas e colunas vão de 0 a 2, totalizando 3 números em cada.");
        System.out.println(" ");
        mostrarTabuleiroMarcado(jogoDaVelha);




// Agora, precisamos que o jogador marque com X uma linha ou coluna
        System.out.println(" ");
        System.out.println("Selecione e posicione o X em uma das casas");
        int linhaX = sc.nextInt();
        int colunaX = sc.nextInt();
        jogoDaVelha[linhaX][colunaX] = 'X';

        System.out.println("Tabuleiro após o jogador ter selecionado a casa do X"); // Aqui, mostraremos ao jogador qual casa ficou marcada com o X
        mostrarTabuleiroMarcado(jogoDaVelha);




// Seleção da casa do 0
        System.out.println(" ");
        System.out.println("Selecione e posicione o O em uma das casas");
        int linhaO = sc.nextInt();
        int colunaO = sc.nextInt();
        jogoDaVelha[linhaO][colunaO] = 'O';

        System.out.println("Tabuleiro após jogada do O:"); // Aqui, mostraremos ao jogador qual casa ficou marcada com o 0
        mostrarTabuleiroMarcado(jogoDaVelha);


//A lógica inicial está feita, o objetivo é mostrar que é possivel marcar as casas com dados que o próprio usuário decide.
        sc.close();
    }


//aqui, criamos uma função a parte, que é a de mostrar o tabuleiro marcado ao usuário.
    public static void mostrarTabuleiroMarcado(char [][] jogoDaVelha) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(jogoDaVelha[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/* O LENDÁRIO DICIONÁRIO DA CODIFICAÇÃO PARA O LEIGO (Gustavo)

No começo do código, vamos utilizar um Scanner. Esse scanner vai pegar os valores que o usuário digitar.
Agora, vamos criar o tabuleiro de jogo da velha, que nada mais é que um tabuleiro 3x3 de 9 espaços.

                        char [][] jogoDaVelha = new char [3][3];


Em seguida, vamos pedir através de sout's para que o usuário digite um espaço na tabela. Mas antes de tudo,
precisamos criar uma função, que será a de mostrar o tabuleiro preenchido logo após o usuário preencher um local.
Esse tabuleiro precisa ser preenchido e mostrado ao usuário qual espaço foi marcado.


Para isso, vamos criar uma função através do public static void.

A função chama-se mostrarTabuleiroMarcado e dentro dela vamos chamar a variavel e array.

              public static void mostrarTabuleiroMarcado(char [][] jogoDaVelha)

Agora, vamos dar a função com um laço for, para que sempre que solicitada, a função mostre o tabuleiro já atualizado.

public static void mostrarTabuleiroMarcado(char [][] jogoDaVelha) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(jogoDaVelha[i][j] + " ");
            }
            System.out.println();
        }
    }

Bem simples, um laço for de 3 ciclos onde mostra a tabela com o sout.


Voltando ao começo do código, vamos explicar como funciona o jogo ao user, que é para digitar 1 numero referente a linha e
outro referente a coluna. Após isso solicitamos a função criada mostrarTabuleiroMarcado.

Agora começa o jogo, primeiro vamos solicitar que marque o X

 System.out.println(" ");
        System.out.println("Selecione e posicione o X em uma das casas");
        int linhaX = sc.nextInt();
        int colunaX = sc.nextInt();
        jogoDaVelha[linhaX][colunaX] = 'X';

        System.out.println("Tabuleiro após o jogador ter selecionado a casa do X");


        Criamos a variavel linhaX e colunaX e vamos transformar em um contador de posição. O valor que será
        marcado dentro dela é referente a linha e coluna que o user selecionar

        Agora, vamos colocar essas variaveis contadoras dentro do array jogoDaVelha. Agora, quando o user digitar
        o numero referente a linha e outro a coluna, a posição no tabuleiro será marcada com X

        jogoDaVelha[linhaX][colunaX] = 'X';

        Essa mesma logica utilizamos com o 0, É só repetir o codigo.

        Após cada jogada, solicitamos a função mostrarTabuleiroMarcado, para mostrar a posição marcada.

        A parte logica básica é essa, basta incrementar esse jogo ;-) (futuro desenvolvimento)

        FIMMMM
 */