package aeds;

import java.util.Scanner;

public class AEDS_FATORIAL {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int x = 0, aux = 0;

        x = entrada.nextInt();
        aux = x;
        while(aux > 1){
            x = (x * (aux - 1));
            aux = aux - 1;
        }
        
        System.out.println(x);
    }

}
