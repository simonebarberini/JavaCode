import java.util.ArrayList;
import java.util.Scanner;

public class Utente {
    private String password;
    private String name;
    private ArrayList<String> datiUtente;
    private boolean logged = false;

    public Utente(String nomeUtente, String passwordUtente) {
        name = nomeUtente;
        password = passwordUtente;
        datiUtente = new ArrayList<>();
    }

    private boolean login(Scanner scanner) {
        int tentativi = 3;
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

    public void addString(String stringa) {
        datiUtente.add(stringa);
    }

    private String getName() {
        return name;
    }
    
    private String getPassword() {
        return password;
    }

    private void printArray() {
        for (String dato : datiUtente) {
            System.out.println("\n" + dato);
        }
    }

    private void setPassword(Scanner scanner) {
        System.out.println("Inserisci una nuova Password: ");
        password = scanner.nextLine();
    }

    private void setNomeUtente(Scanner scanner) {
        System.out.println("Inserisci un nuovo nome utente: ");
        name = scanner.nextLine();
    }

    public static void main(String[] args) {
        Utente utente1 = new Utente("Simone", "simonebrb");
        Scanner scannerS = new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);

        if (utente1.login(scannerS)) {
            boolean running = true;
            while (running) {
                System.out.println("Ciao " + utente1.getName() + ", scegli un'operazione da svolgere:" +
                        "\n-(0): Inserisci informazioni aggiuntive su di te\n-(1): Stampa le informazioni aggiuntive\n-(2): Modifica password\n-(3): Modifica Nome utente\n-(4): Esci");

                int scelta;
                if (scannerN.hasNextInt()) {
                    scelta = scannerN.nextInt();
                    scannerN.nextLine(); // Consuma il newline rimasto
                } else {
                    System.out.println("Input non valido, per favore inserisci un numero.");
                    scannerS.nextLine(); // Consuma l'input non valido
                    continue;
                }

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
                        running = false;
                        break;
                    default:
                        System.out.println("Scelta non valida, riprovare...");
                        break;
                }
            }
        }
        scannerS.close();
        scannerN.close();
    }
}
