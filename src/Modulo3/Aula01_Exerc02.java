package Modulo3;

import java.util.Scanner;

public class Aula01_Exerc02 {
    public static void main(String[] args) {
        /*Desenvolva um programa para mostrar os primeiros n números múltiplos de m, sendo n e
        m valores que o usuário irá inserir via console.*/

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //interar ...e só isso
        int m = sc.nextInt(); //35
        //int contador = 0;
        //12 é múltiplo de 4, pois 4*3 = 12.

        for(int multiplicador = 1; multiplicador<=100; multiplicador ++) {
            for(int contador = 0; contador<=n; contador++) {

                if (multiplicador * contador == m) {
                    System.out.println(m + " é multiplo de " + multiplicador);
                }
            }
        }
        sc.close();
    }
}
