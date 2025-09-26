package VetorezMatriz;

import java.util.Scanner;

public class NumerosInteiros {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);  // Objeto para ler dados que o user digitar.

            int[] numeros = new int[10];  // Vetor para armazenar os 10 números digitados pelo user.



        // Daqui para baixo é a parte de funcionamento do sistema.
        // Entrada de dados, após o digito do user e o armazenamento no vetor.
            for (int i = 0; i < 10; i++) {
                System.out.print("Digite o " + (i+1) + "º número: ");
                numeros[i] = sc.nextInt();
            }

            // Inicializa maior e menor com o primeiro valor do vetor
            int maiorNumero = numeros[0];
            int menorNumero = numeros[0];

            // Logo abaixo, o FOR Percorre o vetor comparando MAIOR e MENOR
            for (int i = 1; i < 10; i++) {
                if (numeros[i] > maiorNumero) {
                    maiorNumero = numeros[i];
                }
                if (numeros[i] < menorNumero) {
                    menorNumero = numeros[i];
                }
            }

            // Neste SOUT, o sistema imprime na tela todas as informações
           //  do resultado da comparação MAIOR MENOR do FOR acima.
            System.out.println("O maior número digitado foi: " + maiorNumero);
            System.out.println("O menor número digitado foi: " + menorNumero);

            sc.close();
        }
    }



    /* O LENDÁRIO DICIONÁRIO DA CODIFICAÇÃO PARA O LEIGO (Gustavo)

    Para saber qual é o maior número e o menor, vamos usar um laço de repetição "for",
    onde cada variável vai receber o valor que o usuário digitar.

    Sempre que você precisar que o usuário digite algo para o sistema, deve colocar logo
    após o MAIN uma linha de código de Scanner, que lê a informação que o usuário digitar na tela.
    Neste caso foi:

    Scanner sc = new Scanner(System.in);

    Na primeira parte do código, colocamos a váriável do vetor, de maneira global, que receberá
    os números que o usuário digitar.
    Entenda: O vetor funciona como uma caixa onde armazena números e palavras.
    O vetor criado foi:

    int[] numeros = new int[10];  >>> Além disto, este vetor pode guardar 10 (int [10]) informações.



    Com a variável feita, vamos pedir ao usuário que digite os 10 números:

    For (int i = 0; i < 10; i++){
    System.out.print("Digite o " + (i+1) + "º número: ");  ((i+1) significa que comeca com 0 e soma 1 numero a cada vez que o user dar enter.))
    numeros[i] = sc.nextInt();
    }
 LEMBRE-SE: for (inicialização; condição; incremento)

    Neste caso, a inicialização da repetição é pelo 0 e a condição é de repetir 10 vezes.
    Logo, entenda que a repetição é do 0 a 9, totalizando 10 vezes. A conta fecha kkkk
    Cada repetição pede um número e guarda no vetor.

    Ainda estamos no começo do código, onde pedimos para o usuário digitar os 10 números.
    Cada número digitado vai para o numeros[i] (o "i" serve para acessar uma posição do vetor, que é de 0 a 9).
    Ou seja, PEGUE UM VALOR QUE ESTÁ NA POSIÇÃO "i" do vetor chamado numeros[].


    Digitados os 10 numeros pelo usuário, agora criamos as variaveis:
    int maiorNumero = numeros[0];
    int menorNumero = numeros[0];

    Essas variáveis vão receber os 10 números digitados pelo usuário. Note-se que o numeros [0]
    tem um valor de 0 dentro, isso significa que a variável vai começar a partir do primeiro valor do vetor,
    assim temos uma base de comparação.



    Na parte final, temos um segundo laço for com if's dentro dele. Nesta parte comparamos os valores de maior e menor.

            for (int i = 1; i < 10; i++) {
                if (numeros[i] > maiorNumero) {
                    maiorNumero = numeros[i];
                }
                if (numeros[i] < menorNumero) {
                    menorNumero = numeros[i];
                }

 LEMBRE-SE: for (inicialização; condição; incremento)

    Note que: numeros[i] > maiorNumero significa que o laço vai rodar 10 vezes e encontrar o maior número dentro do código
    Lembra que criamos a variável int maiorNumero = numeros[0]? Então, como já utilizamos o indice 0 e queremos comparar outros valores,
    precisamos começar o laço for a partir do segundo indice. Os primeiros 3 numeros do exemplo abaixo são: 1,3,8.
    Isso significa que o indice numeros[0] começa a partir do 1, e o numeros[1] é o valor 3.

    Vamos supor que os números digitados pelo user sejam, nessa sequência: 1,3,8,-5,19,22,0,1,8,4. O laço vai entrar
    em um verdadeiro ou falso, da seguinte maneira:

    if 3 > 1, então VERDADEIRO, logo a variável maiorNumero recebe 3.
    (Essa conta acontece pois nosso for começa com o i = 1, sendo 3 o segundo digito do vetor, já que o vetor começa em 0, que seria o 1).

    if 8 > 3, então VERDADEORP, agora o maior valor da variavel maiorNumero recebe 8, esquecemos do 3.
    if -5 > 8, então FALSO, -5 não é maior que 8, o maior número digitado pelo usuário até agora.
    if 19 > 8, então VERDADEIRO, agora o maior valor da variavel maiorNumero é 19, esquecemos do 8.
    if 22 > 19, então VERDADEIRO, agora o maior valor da variavel maiorNumero é 22, esquecemos do 19.
    if 0 > 22, então FALSO, 0 não é maior que 22, o maior número digitado pelo usuário até agora.
    if 1 > 22, então FALSO, 1 não é maior que 22, o maior número digitado pelo usuário até agora.
    if 8 > 22, então FALSO, 8 não é maior que 22, o maior número digitado pelo usuário até agora.
    if 4 > 22, então FALSO, 4 não é maior que 22, o maior número digitado pelo usuário até agora.

    Então, finalizamos o laço de repetição em 22.

    O maior número encontrado neste exemplo foi o 22, então se analizar o código, o 22 iria para a variável
    maiorNumero. O valor 22 é armazenado em "maiorNumero = numeros[i]".

    Agora, para encontrar o menor número, criamos outro laço de repetição logo abaixo da variavel maiorNumero, porém, vamos fazer
    ao contrário, pegando o menor número do vetor (numero[i]) e passando para a váriável menorNumero, e assim, fazendo o mesmo laço
    do exemplo acima.
   
    Para fechar com chave de ouro esse código, vamos passar ao usuário qual o maior e menor número, com:

    System.out.println("O maior número digitado foi: " + maiorNumero);
    System.out.println("O menor número digitado foi: " + menorNumero);
    sc.close();

    sc.close() fecha o Scanner, aquele citado lá em cima. Deve-se lembrar
    sempre de fechar, para boas práticas de programação.

    FIM.
     */