import java.util.Scanner;
import java.util.Arrays;

public class ex09{
   
    public static void main(String[] args){
        Scanner leTeclado;
        int Min=0, Max=0,X=1,Valores=0,Armazenar=0,i=0;
        int vetor[] = new int[10];
        leTeclado = new Scanner(System.in);
        System.out.println("Digite um valor Min para o intervalo:");
        Min = leTeclado.nextInt();
        System.out.println("Digite um valor Max para o intervalo:");
        Max = leTeclado.nextInt();
        if (Min>Max){
            int Temporario=0;
            System.out.println("O valor Min e maior que o valor Max, o programa ira os inverter");
            Temporario = Min;
            Min = Max;
            Max = Temporario;
        }

        while (X!=0){
            System.out.println("Digite um valor inteiro para X, e 0 quando tiver colocado todos os valores desejados: ");
            X = leTeclado.nextInt();
            if ((X>Min) && (X<Max)){
                System.out.println("X situa-se no intervalo [Min,Max], adicionado na totalizacao");
                vetor[i] = X;
                Valores++;
                Armazenar+= X;
                i++;
            }
            else
                System.out.println("Valor fora do intervalo [Min, Max], ignorado na totalizacao");

        }
        System.out.println("Os valores fornecidos foram " + Valores + ".");
        System.out.println("A soma dos valores fornecidos e " + Armazenar + ".");
        System.out.println("Os numeros fornecidos foram " + Arrays.toString(vetor) + ".");
    }
}
