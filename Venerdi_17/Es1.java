import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {
        int sceltaMenu;
        String username = "";
        String password = "";
        Scanner scannerS = new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);
        boolean scelto = false;
        boolean loggato = false;
        int tentativi = 0;

        System.out.println("Inserisci 1 per registrarti 0 per fare il login?");
        sceltaMenu = scannerN.nextInt();
        
        while (!scelto) {
            switch (sceltaMenu) {
                case 0:{
                    // scelto = true;
                    System.out.println("Inserisci username per accedere: ");
                    if(username.equals(scannerS.nextLine())){
                        while (!loggato && tentativi<3) {
                            System.out.println("Inserisci password: ");
                            if (password.equals(scannerS.nextLine())) {
                                System.out.println("Password corretta ");
                                loggato = true;
                            } else {
                                tentativi++;
                                System.out.println("Password errata tentativo "+tentativi);
                                loggato = false;
                            }
                            System.out.println("Tentativi esauriti utente bloccato");
                            scelto = true;
                        }
                    }else{
                        System.out.println("Username non registrato registrati : ");
                        scelto = false;
                        sceltaMenu = 1;
                    }
                    break;
                }
                case 1:{
                    sceltaMenu = 0;
                    System.out.println("Inserisci username per la registrazione: ");
                    username = scannerS.nextLine();

                    while (password.length()<=8) {
                        System.out.println("Inserisci una password (lunghezza maggiore di 8 caratteri): ");
                        password = scannerS.nextLine();
                    }

                    System.out.println("Sei registrato!!");
                    System.out.println("Ora tornerai al menu principale per effettuare il login");

                    loggato = false;
                    scelto = false;
                    break;
                }

                default:
                    System.out.println("Scelta non valida:  ");
                    scelto = true;
                    break;
            }
        }

        while(loggato){
            int potenza;
            System.out.println("Inserisci un numero per ottenere il suo quadrato ");
            int numero = scannerN.nextInt();
            potenza = numero*numero;
            System.out.println("Risultato = "+ potenza);
            System.out.println("Per effettuare il logout digita 1 per rieseguire l'operazione premi un tasto qualsiasi");
            if (scannerS.nextLine().equals("1")) {
                loggato = false;
                System.out.println("Arrivederci");
            }
        }
        System.out.println("Programma terminato arrivederci"); 
        scannerN.close();
        scannerS.close();
    }
}
