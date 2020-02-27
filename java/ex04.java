import java.util.Scanner;

public class ex04 {

  public static void main(String[] args) {
    Scanner leTeclado;
    double a, b, c;
    String tipo;
    
    leTeclado = new Scanner(System.in);
    System.out.println("Digite um valor para a: ");
    a = leTeclado.nextDouble();
    System.out.println("Digite um valor para b: ");
    b = leTeclado.nextDouble();
    System.out.println("Digite um valor para c: ");
    c = leTeclado.nextDouble();
    leTeclado.close();
    
    if ((a+b>c))
    	tipo = "Triangulo";

   else if ((a==b) && (b==c))
					tipo = "Equilatero";  
	else if ((a==b) && (b!=c))
					tipo = "Isosceles";
	else if ((a!=b) && (b!=c))
					tipo = "Escaleno";
		else
			tipo = "Não é um triangulo";
    System.out.println("O tipo de triangulo é " + tipo + ".");
  }
  
}