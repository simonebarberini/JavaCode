import java.util.ArrayList;
import java.util.Scanner;

public class ProvaProgettoGruppo {
    public static void main(String[] args) {
        Scanner scannerS = new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);

        Negozio negozio = new Negozio();
        boolean running = true;
        int choice;

        while (running) {
            menu();
            System.out.print("Fai la tua scelta: ");
            choice = scannerN.nextInt();

            switch (choice) {
                case 1://Aggiungi clienti
                    String id,nome;
                    
                    System.out.println("Quanti utenti vuoi inserire?: ");
                    int numeroUtenti = scannerN.nextInt();

                    for(int i = 0; i<numeroUtenti; i++){
                        System.out.print("Inserisci il tuo nome: ");
                        nome = scannerS.nextLine();

                        System.out.print("Inserisci il tuo id: ");
                        id = scannerS.nextLine();

                        Cliente newCliente = new Cliente(id, nome);
                        negozio.aggiungiCliente(newCliente);
                    }

                    System.out.println("\nLista dei clienti registrati: ");
                    for(Cliente cliente : negozio.listaClienti){
                        System.out.println("Nome: "+cliente.nome+"  id: "+ cliente.id);
                    }
                    break;

                case 2://Aggiungi dolci
                    String nomeDolce;
                    double prezzo;

                    System.out.println("Quanti dolci vuoi inserire?: ");
                    int numeroDolci = scannerN.nextInt();

                    for (int i = 0; i < numeroDolci; i++) {
                        System.out.print("Inserisci il nome del dolce numero "+i+": ");
                        nomeDolce = scannerS.nextLine();

                        System.out.print("Inserisci il prezzo del dolce numero "+i+": ");
                        prezzo = scannerN.nextDouble();

                        Dolce newDolce = new Dolce(nomeDolce, prezzo);
                        negozio.aggiungiDolce(newDolce);
                    }

                    System.out.println("Lista dei dolci disponibili: ");
                    for (Dolce dolce : negozio.dolciDisponibili) {
                        System.out.println("Nome: " + dolce.nome + "  prezzo: " + dolce.prezzo);
                    }
                    break;

                case 3://Rimuovi dolci
                    String eliminaDolce;

                    System.out.println("\nDammi il nome del dolce da eliminare ");
                    break;

                case 4:

                    break;

                case 5:
                    System.out.println("\n***********************");
                    System.out.println("\n\tOUT");
                    System.out.println("\n***********************");
                    running = false;
                    break;
    
                default:
                System.out.println("\nInserisci un valore valido.");
                waitInput(scannerS);
                clearDisplay();
                    break;
            }
        }

        scannerN.close();
        scannerS.close();
        
    }



    static void clearDisplay() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void waitInput(Scanner scanner) {
        System.out.print("\n\nPress Any Key To Continue...");
        scanner.nextLine();
    }

    // Funzione di stampa menù
    static void menu() {
        System.out.println("Select an option: \n");
        System.out.println("1. Aggiungi cliente");
        System.out.println("2. Aggiungi dolce");
        System.out.println("3. Rimuovi dolce");
        System.out.println("4. Gestisci acquisto");
        System.out.println("5. Quit");

        System.out.print("\nChoise: ");
    }
}

class Dolce {
    String nome;
    Double prezzo;

    public Dolce(String name, double price){
        nome = name;
        prezzo = price;
    }
    
}

class Cliente {
    String id;
    String nome;
    ArrayList<Dolce> listaDolci;

    public Cliente(String idCliente, String name){
        id = idCliente;
        nome = name;
        listaDolci = new ArrayList<>();
    }

    public void acquistaDolce(Dolce dolce){
        listaDolci.add(dolce);
        System.out.println("Hai acquistato questo dolce: "+ dolce.nome);
    }

    public void elencoAcquisti(){
        System.out.println("\nLista dei dolci acquistati: ");
        for(Dolce dolcetto: listaDolci){
            System.out.println("Hai acquistato un "+dolcetto.nome+" al costo di "+dolcetto.prezzo);
        }
    }
}

class Negozio {
    ArrayList<Dolce> dolciDisponibili;
    ArrayList<Cliente> listaClienti;

    public Negozio(){
        dolciDisponibili = new ArrayList<>();
        listaClienti = new ArrayList<>();
    }

    public void aggiungiDolce(Dolce dolce){
        dolciDisponibili.add(dolce);
        System.out.println("\nHai aggiunto un "+dolce.nome);
    }
    
    public void rimuoviDolce(Dolce dolce) {
        if(dolciDisponibili.contains(dolce)){
            System.out.println("\nHai eliminato un "+dolce.nome);
            dolciDisponibili.remove(dolce);
        }else{
            System.out.println("Dolce non trovato.");
        }
    }

    public void aggiungiCliente(Cliente cliente){
        listaClienti.add(cliente);
        System.out.println("\nHai aggiunto il cliente: "+cliente.nome);
    }
    public void gestisciAcquisto(String idCliente, Dolce dolce){
        boolean trovatoDolce = false;

        trovatoDolce = dolciDisponibili.contains(dolce);
        if (trovatoDolce) {
            for (Cliente cliente : listaClienti) {
                if (cliente.id.equalsIgnoreCase(idCliente)) {
                    cliente.acquistaDolce(dolce);
                    break;
                }
            }
        }else{
            System.out.println("\nDolce non trovato");
        }
    }
}



