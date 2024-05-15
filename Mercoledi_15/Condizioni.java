/*
 * In informatica, nell'ambito della programmazione, la selezione (dettastruttura condizionale) è, 
 * all'interno di un algoritmo risolutivo di un problema dato, una struttura di controllo del flusso 
 * di esecuzione di un programma che indica all'elaboratore, in base alla verifica di una condizione 
 * logica specificata, quale fra due sequenze o blocchi di istruzioni eseguire, realizzando dunque un 
 * controllo logico di elaborazione. 
 * 
 * Assieme alla sequenza e all'iterazione è una struttura fondamentale per la risoluzione algoritmica di 
 * un dato problema secondo il Teorema di Böhm-Jacopini.
 * 
 */

public class Condizioni {
    public static void main(String[] args) {

        //Condizioni logiche della matematica
        // È possibile utilizzare queste condizioni per eseguire azioni diverse per
        // decisioni diverse.
        int a = 10;
        int b = 9;
        System.out.println(a>b);//true
        System.out.println(a<b);//false
        System.out.println(a!=b);//true
        System.out.println(a==b);//flase

        //Prova IF non si usano direttamente i numeri ma le variabili
        if(20>18){
            System.out.println("20 is greater than 18");
        }

        //Prova IF con varibili
        int time = 20;
        if (time<18) {
            System.out.println("Good Day.");
        }else{
            System.out.println("Good Evening");
        }
        //Outputs Good Day

        // É possibile ottenere lo stesso risultato senza fare l'if e su una riga
        // soltanto
        String result = (time < 18) ? "Good Day" : "Good Evening";
        System.out.println("Risultato di: String result = (time<18)?\"Good Day\":\"Good Evening\";---> " + result);
        // Outputs Good Evening

        //Prova Else If
        time = 22;
        if (time<10) {
            System.out.println("Good Morning");
        }else if(time<18){
            System.out.println("Good Day");
        }else{
            System.out.println("Good Evening");
        }
        //Outputs "Good Evening"

                                        //Switch
        //Invece di scrivere molte if..else , puoi usare la dichiarazione switch .
        //L'istruzione switch seleziona uno dei tanti blocchi di codice da eseguire
        /*
         * L'espressione switch viene valutata una volta. Il valore dell'espressione
         * viene confrontato con i valori di ciascun case.
         * 
         * Se c'è una corrispondenza, viene eseguito il blocco di codice associato.
         * 
         * Le parole chiave break e default sono facoltative e verranno descritte più
         * avanti in questo capitolo
         * 
         * L'esempio seguente utilizza il numero del giorno della settimana per
         * calcolare il nome del giorno della settimana:
         */

        int x = 1;

         switch (x) {
            case 1:
                System.out.println("Sei nel case 1");
                break;
            case 4:
                System.out.println("Sei nel case 4");
            default:
                System.out.println("Nessuna corrispondenza trovata");
                break;
         }










    }
}
