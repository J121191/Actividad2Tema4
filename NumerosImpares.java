import java.util.Scanner;
public class NumerosImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = sc.nextInt();
        int i = 1;
        System.out.println("Números impares :");
        do {
            if (i % 2 != 0) {
                System.out.println(i);  
            }
            i++;
        } while (i < numero);
        sc.close();

 
    }
    
}
