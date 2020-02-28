import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class ex12 {

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

            int QtdItensARemover = 0;
            for(int j=0; j<N; j++){
                if(V[j] == X){
                    QtdItensARemover++;
                }
            }

            if(QtdItensARemover == 0){
                System.out.println("O numero X nao esta no vetor.");
            } else {
                int VNovo[] = new int[(N - QtdItensARemover)];
                int VNovoIndice = 0;
                for(int VIndice = 0; VIndice<N; VIndice++)
                    if(V[VIndice] != X){
                        // Essa linha:
                        VNovo[VNovoIndice++] = V[VIndice];
                        // É o mesmo que as duas seguintes linhas:
                        //     VNovo[VNovoIndice] = V[VIndice];
                        //     VNovoIndice++;
                    }
                System.out.println("O vetor V passou a ser: " + Arrays.toString(VNovo));
            }
        } else {
            System.out.println("O N não está entre 0 e 50.");
        }
    }
}
