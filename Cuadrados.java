import java.util.Scanner;
public class Cuadrados {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número positivo: ");
        int numero = sc.nextInt();
        int i = 1;
        System.out.println("Cuadrados de los números:");
        do {

            int cuadrado = i * i;
            System.out.println(i + " al cuadrado es: " + cuadrado);
            i++;
        } while (i <= numero);

        sc.close();
    }
}
