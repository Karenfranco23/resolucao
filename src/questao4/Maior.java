package questao4;

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantNumeros;
        int maior = 0;

        System.out.println("Informe 3 números inteiros:");

     //nao consegui usar a formula dada, entao fiz como eu sabia
        int count = 0;
        do {
            System.out.println("Número: ");
            quantNumeros = entrada.nextInt();
            if (quantNumeros > maior) maior = quantNumeros;
            count = count + 1;
        } while (count < 3);

        System.out.println(maior + " eh o maior ");
    }
}

