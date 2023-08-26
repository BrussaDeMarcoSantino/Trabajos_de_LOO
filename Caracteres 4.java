
import java.util.Scanner;

public class ero {

    public static void main(String[] args) {
        String cadena;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una cadena de caracteres");
        cadena = sc.nextLine();
        System.out.println("Ingrese la letra a cambiar y la que la cambia");
        char remplazada = sc.nextLine().charAt(0);
        char remplazo = sc.nextLine().charAt(0);

        String nueva = cadena.replace(remplazada, remplazo);

        System.out.println("La cadena resultante es " + nueva);

    }

}
