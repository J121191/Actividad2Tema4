import java.util.Scanner;
public class SecuenciaAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int inicio = sc.nextInt();
        System.out.print("Ingrese la diferencia : ");
        int diferencia = sc.nextInt();
        System.out.print("Ingrese el número máximo: ");
        int maximo= sc.nextInt();
        int actual = inicio;

        System.out.println("La secuencia aritmética es:");
        do {
            System.out.print(actual + " ");
            actual += diferencia;
        } while (actual <= maximo);
        sc.close();
    }
    
}

