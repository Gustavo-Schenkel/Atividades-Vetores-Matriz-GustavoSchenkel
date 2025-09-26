package VetorezMatriz;

import java.util.Random;

public class matriz4x4 {
    public static void main(String[] args) {
        Random gerador = new Random(); //Esse objeto gera números aleatorios.
        int[][] tabelaRandom = new int[4][4]; // matriz 4x4 com 16 espaços.



        //laço de repetição que gerará os numeros aleatórios para os 16 espaços da tabela 4x4
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tabelaRandom[i][j] = gerador.nextInt(100);  //  Dentro do for, colocamos o gerador
            }

        }


        // aqui, vamos mostrar ao user a matriz 4x4
        System.out.println("Os numeros sorteados na nossa matriz são:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(tabelaRandom[i][j] + " " );  // print sem "ln", pois queremos os numeros lado a lado
            }
            System.out.println();
        }


        // aqui, vamos mostrar ao user quais numeros foram digitados
        System.out.println("Os numeros na diagonal principal da nossa matriz são:");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print(tabelaRandom[0][0] + " " + tabelaRandom[1][1] + " " +  tabelaRandom[2][2] + " " +  tabelaRandom[3][3]);
            }
            System.out.println();
        }

    }
}


/* O LENDÁRIO DICIONÁRIO DA CODIFICAÇÃO PARA O LEIGO (Gustavo)

BORAAAAAAAAAAAAAAAAAAAAAAAAAA pra mais uma explicação do código para gravar o conteudo.

Começando o código utilizei um objeto chamado random, para randomizar os numeros pelo próprio sistema.
Esse gerador vamos utilizar na nossa matriz, para que os numeros dela sejam randomizados, sem o user ter
que digitar cada um deles.

A linha de código do objeto é: Random gerador = new Random(); <<< Vamos deixar no topo do código, logo abaixo da main.

Partindo para a sequência, vamos gerar a nossa matriz. Neste código foi utilizado a:
int [][] tabelaRandom = new int[4][4]

Essa matriz tem 16 indices (espaços).


Partindo para a explicação do código, vamos para o primeiro laço de repetição de for.

for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tabelaRandom[i][j] = gerador.nextInt(100);
            }
        }

LEMBRE-SE: for (inicialização; condição; incremento)

Nessa condição, vamos colocar os valores gerados pelo sistema dentro de cada espaço da matriz.

tabelaRandom[i][j] = gerador.nextInt(100); Aqui, a linha (i) vai receber um numero aleatório de 0 a 100, a mesma coisa acontece
com a coluna (j), receberá um numero random de 0 a 100, e assim com todos os espaços da tabela.


Certo, seguindo no código, precisamos agora mostrar ao usuário quais numeros foram selecionados pelo sistema
de maneira randomica.

 System.out.println("Os numeros sorteados na nossa matriz são:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(tabelaRandom[i][j] + " " );
            }
            System.out.println();
        }

para isso, nosso laço for vai percorrer a matriz i e j, no caso linha e coluna e vai mostrar ao usuario quais os valores
dos 16 espaços da matriz.


AGORA VAMOS FAZER UM ADICIONAL MUITO LOUCO. Mostrar ao usuário especificamente quais os números na diagonal
principal. COMO CARALHOS vamos fazer isso???!!!

Vamos lá. A primeira parte é digitar um sout informando ao usuário "os números da diagonal principal são:"

Feito isso, vamos colocar os laços for que terão apenas 1 ciclo,( int i = 0; i < 1) para não mostrar várias vezes a mesma resposta.
Agora, vamos mostrar ao usuário quais são esses numeros. Para isso, vamos estudar a matriz 4x4:

                                          01 02 03 04
                                          05 06 07 08
                                          09 10 11 12
                                          13 14 15 16

Esta é uma matriz 4x4. Tem 16 números dentro dela e os valores na diagonal principal são: 01,06,11,16.

A primeira posição não é 1, é 0, pois a matriz tem quatro digitos aleatórios e o indice começa do 0 até o 3, totalizando 4 espaços.
Então vamos analizar essa tabela com as posições de indices.

LEMBRE-SE: matriz é tipo[linha][coluna], onde representamos a linha com "i" e a coluna com "j".


                                          J=0 J=1 J=2 J=3
                                           ↓   ↓   ↓   ↓
                                  I = 0 > 01  02  03  04
                                  I = 1 > 05  06  07  08
                                  I = 2 > 09  10  11  12
                                  I = 3 > 13  14  15  16


Os numeros na diagonal principal estão nos indices:

i, j = 0 > 01
i, j = 1 > 06
i, j = 2 > 11
i, j = 3 > 16

 Agora, vamos mostrar isso ao usuário. Para isso usaremos um sout + tabelaRandom e o valor do indice no array [][].

 System.out.print(tabelaRandom[0][0] + " " + tabelaRandom[1][1] + " " +  tabelaRandom[2][2] + " " +  tabelaRandom[3][3]);

!IMPORTANTE INFORMAÇÃO::::::::::::::::::::::::

Notou que o print do "System.out.print" está sem o "ln"? QUAL A DIFERENÇA?

O ln indica que o print ao usuário será mostrado linha abaixo de linha, e quando está sem o ln, o print será lado a lado.
EX.:

System.out.println("Olá mundo" + valorExemplo)
O que o usuário ve:

Olá mundo
00

--------------------------------------------------------

System.out.print("Olá mundo" + valorExemplo)
O que o usuário ve:

Olá mundo00

ENTENDEU? isso tem que fixar!!!


Fim.



 */