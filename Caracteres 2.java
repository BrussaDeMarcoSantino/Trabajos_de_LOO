
import java.util.Scanner;

public class ero {

    public static void main(String[] args) {
        String cadena;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una cadena de caracteres");
        cadena = sc.nextLine();
        int longitud = cadena.length();
        int mitad = longitud / 2;
        boolean palindromo = true;
        for (int i = 0; i < mitad; i++) {
            if (cadena.charAt(i) != cadena.charAt(longitud - i - 1)) {
                palindromo = false;
            }
            longitud = longitud - i;
        }

        if (palindromo == true) {
            System.out.println(cadena + " es palindromo");
        } else {
            System.out.println(cadena + " no es palindromo");
        }

    }
}
