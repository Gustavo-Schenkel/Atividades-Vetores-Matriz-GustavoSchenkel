package VetorezMatriz;
import java.util.Scanner;
public class vetorMatrizAlunos {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String[] alunos = new String[5];
            double[][] notas = new double[5][2];
            double[] medias = new double[5];

//Começando o código, o primeiro FOR anexa o nome do aluno em sua posição no vetor
            for (int i = 0; i < 5; i++) {
                System.out.print("Digite o nome do aluno " + (i+1) + ": ");
                alunos[i] = sc.nextLine();
                for (int j = 0; j < 2; j++) {
                    System.out.print("Digite a nota " + (j+1) + " de " + alunos[i] + ": ");
                    notas[i][j] = sc.nextDouble();
                }
                sc.nextLine();

                // Calculo da media
                medias[i] = (notas[i][0] + notas[i][1]) / 2;
            }

            // Mostrando ao user qual a média final
            System.out.println("--- MÉDIAS FINAIS ---");
            for (int i = 0; i < 5; i++) {
                System.out.println("Aluno: " + alunos[i] + " | Média: " + medias[i]);
            }

            sc.close();
        }
    }


/* O LENDÁRIO DICIONÁRIO DA CODIFICAÇÃO PARA O LEIGO (Gustavo)

BORAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA, mais uma análise de código.
Começamos com o Scanner para coletar as informações digitadas pelo user.

Nosso objetivo é coletar o nome de 5 alunos que serão digitados pelo usuário. Para
isso, vamos criar um vetor string:

             String [] alunos = new String [5];

Show, nós possuimos agora uma box para armazenar o nome de alunos. Agora, nós queremos
armazenar as notas deles. Como as notas são numeros decimais, com pontuação, vamos utilizar
o tipo DOUBLE, não int. Agora, vamos criar uma matriz onde armazenaremos os 5 alunos do vetor string
juntamente com 2 notas.

             double [][] notas = new double[5][2];


Agora vamos começar a brincadeira entrando em um laço for externo e internamente vamos colocar outro for. O primeiro vai percorrer o array
anexando o nome dos alunos a sua respectiva posição. O laço vai rodar 5 vezes pedindo o nome.

LEMBRE-SE: for(inicialização;condição;incremento++);
 for (int i = 0; i < 5; i++) {
                System.out.print("Digite o nome do aluno " + (i+1) + ": ");
                alunos[i] = sc.nextLine();

Note-se que: System.out.print("Digite o nome do aluno " + (i+1) + ": ");

Esse +(i+1)+ significa que o indice 0 vai acrescentar 1, logo, o primeiro aluno não vai para
o indice 0 e sim, para o indice 1.

Após pedir o nome do aluno, ele é armazenado em sua devida posição através de: alunos[i] = sc.nextLine();
------------------------------------------------------------------------------------------------------------

Agora, dentro do mesmo FOR, vamos realizar outro FOR, para descobrir as notas dos alunos e que serão
enviadas para o array. Essas notas são pedidas duas vezes. Como esse for está dentro de outro for, o for externo roda 5 vezes,
ele pede o nome de 5 alunos e para cada aluno, o laço interno pede duas notas.

 for (int j = 0; j < 2; j++) {
                    System.out.print("Digite a nota " + (j+1) + " de " + alunos[i] + ": ");
                    notas[i][j] = sc.nextDouble();

Mesmo exemplo de cima, o indice 0 acrescenta 1. Percorre o laço 2 vezes para cada aluno.



Dentro do mesmo laço for, utilizamos a matematica da média, que é    medias[i] = (notas[i][0] + notas[i][1]) / 2;

Por fim, mostramos ao user quais são os alunos e suas médias com a seguinte linha de código:

            System.out.println("--- MÉDIAS FINAIS ---");
            for (int i = 0; i < 5; i++) {
                System.out.println("Aluno: " + alunos[i] + " | Média: " + medias[i]);
            }

            sc.close();

 O laço for percorre 5 vezes, mostrando o nome dos 5 alunos e sua respectivel média.


 fimmmmmmmmmmmmmmmmmmmmmmmm
 */