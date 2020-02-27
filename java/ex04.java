import java.util.Scanner;

public class ex04{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro numero real positivo");
        float a = input.nextFloat();
        System.out.print("Digite o segundo numero real positivo");
        float b = input.nextFloat();
        System.out.print("Digite o terceiro numero real positivo");
        float c = input.nextFloat();

        boolean AisTriangular = (a < (b + c)) && (a > Math.abs(b - c));
        boolean BisTriangular = (b < (a + c)) && (b > Math.abs(a - c));
        boolean CisTriangular = (c < (b + a)) && (c > Math.abs(b - a));

        if (AisTriangular && BisTriangular && CisTriangular){
            System.out.println("Os numeros formam um triangulo");
            if ( (a == b) && (b == c) ){
                System.out.print("Os numeros formam um triangulo equilatero");
            }
            else if( (a == b) || (b == c) || (a == c) ){
                System.out.print("Os numeros formam um triangulo isosceles");
            }
            else{
                System.out.print("os numeros formam um triangulo escaleno");
            }

        }
        else{
            System.out.print("Os dados de entrada nao formam um triangulo");
        }
    }
}
