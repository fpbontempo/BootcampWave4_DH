package Modulo3;

import java.util.Scanner;

public class Aula01_Exerc05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de números como resultados");
        int n = sc.nextInt(); // quantidade de numeros como resultado //5
        System.out.println("Qual a quantidade de digitos que gostaria nos números para selecionar?");
        int m = sc.nextInt(); // quantidade de digitos //2
        System.out.println("Qual o digito em questão que voce quer que apareça?");
        int d = sc.nextInt(); // o digito em questão que eu quero que apareça //3

        //n=5, m=2, d=3
        int contador = 0;
        boolean soVai = true;

        int x = 1;
        while(soVai){
            String number = String.valueOf(x);
            for(int i = 0; i < number.length(); i++) {
                int j = Character.digit(number.charAt(i), 10);
                if (j == d){
                    contador++;
                }
                if(contador == m){
                    System.out.println(x);
                    n--;
                    contador = 0;
                }
            }
            x++;
            if (n == 0){
                soVai = false;
            }
            contador = 0;
        }
        sc.close();
    }
}
