import java.util.Scanner;
public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int intentos = 0;
        int adivinanza = 0;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Estoy pensando en un número entre 1 y 100. ¿Puedes adivinarlo?");

        while (adivinanza != numeroSecreto) {
            System.out.print("Ingresa tu adivinanza: ");
            adivinanza = scanner.nextInt();
            intentos++;

            if (adivinanza < numeroSecreto) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
            } else if (adivinanza > numeroSecreto) {
                System.out.println("Demasiado alto. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
            }
        }

        scanner.close();
    }

    
}
