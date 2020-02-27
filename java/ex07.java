import java.util.Scanner;
public class ex07 {
 
    public static void main(String[] args) {
        Scanner leTeclado;

        int n=1, menor=0, maior=0, media=0, elementos=0;
        leTeclado = new Scanner(System.in);

        while(n>0){
            System.out.println("Digite um numero:");
            n = leTeclado.nextInt();

            if (elementos == 0)
                menor = n;

            // n = 7, maior = 10, menor = 5
        	if(n>maior){
        		maior = n; 
        	} 
            else if (n<menor){
        		menor = n;
            }

            if (n==0){
                elementos-= 1;
            }
            media += n;
            elementos+= 1;
        }
    	System.out.println("O maior e " + maior + " e o menor e " + menor + ".");
    	System.out.println("A quantidade de elementos e " + elementos);
    	System.out.println("A media entre eles e" + (media/elementos));
    	leTeclado.close();
    }
}
