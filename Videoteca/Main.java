import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerS = new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);
        Videoteca videoteca = new Videoteca();
        boolean running = true;
        int scelta;

        System.out.println("Sistema di gestione dei noleggi.");

        while (running) {
            System.out.println("\nScegli un'operazione da svolgere:");
            System.out.println("1. Aggiungi film");
            System.out.println("2. Rimuovi film");
            System.out.println("3. Registra utente");
            System.out.println("4. Noleggia film");
            System.out.println("5. Elenco film disponibili");
            System.out.println("6. Elenco utenti registrati");
            System.out.println("7. Esci");
            System.out.print("Scelta: ");
            scelta = scannerN.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci il titolo del film: ");
                    String title = scannerS.nextLine();
                    System.out.println("Inserisci l'anno di uscita del film: ");
                    int year = scannerN.nextInt();
                    Film film = new Film(title, year);
                    videoteca.addFilm(film);
                    break;
                case 2:
                    running = false;
            
                default:
                    break;
            }
        }

        videoteca.filmList();

        
    }
}