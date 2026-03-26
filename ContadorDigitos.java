import java.util.Scanner;
public class ContadorDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int numero = sc.nextInt();
        int contador = 0;

        // para evitar numeros negativos
numero = Math.abs(numero);

        if (numero == 0) {
            contador = 1;
            
        }else {

        while (numero > 0) {
            numero = numero / 10;
            contador++;
        }
        
}
        System.out.println("El número tiene " + contador + " dígitos.");
        sc.close();
    }
}
