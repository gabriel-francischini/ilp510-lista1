import java.util.Scanner;

public class ex07 {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("digite um numero positivo diferente de 0. digite 0 ou um numero negativo se quiser encerrar o processo.");
      float x = input.nextFloat();
      float contador = 0;
      float soma = 0;
      float media = soma / 1;
      float maior_numero = x;
      float menor_numero = x;
      while ( x > 0 ) {
         contador ++;
         soma += x;
         media = soma / contador;
         x = input.nextFloat();
         if(x < menor_numero){
            menor_numero = x;
         }
         if (x > maior_numero){
            maior_numero = x;
         }
      }
      System.out.println("maior valor: " + maior_numero +
         "\nmenor valor: " + menor_numero +
         "\nquantidade de valores: " + contador +
         "\nsoma dos valores: " + soma +
         "\nmedia dos valores: " + media );
      System.out.println("processo encerrado");
   }
}
