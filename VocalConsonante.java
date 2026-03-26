import java.util.Scanner;
public class VocalConsonante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letra;

        System.out.print("Ingrese una letras (espacio para salir): ");
        
        while (true) {
            System.out.print ("Letra: ");
            letra = sc.nextLine().trim();
            if (letra.equals("  ")) {
                break; // Termina el programa

                
            }
            if (letra.length() == 1) {
                char l = letra.charAt(0);
                if (l == 'a'  || l == 'e' || l == 'i' || l == 'o' || l == 'u' ||
                    l == 'A' || l == 'E' || l == 'I' || l == 'O' || l == 'U') {
                    System.out.println("Es una vocal.");
                } else if (Character.isLetter(l)) {
                    System.out.println("Es una consonante.");
                } else {
                    System.out.println("Es consonante");
                    
                }
            } else {
                System.out.println("Ingrese solo una letra.");
    }
    
}
sc.close();
}
}


