import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class ex11 {

    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        Random Aleatorio = new Random();
        int N;
        int i=0;

        System.out.println("Digite um numero N: ");
        N = Input.nextInt();
        int V[] = new int[N];

        if ((N>0) && (N<=50)){

            // Coloca todos os números no vetor
            while (i<N){
                V[i] = Aleatorio.nextInt(/*5*/);
                i++;
            }
            System.out.println("O array aleatório é: " + Arrays.toString(V) + ".");

            System.out.println("Digite um numero X: ");
            int X = Input.nextInt();

            boolean RandomInVector = false;
            for(int j=0; j<N; j++){
                if(V[j] == X){
                    System.out.print((j+1) + ", ");
                    RandomInVector = true;
                }
            }
            if(RandomInVector)
                System.out.println("\b\b.");
            else
                System.out.println("O numero aleatorio nao esta no vetor.");

        } else {
            System.out.println("O N não está entre 0 e 50.");
        }
    }
}
