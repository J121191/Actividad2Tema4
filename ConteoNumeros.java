import java.util.Scanner;
public class ConteoNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuantos números desea ingresar?: ");
        int cantidad = sc.nextInt();

        int mayores = 0;
        int menores = 0;
        int Ceros = 0;


        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese un número " + (i + 1) + ": ");
            int numero = sc.nextInt();
            
            if (numero > 0) {
                mayores++;
            } else if (numero < 0) {
                menores++;
            } else {
            Ceros++;
            }
        }

        System.out.println("Numeros mayores que 0: " + mayores);
        System.out.println("Numeros menores que 0: " + menores);
        System.out.println("Numeros iguales a 0: " + Ceros);

        sc.close();

    }
    
}
