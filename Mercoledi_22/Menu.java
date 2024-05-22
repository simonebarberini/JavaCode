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
            System.out.println("Seleziona un tipo di pane: ");
            for(Ingrediente ing: piatto.ingredientiPubblici){
                System.out.println("- " + ing.nome + " " + ing.prezzo);
            }
            String ingrPubblico = scannerS.nextLine();
            running = piatto.aggiungniIngrPublic(ingrPubblico);
        }
        //scelta ingredienti privati
        running = true;
        while (running) {
            System.out.println("Seleziona ingredinti privati: ");
            for(Ingrediente ingrPrivato: piatto.getIngredientiPrivati()){
                System.out.println("- "+ingrPrivato.nome+" "+ingrPrivato.prezzo);
            }
            String ingredientePrivato = scannerS.nextLine();
            running = piatto.aggiungiInredientiPrivati(ingredientePrivato);
        }

        piatto.calcolaPrezzo();

        scannerS.close();

    }
}
