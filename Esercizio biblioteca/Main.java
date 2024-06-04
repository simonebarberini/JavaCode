
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca bib = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int scelta;
        while (run) {
            System.out.println("Cosa vuoi fare?");
            System.out.println("(1) Lista libri disponibili");
            System.out.println("(2) Noleggia libro");
            System.out.println("(3) Restituisci libro");
            System.out.println("(4) Aggiungi libro");
            System.out.println("(5) Rimuovi libro");
            System.out.println("(6) Esci");
            try {
                scelta = scanner.nextInt();
                scanner.nextLine(); 
                switch (scelta) {
                    case 1:
                        bib.stampaLibriDisponibili();
                        break;
                    case 2:
                        bib.prestaLibro(scanner);
                        break;
                    case 3:
                        bib.restituisciLibro(scanner);
                        break;
                    case 4:
                        bib.aggiungiLibro(scanner);
                        break;
                    case 5:
                        bib.rimuoviLibro(scanner);
                        break;
                    case 6:
                        run = false;
                        break;
                    default:
                        System.out.println("Scelta non valida, riprova.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Inserisci un numero valido.");
                scanner.nextLine(); 
            }
        }
        scanner.close();
    }
}