import java.util.Scanner;
import java.util.Arrays;

public class ex10{

    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        int N;
        int i=0;

        System.out.println("Digite um numero N: ");
        N = Input.nextInt();
        float A[] = new float[N];

        if ((N>0) && (N<=50)){

            // Coloca todos os números no vetor
            while (i<N){
                System.out.println("Digite o " + (i+1) + "-esimo numero: ");
                A[i] = Input.nextFloat();
                i++;
            }

            // Descobre quantos números negativos e positivos nos temos no vetor
            int QtdPos=0, QtdNeg=0;
            for(int j=0; j<N; j++){
                if(A[j] >= 0){
                    QtdPos++;
                } else {
                    QtdNeg++;
                }
            }

            // POS inclui valores >=0 (i.e. POS inclui valores 0)
            float POS[] = new float[QtdPos];
            float NEG[] = new float[QtdNeg];

            // Coloca os positivos no POS e os negativos no NEG
            int IndexPos=0, IndexNeg=0;
            for(int k=0; k<N; k++){
                if(A[k] >= 0){
                    // A seguinte linha:
                    POS[IndexPos++] = A[k];
                    // É o mesmo que:
                    // POS[IndexPos] = A[k];
                    // IndexPos++;
                    // Pois o ++ SEMPRE é a última coisa a ser executada
                } else {
                    NEG[IndexNeg++] = A[k];
                }
            }


            System.out.println("Os valores fornecidos foram: " + Arrays.toString(A) + ".");
            System.out.println("Os valores positivos sao: " + Arrays.toString(POS) + ".");
            System.out.println("Os valores negativos sao: " + Arrays.toString(NEG) + ".");
            System.out.println("A quantidade de numeros positivos e: " + QtdPos);
            System.out.println("A quantidade de numeros negativos e: " + QtdNeg);
        } else {
            System.out.println("O N não está entre 0 e 50.");
        }
    }
}
