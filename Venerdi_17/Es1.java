import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {

        int sceltaMenu; // Variabile per la scelta del menu (registrazione o login)
        String username = ""; // Variabile per memorizzare l'username
        String password = ""; // Variabile per memorizzare la password
        Scanner scannerS = new Scanner(System.in); // Scanner per input di stringhe
        Scanner scannerN = new Scanner(System.in); // Scanner per input numerici
        boolean scelto = false; // Variabile per controllare se è stata effettuata una scelta valida
        boolean loggato = false; // Variabile per controllare se l'utente è loggato
        int tentativi = 0; // Variabile per contare i tentativi di login

        // Chiede all'utente se vuole registrarsi o fare il login
        System.out.println("Inserisci 1 per registrarti 0 per fare il login?");
        sceltaMenu = scannerN.nextInt();

        // Ciclo per gestire le operazioni di login o registrazione
        while (!scelto) {
            switch (sceltaMenu) {
                case 0: {
                    // Caso per il login
                    scelto = true;
                    System.out.println("Inserisci username per accedere: ");
                    if (username.equals(scannerS.nextLine())) {
                        // Verifica se l'username inserito è corretto
                        while (!loggato && tentativi < 3) {
                            System.out.println("Inserisci password: ");
                            if (password.equals(scannerS.nextLine())) {
                                // Password corretta
                                System.out.println("Password corretta ");
                                loggato = true;
                            } else {
                                // Password errata
                                tentativi++;
                                System.out.println("Password errata tentativo " + tentativi);
                                loggato = false;
                            }
                        }
                    } else {
                        // Username non registrato
                        System.out.println("Username non registrato registrati : ");
                        scelto = false;
                        sceltaMenu = 1; // Cambia la scelta per andare alla registrazione
                    }
                    break;
                }
                case 1: {
                    // Caso per la registrazione
                    sceltaMenu = 0;
                    System.out.println("Inserisci username per la registrazione: ");
                    username = scannerS.nextLine();

                    // Chiede la password finché non ha una lunghezza maggiore di 8 caratteri
                    while (password.length() <= 8) {
                        System.out.println("Inserisci una password (lunghezza maggiore di 8 caratteri): ");
                        password = scannerS.nextLine();
                    }

                    System.out.println("Sei registrato!!");
                    System.out.println("Ora tornerai al menu principale per effettuare il login");

                    loggato = false;
                    scelto = false; // Resetta scelto per ritornare al menu principale
                    break;
                }

                default:
                    // Caso per scelta non valida
                    System.out.println("Scelta non valida:  ");
                    scelto = true;
                    break;
            }
        }

        // Ciclo per gestire l'operazione di calcolo del quadrato di un numero una volta
        // loggati
        while (loggato) {
            int potenza;
            System.out.println("Inserisci un numero per ottenere il suo quadrato ");
            int numero = scannerN.nextInt();
            potenza = numero * numero; // Calcolo del quadrato del numero
            System.out.println("Risultato = " + potenza);
            System.out
                    .println("Per effettuare il logout digita 1 per rieseguire l'operazione premi un tasto qualsiasi");
            if (scannerS.nextLine().equals("1")) {
                loggato = false; // Effettua il logout
                System.out.println("Arrivederci");
            }
        }
        System.out.println("Programma terminato arrivederci");
        scannerN.close(); // Chiude lo scanner per input numerici
        scannerS.close(); // Chiude lo scanner per input di stringhe
    }
}
