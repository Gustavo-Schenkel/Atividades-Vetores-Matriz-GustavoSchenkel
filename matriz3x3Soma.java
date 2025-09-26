package VetorezMatriz;

import java.util.Scanner;

public class matriz3x3Soma {
    public static void main(String[] args) {
        //Scanner para ler o que o user digitar.
        Scanner sc = new Scanner(System.in);

        //Aqui, nossa matriz de marcas de carros.
        int[][] numeros = new int[3][3];


        System.out.println("VAMOS COLOCAR VALORES EM MATRIZ E REALIZAR A SOMA");
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite os números");// quando da o ciclo de 3, repete a frase.
            for (int j = 0; j < 3; j++) {
                numeros[i][j] = sc.nextInt();
            }
        }

    //mostra ao user quais são os valores digitados e como estão discriminados na matriz.
        System.out.println("Os valores digitados são:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

     //A PARTIR DE AGORA, REALIZAREMOS AS OPERAÇÕES DE SOMA DOS VALORES DENTRO DAS LINHAS E COLUNAS

        System.out.println("Agora, vamos realizar a soma desses valores, primeiro das Linhas");
        for (int i = 0; i < 3; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 3; j++) {
                somaLinha += numeros[i][j];     //Ou, pode ser somaLinha = somaLinha + numeros[i][j];
            }
            System.out.println("Soma da linha " + i + " = " + somaLinha);
        }

        System.out.println("Agora, vamos realizar a soma das colunas");
        for (int j = 0; j < 3; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 3; i++) {
                somaColuna += numeros[i][j];
            }
            System.out.println("Soma da coluna " + j + " = " + somaColuna);//Ou, pode ser somaColuna = somaColuna + numeros[i][j];
        }
        sc.close();
    }
}

/* O LENDÁRIO DICIONÁRIO DA CODIFICAÇÃO PARA O LEIGO (Gustavo)

Neste código você já sabe tudo, pelo menos foi explicado nos outros episódios do dicionário,
então, vamos pular pro fundo do poço de uma vez e explicar como realizar a soma dos valores
da matriz.

Vamos iniciar o código da soma com um laço for que vai percorrer a linha e coluna e nas linhas, fará a soma.
Começamos naquele jeito:

LEMBRE-SE: for (inicialização; condição; incremento++)

        for (int i = 0; i < 3; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 3; j++) {
                somaLinha += numeros[i][j];
            }
            System.out.println("Soma da linha " + i + " = " + somaLinha);
         }

"int somaLinha = 0;" é uma variável contadora que indica posições dentro do laço. O valor começa em 0.

"somaLinha += numeros[i][j];" é a operação de soma. Esta linha de código está abreviada, ela também
pode ser escrita assim:

somaLinha = numeros[i][j] + somaLinha; x 3, pois o laço gira 3 vezes.


O que esse laço for faz, é pegar o primeiro valor da linha 0, soma com 0 (pois é o primeiro valor da variavel somarLinha),
guarda esse valor na variavel somarLinha, repete o processo com o valor que está no segundo espaço e soma com o resultado guardado na somarLinha e novamente pega o resultado
e soma com o ultimo valor da linha. Vamos a um exemplo de matriz digitada pelo usuário:

                          LINHA I = 0 > 1,2,3
                          LINHA I = 1 > 4,5,6
                          LINHA I = 2 > 7,8,9


LINHA 0 possui 1,2,3
somarLinha = 0 (+ 1) > salva 1 em somaLinha = 1
somarLinha = 1 (+ 2) > salva 3 em somaLinha = 3
somarLinha = 3 (+ 3) > salva 6 em somaLinha = 6

fechou a primeira linha e fez o primeiro laço do for, logo, vamos incrementar i++ e partir para o próximo ciclo.

LINHA 1 possui 4,5,6
somarLinha = 0 (+ 4) > salva 4 em somaLinha = 4
somarLinha = 4 (+ 5) > salva 9 em somaLinha = 9
somarLinha = 9 (+ 6) > salva 15 em somaLinha = 15
fechou a segunda linha e fez o segundo laço do for, logo, vamos incrementar i++ e partir para o próximo ciclo.


LINHA 2 possui 7,8,9
somarLinha = 0 (+ 7) > salva 7 em somaLinha = 7
somarLinha = 7 (+ 8) > salva 15 em somaLinha = 15
somarLinha = 15 (+ 9) > salva 15 em somaLinha = 24
fechou a terceira linha e finalizou os 3 laços do for, agora não incrementa mais.

Agora, cada linha possui o valor total da soma dos numeros em somaLinha.

Para fazer com as colunas, o processo é semelhante.

No primeiro laço for, começamos com i, onde fixamos ele para descobrir seus valores e utilziamos
o for j para percorrer o laço buscando os valores da linha.

No segundo laço for, vamos começar pelo j, fixando ele para descobrir seus valores e utilizando o i para
percorrer o laço buscando pelos valores da coluna.

IMAGINAMOS for i primeiro:
                                          1,2,3
                                          4,5,6
                                          7,8,9


 PRIMEIRO SELECIONAMOS A PRIMEIRA LINHA >>>>>  1,2,3


COM A LINHA TRAVADA, UTILIZAMOS AS COLUNAS PARA ENCONTRAR OS NUMEROS:

    COLUNA(0) > ACHOU? PULA PARA > COLUNA(1) > ACHOU? PULA PARA > COLUNA(3).
      1                              2                              3

 Encontrando os valores desta linha, pulamos para a segunda linha.


 Agora, fazemos o contrario para achar os valores das colunas, utilizamos o for j primeiro;

 PRIMEIRO SELECIONAMOS A PRIMEIRA COLUNA >>>>>  1,4,7

 COM A COLUNA TRAVADA, UTILIZAMOS AS LINHAS PARA ENCONTRAR OS NUMEROS:

 LINHA(0) > ACHOU? PULA PARA > LINHA(1) > ACHOU? PULA PARA > LINHA(3).
      1                              4                              7

 Encontrando os valores desta coluna, pulamos para a segunda e assim por diante.

 FIM

 */