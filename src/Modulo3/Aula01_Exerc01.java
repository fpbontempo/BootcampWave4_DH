package Modulo3;

import java.util.Scanner;

public class Aula01_Exerc01 {
    public static void main(String[] args) {
        /*Desenvolva um programa para mostrar os primeiros n números pares, sendo n um valor
        que o usuário irá inserir pelo console. Lembre-se que um número é par quando divisível por
        2.*/
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = n;
        for (int i = 0; i <= n; i++) {
            if (m % 2 == 0)
            {
                System.out.println(m);
            }
            m = m + 1;
        }
        sc.close();
    }
}
