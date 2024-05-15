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
        int time = 10;
        if (time<18) {
            System.out.println("Good Day.");
        }else{
            System.out.println("Good Evening");
        }
        //Outputs Good Day

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
    }
}
