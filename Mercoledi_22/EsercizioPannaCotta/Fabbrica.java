package EsercizioPannaCotta;

import java.util.ArrayList;
import java.util.Scanner;

public class Fabbrica {
    ArrayList<PannaCotta> listaPanneCotte;

    public Fabbrica(){
        listaPanneCotte = new ArrayList<>();
    }

    public void aggiungiPannaCotta(){
        Scanner scannerS = new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);
        boolean run = true;
        int tipoPannaCotta;
        System.out.println("Sono la funzione aggiungi pannaCotta");
        System.out.println("\nChe tipo di panna cotta vuoi aggiungere? (1)Classica, (2)Frutta o (3)Cioccolato?");
        tipoPannaCotta = scannerN.nextInt();
        switch (tipoPannaCotta) {
            case 1:
                PannaCotta pannaCotta = new PannaCotta(null, 0);
                System.out.println("\nInserisci il nome della variante di panna cotta: ");
                String nomePannaCotta = scannerS.nextLine();
                System.out.println("\nInserisci il prezzo della variante di panna cotta: ");
                double prezzoPannaCotta = scannerN.nextDouble();
                pannaCotta.setNome(nomePannaCotta);
                pannaCotta.setPrezzo(prezzoPannaCotta);
                while (run) {
                    System.out.println("\nLa tua panna cotta ha ingredienti aggiuntivi? ");
                    if (scannerS.hasNextLine() && scannerS.nextLine().equalsIgnoreCase("si")) {
                        pannaCotta.aggiungiIngrediente();
                        run = true;
                    } else {
                        run = false;
                    }
                }
                listaPanneCotte.add(pannaCotta);
                System.out.println("Panna cotta aggiunta");
                break;

            case 2:
                PannaCottaFrutta pannaCottaFrutta = new PannaCottaFrutta(null, 0, null);
                System.out.println("\nInserisci il nome della panna cotta: ");
                String nomePannaCottaFrutta = scannerS.nextLine();
                System.out.println("\nInserisci il prezzo della panna cotta: ");
                double prezzoPannaCottaFrutta = scannerN.nextDouble();
                System.out.println("\nInserisci il tipo di frutta della panna cotta: ");
                String tipoDiFrutta = scannerS.nextLine();
                pannaCottaFrutta.setNome(nomePannaCottaFrutta);
                pannaCottaFrutta.setPrezzo(prezzoPannaCottaFrutta);
                pannaCottaFrutta.setTipoFrutta(tipoDiFrutta);
                while (run) {
                    System.out.println("\nLa tua panna cotta ha ingredienti aggiuntivi? ");
                    if (scannerS.hasNextLine() && scannerS.nextLine().equalsIgnoreCase("si")) {
                        pannaCottaFrutta.aggiungiIngrediente();
                        run = true;
                    } else {
                        run = false;
                    }
                }
                listaPanneCotte.add(pannaCottaFrutta);
                System.out.println("Panna cotta aggiunta");
                break;

            case 3:
                PannaCottaCioccolato pannaCottaCioccolato = new PannaCottaCioccolato(null, 0, 0);
                System.out.println("\nInserisci il nome della panna cotta: ");
                String nomePannaCottaCioccolato = scannerS.nextLine();
                System.out.println("\nInserisci il prezzo della panna cotta: ");
                double prezzoPannaCottaCioccolato = scannerN.nextDouble();
                System.out.println("\nInserisci percentuale di cioccolato della panna cotta: ");
                double percentualeCioccolato = scannerN.nextDouble();
                pannaCottaCioccolato.setNome(nomePannaCottaCioccolato);
                pannaCottaCioccolato.setPrezzo(prezzoPannaCottaCioccolato);
                pannaCottaCioccolato.setPercentualeCioccolato(percentualeCioccolato);
                while (run) {
                    System.out.println("\nLa tua panna cotta ha ingredienti aggiuntivi? ");
                    if (scannerS.hasNextLine() && scannerS.nextLine().equalsIgnoreCase("si")) {
                        pannaCottaCioccolato.aggiungiIngrediente();
                        run = true;
                    } else {
                        run = false;
                        break;
                    }
                }
                
                listaPanneCotte.add(pannaCottaCioccolato);
                System.out.println("Panna cotta aggiunta");
                break;

            default:
                System.out.println("\nOperazione scelta sbagliata riprova.");
                break;
        }
        

        System.out.println("\nRitorno al menu principale...");
        scannerS.close();
        scannerN.close();
    }

    public boolean continuaCiclo() {
        Scanner scanner = new Scanner(System.in);
        String scelta;
        boolean ritorno = false;
        System.out.println("Vuoi fare un altra operazione? [si] [no]");
        if (scanner.hasNextLine()) {
            scelta = scanner.nextLine();
        }else{
            scelta = "no";
        }
        if (scelta.trim().equalsIgnoreCase("si")) {
            ritorno = true;
        } else if (scelta.trim().equalsIgnoreCase("no")) {
            ritorno = false;
        }
        scanner.close();
        return ritorno;
    }

    public void stampaPanneCotte(){
        System.out.println("\nLista panne cotte disponibili: ");
        for(PannaCotta pannaCotta: listaPanneCotte){
            System.out.println("- "+pannaCotta.getNome()+", "+pannaCotta.getPrezzo());
        }
    }
}
