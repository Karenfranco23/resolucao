package questao2;

import java.util.Scanner;

public class Turno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String turno;

        System.out.println("Digite qual o turno que você trabalha: (M) Matutino - (V) Vespertino - (N) Noturno ");
        turno = entrada.next();


        if (turno.toUpperCase().equals("M")) {
            System.out.println("Bom Dia!");
        }else if (turno.toUpperCase().equals("V")) {
            System.out.println("Boa Tarde!");
        } else if (turno.toUpperCase().equals("N")) {
            System.out.println("Boa Noite!");
        }else {
            System.out.println("Valor inválido");
        }
    }
}
