import java.util.Scanner;
public class MediaPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 0;
        System.out.println("Ingresa numeros positivos (negativos para salir):");
            while (true) {
                System.out.print("Número: ");
                numero = sc.nextInt();
                if (numero < 0) {
                    break; // termina ciclo

                }

                suma += numero;
                contador++;
            }
            if (contador > 0) {
                double media = (double) suma / contador;
                System.out.printf("La media es: " +  media);
            } else {
                System.out.println("No se ingresaron números positivos.");
                
            }

        sc.close();
    }
    
}
