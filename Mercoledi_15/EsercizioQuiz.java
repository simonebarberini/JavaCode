import java.util.Scanner;

public class EsercizioQuiz {
    public static void main(String[] args) {
        int punteggio = 0;
        Scanner scannerS = new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome utente: ");
        String nomeUtente = scannerS.nextLine();
        //Prima domanda
        System.out.println("Quanto fa 15/3 ?: ");
        int risposta = scannerN.nextInt();
        if (risposta == 5) {
            System.out.println("Risposta corretta hai guadagnato 5 punti");
            punteggio = punteggio + 5;
        } else {
            System.out.println("Risposta errata hai perso 5 punti");
            punteggio = punteggio - 5;
        }
        // Seconda domanda
        System.out.println("Quanto fa 7*4 ?: ");
        risposta = scannerN.nextInt();
        if (risposta == 28) {
            System.out.println("Risposta corretta hai guadagnato 5 punti");
            punteggio = punteggio + 5;
        } else {
            System.out.println("Risposta errata hai perso 5 punti");
            punteggio = punteggio - 5;
        }
        //Terza Domanda
        System.out.println("Quanto fa 22+18 ?: ");
        risposta = scannerN.nextInt();
        if (risposta == 40) {
            System.out.println("Risposta corretta hai guadagnato 5 punti");
            punteggio = punteggio + 5;
        } else {
            System.out.println("Risposta errata hai perso 5 punti");
            punteggio = punteggio - 5;
        }

        System.out.println("Quiz terminato, " + nomeUtente + " hai totalizzato un punteggio di " + punteggio + " punti");

        scannerN.close();
        scannerS.close();
    }
}
