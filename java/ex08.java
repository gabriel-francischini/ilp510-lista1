import java.util.Scanner;
public class ex08{
   
   public static void main(String[] args){
   Scanner leTeclado;
   int Min=0, Max=0,X=1,Valores=0,Armazenar=0;
   leTeclado = new Scanner(System.in);
   System.out.println("Digite um valor Min para o intervalo:");
   Min = leTeclado.nextInt();
   System.out.println("Digite um valor Max para o intervalo:");
   Max = leTeclado.nextInt();
   if (Min>Max){
   	int Temporario=0;
   	System.out.println("O valor Min é maior que o valor Max, o programa irá os inverter");
   	Temporario = Min;
   	Min = Max;
   	Max = Temporario;
   }

   while (X!=0){
   System.out.println("Digite um valor inteiro para X, e 0 quando tiver colocado todos os valores desejados: ");
   X = leTeclado.nextInt();
   		if ((X>Min) && (X<Max)){
   			System.out.println("X situa-se no intervalo [Min,Max], adicionado na totalização");
   			Valores++;
            Armazenar += X;
   		}
   		else 
   			System.out.println("Valor fora do intervalo [Min, Max], ignorado na totalização");

   }
   System.out.println("Os valores fornecidos foram " + Valores + ".");
   System.out.println("A soma dos valores fornecidos é " + Armazenar + ".");
   }
}
