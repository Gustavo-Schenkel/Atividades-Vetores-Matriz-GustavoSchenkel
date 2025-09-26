package VetorezMatriz;
import java.util.Random;
import java.util.Scanner;

public class BatalhaNaval7X7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Escanear o que o user digitar.
        Random naviosEscondidos = new Random(); //Randomizador da posição que os navios vão estar.

        int [][] mapaMaritimo = new int[7][7];  //Matriz de 49 posições.
        int naviosAleatorios = 3; // quantidade de navios aleatórios.

//------------------------------------------------------------------------------------------------

// Neste laço for, vamos sortear as posições onde 3 navios aleatórios vão ficar
        for (int i = 0; i < naviosAleatorios; i++) {

            int linha, coluna; //CRIAMOS a variável linha e coluna para anexar 7 posições, 0 a 6, onde poderão ir os navios escondidos


            //Nesse laço for, quando começamos o laço, dizemos que cada linha ou coluna pode ter um navio escondido
            do {
                linha = naviosEscondidos.nextInt(7);
                coluna = naviosEscondidos.nextInt(7);
            }
            while (mapaMaritimo[linha][coluna] == 1); // impede de repetir a posicao do navio

            mapaMaritimo[linha][coluna] = 1; // marca navio na matriz
        }
//------------------------------------------------------------------------------------------------

        int naviosEncontrados = 0;

        // Enquanto não achar os 3 navios, continua jogando e repetindo o laço while.
        while (naviosEncontrados < naviosAleatorios) {
            System.out.println("Digite uma linha (0 > 6): ");
            int linha = sc.nextInt();
            System.out.println("Digite uma coluna (0 > 6): ");
            int coluna = sc.nextInt();


            if (mapaMaritimo[linha][coluna] == 1) {

                System.out.println("Você acertou um navio, muito bem!");

                mapaMaritimo[linha][coluna] -= 1; // QUANDO UM NAVIO É ENCONTRADO, DIMINUI A QUANTIDADE.
                naviosEncontrados++;
            } else {
                System.out.println("Água... tente de novo.");
            }

            // Aqui, utilizarei um sout para mostrar quais navios foram encontrados / quantos ainda restam.

            System.out.println("Navios encontrados até agora: " + naviosEncontrados + "/" + naviosAleatorios);
        }
 //------------------------------------------------------------------------------------------------
//Após encontrar todos os navios, um sout para parabenizar a vitoria e lembrando de dar sc.close.
        System.out.println("Parabéns! Você encontrou todos os navios!");
        sc.close();
    }
}

/* O LENDÁRIO DICIONÁRIO DA CODIFICAÇÃO PARA O LEIGO (Gustavo)

Primeiro vamos analisar a proposta. Precisamos criar um jogo de batalha naval.

Basicamente, haverá navios escondidos e nós devemos acertar onde está a posição desses navios.

O navio precisa ser gerado aleatóriamente e o jogo precisa estar dentro de um laço de repetição  WHILE, para que
só acabe quando o usuário encontrar todos os navios. Então já sabemos que precisa criar uma variavel RANDOM e outra de navios (obvio kkkk)
Além do Scanner para escanear o valor da linha e coluna que o user digitar para tentar achar o navio E TAMBÉM o mapa de 7x7 com 49 posições.



        Scanner sc = new Scanner(System.in); //Escanear o que o user digitar.
        Random naviosEscondidos = new Random(); //Randomizador da posição que os navios vão estar.

        int [][] mapaMaritimo = new int[7][7];  //Matriz de 49 posições.
        int naviosAleatorios = 3; // quantidade de navios aleatórios.


Agora começaremos o jogo settando as posições onde os 3 navios irão entrar na tabela. Lembrando que eles precisam ser anexados
em alguma posição de maneira ALEATÓRIA, com o random.

Para isso, vamos utilizar o FOR.

for (int i = 0; i < naviosAleatorios; i++) {
            int linha, coluna;
            do {
                linha = naviosEscondidos.nextInt(7);
                coluna = naviosEscondidos.nextInt(7);
            }
            while (mapaMaritimo[linha][coluna] == 1); // impede de repetir a posicao do navio
            mapaMaritimo[linha][coluna] = 1; // marca navio na matriz
            }

Nesse laço, inicializamos a partir da posição 0. As posições podem receber 3 marcações que são da variável naviosAleatórios.

Agora, dentro do for externo (o primeiro for dos dois que terá nesse bloco de código) nós vamos criar duas variáveis contadoras,
a LINHA E COLUNA.

Agora, a variavel LINHA e COLUNA podem receber 3 navios escondidos aleatóriamente nas suas 7 posições, que vão de 0 a 6.

Não queremos bugar o código "matando 2 coelhos com uma cajadada só", não queremos que 2 navios estejam na mesma posição, então
vamos criar um metodo while para impedir que ENQUANTO tenha um navio na posição, não venha um segundo.

suponhamos que o user digite linha = 0 coluna = 1


            while (mapaMaritimo[linha][coluna] == 1); >>>> PODE RECEBER APENAS 1 NAVIO, APÓS SER ENCONTRADO, NÃO RECEBE MAIS.
            mapaMaritimo[linha][coluna] = 1;


Basicamente: enquanto mapaMaritimo[0][1] == 1 (tem um navio nessa posição supostamente. Recebe apenas 1 navio.).


Agora, utilizaremos mapaMaritimo[linha][coluna] = 1; para marcar um indice na matriz 7x7.


-------------------------------------------------------------------------------------------------------

A primeira parte de como gerar navios aleatórios está feita, agora precisamos configurar a condição de vitória. O que acontece
quando o user ENCONTRA OS NAVIOS.

Começamos com zero navios encontrados e precisamos acumular 3. Esta é a condição de vitória, então vamos criar uma váriavel contadora
dos navios encontrados.

        int naviosEncontrados = 0;


Enquanto não forem encontrados 3 navios, o jogo deve continuar. São 46 espaços com + 3 posições anexadas com navios, então precisamos que o jogo
continue, logo utilizaremos o WHILE

Aqui é lógico, enquanto: a quantidade de navios encontrados for menor que a quantidade de navios aleatórios, então o jogo continua.

            while (naviosEncontrados < naviosAleatorios) {
---------------------------------------------------------------------------------
            System.out.println("Digite uma linha (0 > 6): ");                    |
            int linha = sc.nextInt();                                            |> Nesta parte, o user digita as posições das linhas, são 7 opções
            System.out.println("Digite uma coluna (0 > 6): ");                   |> Nesta parte, o user digita as posições das Colunas, são 7 opções
            int coluna = sc.nextInt();                                           |
---------------------------------------------------------------------------------
Após digitar a linha, o sistema lê o que o user digitou com o Scanner
Após digitar a Coluna, o sistema lê o que o user digitou com o Scanner


---------------------------------------------------------------------------------
            if (mapaMaritimo[linha][coluna] == 1) {                             | Se na posição que você escolheu ter 1 navio, printa o SOUT
                System.out.println("Você acertou um navio, muito bem!");        |
-------------------------------------------------------------------------------->>>                                                                                |
                mapaMaritimo[linha][coluna] -= 1;                               | Após ser encontrado, diminui um navioAleatorio e
                naviosEncontrados++;                                            | incrementa a quantidade de naviosEncontrados.
---------------------------------------------------------------------------------

Se um navio não for encontrado, como está no laço ENQUANDO, o jogo continua e lança um sout.
            } else {
                System.out.println("Água... tente de novo.");
            }

Após o sistema validar a sua jogada, independente de você ter encontrado ou nao um navio, ele vai lançar um sout da quantidade
de navios encontrados e de navios aleatorios restantes:

            System.out.println("Navios encontrados até agora: " + naviosEncontrados + "/" + naviosAleatorios);
        }
AQUI, FINALIZA O WHILE.

Finalizamos o while, que está dentro do laço for, então ainda tem código pela frente. Lembrando o que é o for:
for (int i = 0; i < naviosAleatorios; i++)


Cada vez que encontramos um navioAleatorio, seu valor diminui, então, ao chegar em zero, o jogo finaliza e termina o laço for com
um sout de vitoria.


fim.

 */

