package VetorezMatriz;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class matrizIdentidade {
    public static void main(String[] args) {

//essa é uma matriz pré-disposta como matiz identidade
    int[][] matriz = {
            {1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0},
            {0, 0, 0, 0, 1}
    };

   //vamos mostrar ela ao usuário
        System.out.println("Essa é uma matriz identidade:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}


