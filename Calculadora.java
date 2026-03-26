import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("/n---Calculadora---:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("elige una opción: ");
            opcion = sc.nextInt();
            if (opcion >= 1 && opcion <=4) {
                System.out.print("Ingrese el primer número: ");
                double num1 = sc.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                double num2 = sc.nextDouble();
                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 !=0) {
                            System.out.println("Resultado: " + (num1 / num2));
                        } else {
                            System.out.println("Error: No se puede dividir por cero.");
                            
                        }
                        break;
                }
                
            } else if (opcion != 5) {
                System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 5);
        System.out.println("Programa finalizado.");
sc.close();
        
    }
    
}
