package VetorezMatriz;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner dos 15 números que digitaremos.
        System.out.println("=====VAMOS DIGITAR 15 NÚMEROS, E VEJA A MÁJICA ACONTECER=====");


//vetor que armazenará os 15 números digitados pelo user, a principio os 3 fazem a mesma coisa
        int [] numeros = new int[15];
        int [] pares = new int[15];
        int [] impares = new int[15];


        //inicia as variaveis auxiliares para separar pares e impares
        int numerosPares = 0;
        int numerosImpares = 0;



        //Iniciamos o bloco de repetição for, que vai até o else.
        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = sc.nextInt();

       //agora, vamos verificar se é par ou ímpar
        if (numeros[i] % 2 == 0) {
            pares[numerosPares] = numeros[i];
            numerosPares++;
        }else {
            impares[numerosImpares] = numeros[i];
            numerosImpares++;
        }
        } // aqui, fechamos o bloco de repetição for.


        //Agora, vamos mostrar ao usuário quantos números pares temos no total.
        System.out.println("A quantidade total de números pares são:" + numerosPares);

        //Aqui, vamos mostrar ao usuário quais são pares
        System.out.println("Os números pares são:");
        for (int i = 0; i < numerosPares; i++) {
            System.out.print(pares[i] + " ");
        }
       //Agora, vamos mostrar ao usuário quantos números pares temos no total.

        System.out.println("A quantidade total de números impares é de:" + numerosImpares);
        //Aqui, vamos mostrar ao usuário quais são impares
        System.out.println("Os números impares são:");
        for (int i = 0; i < numerosImpares; i++) {
            System.out.print(impares[i] + " ");
        }
       sc.close();
    }
}

/* O LENDÁRIO DICIONÁRIO DA CODIFICAÇÃO PARA O LEIGO (Gustavo)

Começando o código, criamos um "Scanner sc = new Scanner(System.in);" para escanear o que o user escrever.

Em seguida, criamos 3 variaveis de vetor (ARRAY'S), que receberam os respectivos nomes: numeros, pares, impares.
Cada uma com um vetor de 15 digitos. Lembrando: Vetor é como uma caixa que armazena (neste caso) até 15 nomes e numeros, os objetos.

Em seguida, criamos duas variáveis de auxilio, onde na hora que solicitarmos para imprimir na tela, apareça só os valores que for colocado em cada posição

        int numerosPares = 0;
        int numerosImpares = 0;

Feito isso vamos começar a brincadeira. Lançamos no código o laço FOR, para o usuário digitar os 15 números.
        for (int i = 0; i < 15; i++) {
         System.out.print("Digite o " + (i+1) + "º número: ");
         numeros[i] = sc.nextInt();

LEMBRE-SE: for(inicialização; condição; incremento)

   Neste laço, vamos começar a armazenar no indice 0 até o 14, totalizando 15 indices. Os valores digitados
   pelo usuário são armazenados em: "numeros[i] = sc.nextInt();"

   AGORA COMEÇA O ROLO. Vamos inicializar um pedido de "se", com o if. if (numeros[i] % 2 == 0)
O que acontece é que o if vai puxar os numeros armazenados no vetor numeros[i], que são os 15
valores e vai dividir todos por 2. esse "%" é o operador módulo, ou MOD, das aulas do Taffe.

Essa conta basicamente pega o numero do vetor, ex.: 4, divide por 2 e se o resto da divisão for 0, então é VERDADE.ex:

   4 /  2
 - 4 | 2
   0  <<<<<<<<<<  Este zero é o resultado da divisão o resto dela. Logo, se torma o MOD (Módulo).

                    obviamente, todo numero impar dividido por 2 tem o mod = 1, então será impar.

   Agora, o que acontece no restante do código? Por que pegamos o array pares[] e dentro dela nós colocamos
 a variavel numerosPares?

            pares[numerosPares] = numeros[i];

pares[] >>>>> é o array que criamos para armazenar os numeros pares, e no começo do código declaramos assim:
            int [] pares = new int[15];

numerosPares >>>>> é uma variavel que começa em zero e aumenta cada vez que colocarmos um número dentro dela.
     Basicamente, o que essa linha faz (pares[numerosPares] = numeros[i];) é pegar o número que o user digitar, que está em: numeros[i],
e coloca dentro do vetor pares, na posição indicada pelo contador numerosPares.

                           -----Por que estamos chamando a variavel numerosPares de contador?-----

      Seguinte, a variavel começa assim: int numerosPares = 0; Como queremos que vá para dentro dela apenas os pares,
quando um numero par é VERDADE, o contador indica que no indice 0 vai ter um numero par, ai com o incremento ++ ele passa
para o próximo indice, que é 1. Quando mais um número par for encontrado, o contador indicará que na posição 1, terá um
numero par, incrementa ++ e vai para o indice 2 e assim sucessivamente. No exemplo abaixo e no código é colocado o contador
numeros pares dentro do array de 15 valores pares[].     pares[numerosPares].

No exemplo vamos dizer que o numeros pares indica em qual posição do array pares[] tem um numero par.

++++++Suponhamos que o usuário digite os seguintes números: 1,3,5,6,7,8,10,22.(numeros[i])++++++

     Agora, vamos utilizar o array pares[] com o numerosPares dentro dele.

o laço começa:
i = 0  >>> numeros [0] = 1  (1 é impar, então nao vai ser salvo)
i = 1  >>> numeros [1] = 3  (3 é impar, então nao vai ser salvo)
i = 2  >>> numeros [2] = 5  (5 é impar, então nao vai ser salvo)
i = 3  >>> numeros [3] = 6  (6 é par, então vai ser salvo)
Como o 6 é par, será salvo. Agora, a linha pares[numerosPares] = numeros[i] muda,
                              indo para: pares[0] = 6

    AGORA, tem a ultima parte do laço, o incremento >>>>>  numerosPares++;

Lembra que numerosPares é um contador que começa em zero? (int numerosPares = 0;), então, quando
achamos um numero par, o laço tem o incremento. Então ele diz que o numero na posição zero do array pares[0] é tal,
e cada vez que for encontrado um numero par, o numerosPares tem um incremento sequente.

Vamos imaginar que o array pares[] é uma caixa vazia de 15 numeros:
pares[..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ...,]

Agora, achamos o numero 6, então, dizemos que o número que vai na posição 0 é o 6, através do contador
numerosPares que está dentro do array [pares]. Então numerosPares = 0:
        pares[ 6  , ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ...,]

Agora, incrementamos o numerosPares através de "numerosPares++" pra que o próximo número par entre no contador
1 e caia no espaço 2 do array. (lembra que o vetor vai de 0 a 14 totalizando 15 digitos). Então numerosPares = 1.

.......................................CONTINUANDO................................................

i = 4  >>> numeros [4] = 7  (7 é impar, então nao vai ser salvo)
i = 5  >>> numeros [5] = 8  (8 é par, então vai ser salvo), Mais um número salvo.
                                indo para: pares[1] = 8
Aqui encontramos o 8, então o número na posição 1, que é o segundo espaço vazio do array será o 8.

pares[ 6  , 8  , ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ...,]
Agora vamos incrementar novamente o numerosPares para 2, para encontrar a terceira posição.


i = 6  >>> numeros [6] = 10  (10 é par, então vai ser salvo), Mais um número salvo em:
                                indo para: pares[2] = 10

Olha ai, mais um numero para a caixa pares. Então:
pares[ 6  , 8  , 10 , ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ...,]
Agora vamos incrementar novamente o numerosPares para 3, para encontrar a quarta posição.


i = 7  >>> numeros [7] = 22  (2 é par, então vai ser salvo), Mais um número salvo em:
indo para: pares[3] = 22

pares[ 6  , 8  , 10 , 22 , ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ...,]

por fim, vamos incrementar novamente o numerosPares para tentar encontrar a quarta posição e assim  por diante.

AGORA, imaginando que depois do 22, o usuário tenha digitado apenas números impares, então todos os outros slots
disponíveis são substituídos por 0.



E para os números impares entra o ELSE, o segundo laço de repetição:
          else {
              impares[numerosImpares] = numeros[i];
              numerosImpares++;

Mesma coisa, o número ímpar vai para a caixa do array:
impares [..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ...,]

onde utilizamos o contador numerosImpares a partir do 0 e vamos contando as posiçoes a cada vez
que um impar for encontrado.




Feito isto, vamos mostrar ao usuário quantos números pares temos no total. Para isso, utilizamos o SOUT.
 System.out.println("A quantidade total de números pares são:" + numerosPares);

 o numerosPares é o contador, nele vai ter quantas vezes foi contado um número par, no exemplo de pares
 acima foram 4.

Agora, queremos saber quais são esses 4 numeros pares digitados, então vamos utilizar um laço for.

 System.out.println("Os números pares são:");
        for (int i = 0; i < numerosPares; i++) {
            System.out.print(pares[i] + " ");
        }
 Aqui, int i = 0; i < numerosPares significa que vamos pegar a quantidade de casas utilizadas no contador
 numerosPares, que foram 4. (0,1,2,3). Lembrando que vamos começar a puxar os valores do numerosPares pois
 na inicialização do for, falamos que int i começava por = 0. Ai vamos incrementando  o i. Então quando pedimos ao
 sout pares[i], o que acontece é puxar os 4 valores do numerosPares, em sequencia.

i = 0 incrementou i++ para saber o próximo valor da numerosPares: i = 1
i = 1 incrementou i++ para saber o próximo valor da numerosPares: i = 2
i = 2 incrementou i++ para saber o próximo valor da numerosPares: i = 3
i = 3 Aqui acaba os incrementos e finaliza o laço, pois a variavel numerosPares só tem 4 valores dentro dela, conforme exemplo acima.

Agora, vamos pegar esses valores em sequência de i = 0 a i = 3 e pescar o valor lá de dentro do array pares[]
pares[ 6 (i=0), 8 (i=1), 10 (i=2), 22 (i=3), ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ...,]

Concluindo assim o sout e imprimindo na tela um valor atras do outro, do i = 0 a i = 3.

A mesma coisa é feita com os numeros impares.

FIM!!!
 */