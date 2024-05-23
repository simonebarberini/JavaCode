package EsercizioPannaCotta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean running = true;
        Scanner scannerN = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        Fabbrica fabbrica = new Fabbrica();
        
        System.out.println("\nGestionale panne cotte.");
        
        while (running) {
            menu();
            System.out.println("\nScegli un operazione da fare.");
            int sceltaOperazione = scannerN.nextInt();
            switch (sceltaOperazione) {
                case 1:
                    fabbrica.aggiungiPannaCotta();
                    running = fabbrica.continuaCiclo();
                case 2:
                    fabbrica.stampaPanneCotte();
                    running = fabbrica.continuaCiclo();
                    break;
                case 4:
                    System.out.println("Uscita dal programma...");
                    running = false;
                    break;
                default:
                    System.out.println("\nOperazione scelta sbagliata riprova.");
                    break;
            }
        }

        scannerN.close();
        scannerS.close();
    }


     static void menu() {
        System.out.println("Select an option: \n");
        System.out.println("1. Aggiungi nuova panna cotta");
        System.out.println("2. Visualizza panne cotte disponibili");
        System.out.println("3. Ricerca panna cotta per nome");
        System.out.println("4. Quit");

        System.out.print("\nChoise: ");
    }
}
