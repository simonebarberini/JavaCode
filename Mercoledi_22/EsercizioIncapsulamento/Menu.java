import java.util.Scanner;

public class Menu {
    PiattoSpeciale piatto;

    public Menu(){
        piatto = new PiattoSpeciale();
    }

    public void ordina(){
        Scanner scannerS = new Scanner(System.in);
        boolean running = true;
        //scelta ingredienti pubblici
        while (running) {
            System.out.println("Seleziona un ingrediente pubblico tra quelli disponibili: ");
            for(Ingrediente ing: piatto.ingredientiPubblici){
                System.out.println("- " + ing.nome + " " + ing.prezzo);
            }
            System.out.println();//a capo
            String ingrPubblico = scannerS.nextLine();
            piatto.aggiungniIngrPublic(ingrPubblico);
            System.out.println("Vuoi aggiungere un altro ingrediente? ");
            if (scannerS.nextLine().equalsIgnoreCase("si")) {
                running = true;
            } else {
                running = false;
            }
            System.out.println();//a capo
        }
        //scelta ingredienti privati
        running = true;
        while (running) {
            System.out.println("Seleziona ingredinti privati: ");
            for(Ingrediente ingrPrivato: piatto.getIngredientiPrivati()){
                System.out.println("- "+ingrPrivato.nome+" "+ingrPrivato.prezzo);
            }
            System.out.println();//a capo
            String ingredientePrivato = scannerS.nextLine();
            piatto.aggiungiInredientiPrivati(ingredientePrivato);
            System.out.println("Vuoi aggiungere un altro ingrediente? ");
            if(scannerS.nextLine().equalsIgnoreCase("si")){
                running = true;
            }else{
                running = false;
            }
            System.out.println();//a capo

        }
        piatto.stampaIngredientiScelti();
        piatto.calcolaPrezzo();

        scannerS.close();

    }
}
