import java.util.Scanner;

/**
 * Dissenya un programa que demani a l’usuari un valor no negatiu per teclat. Si l’usuari
 * insereix un valor negatiu, el programa li haurà de demanar de nou el valor fins que
 * sigui positiu.
 * Extra: Modifica el teu algoritme per a què només accepti valors entre 0 i 10.
 */

public class task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre;
        do {
            System.out.println("Indica un nombre enter entre el 0 i el 10");
            nombre = scanner.nextInt();
        }
        while (nombre < 0 || nombre > 10);

        System.out.println("Has introduit el nombre " + nombre + " que es enter");
    }
}
