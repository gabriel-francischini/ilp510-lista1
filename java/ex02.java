import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero inteiro positivo");
        int x = input.nextInt();
        System.out.println("Digite o segundo numero inteiro positivo");
        int y = input.nextInt();
        int resultado = x + y;
            if ( (x > 0) && ( y > 0)){
                System.out.println("Soma de "+ x +" com " + y +" = " + resultado);
            
            } 
            
            else 
            {System.out.println("Dados de entrada invalidos");
            }
                  
    }
}