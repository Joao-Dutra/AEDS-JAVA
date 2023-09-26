package aeds;

import java.util.Random;

public class EX2_RECURSIVIDADE {
    public static void ExibirArray(int v[],int inicio, int maior){
        int tamanhovetor = v.length;
        if (inicio >= tamanhovetor);
        else{
            if(v[inicio] > maior) {
                maior = v[inicio];
                ExibirArray(v,inicio+1,maior);        
            }        
            
            System.out.println(maior);
        }    
        
    }
    public static void main(String[] args) {
        Random random = new Random();
        int tamanhovetor = 10;
        int v[] = new int [tamanhovetor];
        int maior = 0;
        for (int i = 0; i < tamanhovetor; i++) {
            v[i] = random.nextInt(100);
            if (v[i] > maior) {
                maior = v[i];
            }
            System.out.print(v[i] + " ");
        }
        System.out.print("\n" + maior);
        System.out.println(" ");
        int inicio = 0;
        ExibirArray(v,inicio,maior);
    }
}
