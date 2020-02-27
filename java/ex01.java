import java.util.Scanner;

public class ex01 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero inteiro");
        int x = input.nextInt();
        System.out.println("Digite o segundo numero inteiro");
        int y = input.nextInt();
        int resultado = x + y;
        System.out.println("Soma de "+ x +" com " + y +" = " + resultado);
    }
}