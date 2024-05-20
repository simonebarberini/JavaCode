import java.util.ArrayList; // Importa la classe ArrayList per gestire le liste dinamiche
import java.util.Scanner; // Importa la classe Scanner per leggere l'input da console

public class Utente {
    private String password; // Variabile per la password dell'utente
    private String name; // Variabile per il nome dell'utente
    private ArrayList<String> datiUtente; // Lista per memorizzare i dati aggiuntivi dell'utente
    private boolean logged = false; // Variabile per tenere traccia dello stato di login

    // Costruttore della classe Utente
    public Utente(String nomeUtente, String passwordUtente) {
        name = nomeUtente; // Assegna il nome utente
        password = passwordUtente; // Assegna la password utente
        datiUtente = new ArrayList<>(); // Inizializza la lista dei dati utente
    }

    // Metodo per gestire il login dell'utente
    private boolean login(Scanner scanner) {
        int tentativi = 3; // Numero di tentativi disponibili
        System.out.println("Inserisci il tuo nome utente: ");
        while (!logged) {
            if (scanner.nextLine().equals(name)) {
                System.out.println("Utente riconosciuto! Inserisci la tua password: ");
                while (!logged && tentativi > 0) {
                    if (scanner.nextLine().equals(password)) {
                        logged = true;
                        System.out.println("Accesso consentito");
                    } else {
                        tentativi--;
                        System.out.println("Password Errata, tentativi rimasti: " + tentativi);
                    }
                }
            } else {
                System.out.println("Nome utente errato, riprovare");
            }
        }
        return logged;
    }

    // Metodo per aggiungere una stringa alla lista dei dati utente
    public void addString(String stringa) {
        datiUtente.add(stringa);
    }

    // Metodo per ottenere il nome utente
    private String getName() {
        return name;
    }

    // Metodo per ottenere la password
    private String getPassword() {
        return password;
    }

    // Metodo per stampare la lista dei dati utente
    private void printArray() {
        for (String dato : datiUtente) {
            System.out.println("\n" + dato);
        }
    }

    // Metodo per impostare una nuova password
    private void setPassword(Scanner scanner) {
        System.out.println("Inserisci Password: ");
        password = scanner.nextLine();
    }

    // Metodo per impostare un nuovo nome utente
    private void setNomeUtente(Scanner scanner) {
        System.out.println("Inserisci nome utente: ");
        name = scanner.nextLine();
    }

    // Metodo principale
    public static void main(String[] args) {
        // Creazione di un nuovo utente con nome e password vuoti
        Utente utente1 = new Utente("", "");
        Scanner scannerS = new Scanner(System.in); // Scanner per input di tipo stringa
        Scanner scannerN = new Scanner(System.in); // Scanner per input di tipo numero

        // Imposta nome utente e password
        utente1.setNomeUtente(scannerS);
        utente1.setPassword(scannerS);

        // Verifica login
        if (utente1.login(scannerS)) {
            boolean running = true; // Variabile per mantenere il ciclo while attivo
            while (running) {
                System.out.println("Ciao " + utente1.getName() + ", scegli un'operazione da svolgere:" +
                        "\n-(0): Inserisci informazioni aggiuntive su di te\n-(1): Stampa le informazioni aggiuntive\n-(2): Modifica password\n-(3): Modifica Nome utente\n-(4): Esci");

                int scelta;
                if (scannerN.hasNextInt()) { // Verifica che l'input sia un intero
                    scelta = scannerN.nextInt();
                    scannerN.nextLine(); // Consuma il newline rimasto
                } else {
                    System.out.println("Input non valido, per favore inserisci un numero.");
                    scannerS.nextLine(); // Consuma l'input non valido
                    continue;
                }

                // Gestisce le scelte dell'utente
                switch (scelta) {
                    case 0:
                        System.out.println("Aggiungi informazioni aggiuntive su di te: ");
                        utente1.addString(scannerS.nextLine());
                        break;
                    case 1:
                        utente1.printArray();
                        break;
                    case 2:
                        utente1.setPassword(scannerS);
                        System.out.println("Nuova password: " + utente1.getPassword());
                        break;
                    case 3:
                        utente1.setNomeUtente(scannerS);
                        System.out.println("Nuovo nome utente: " + utente1.getName());
                        break;
                    case 4:
                        System.out.println("Uscita dal programma...");
                        running = false; // Termina il ciclo while
                        break;
                    default:
                        System.out.println("Scelta non valida, riprovare...");
                        break;
                }
            }
        }
        scannerS.close(); // Chiude lo scanner per input stringa
        scannerN.close(); // Chiude lo scanner per input numero
    }
}
