package Modulo3;

import java.beans.PropertyDescriptor;

public class Aula01_Exerc01_Pratica2 {
    public static void main(String[] args) {
        Integer[] array = {52,10,85,1324,01,13,62,30,12,127};

        OrdemCrescente(array);
        OrdemDescrescente(array);

    }

    static void OrdemCrescente(Integer[] array){
        int j;
        int key;
        int i;

        for (j = 1; j < array.length; j++)
        {
            key = array[j];
            for (i = j - 1; (i >= 0) && (array[i] > key); i--)
            {
                array[i + 1] = array[i];
            }
            array[i + 1] = key;
        }

        for (int k = 0; k < array.length; k++) {
            System.out.println(array[k]);
        }
    }
    static void OrdemDescrescente(Integer[] array){
        int x; //j
        int key;
        int y; //i

        for (x = 1; x < array.length; x++)
        {
            key = array[x];
            for (y = x - 1; (y >= 0) && (array[y] > key); y--)
            {
                array[y + 1] = array[y];
            }
            array[y + 1] = key;
        }

        for (int i = 0, j = array.length - 1, tmp; i < j; i++, j--) {
            tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
        for (int k = 0; k < array.length; k++) {
            System.out.println(array[k]);
        }
    }
}
