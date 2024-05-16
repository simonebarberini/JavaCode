/*
 * Casting: Conversione di tipo, operazione con cui si converte una variabile da un tipo di dato a un altro
 * questo passaggio é effettuato per avvantaggiarsi di alcune caratteristiche delle gerarchie dei tipi. 
 * Per esempio, i valori di un intervallo limitato (come quello degli interi) possono essere immagazzinati 
 * in piccole quantità di memoria, per poi essere convertiti in un formato diverso che potenzialmente 
 * permette nuove operazioni, come la divisione con varie cifre decimali di precisione.
 * Nei linguaggi di programmazione orientati agli oggetti, la conversione di tipo permette ai programmi 
 * di trattare gli oggetti come se fossero di un tipo antenato, ad esempio per semplificare l'interazione 
 * con questi oggetti.
 * 
 * Due tipi di casting e due forme:
 * Esplicito: verso il basso--> verso un tipo piú piccolo.(perdita di informazione) float-->int
 * Implicito: verso l'alto--> verso un tipo piú grande. int --> float
 */

public class Casting {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        float c, d;

        c = 5/3;// casting implicito poiché c é di tipo float stampa 1,00
        d = (float) a/b; //casting esplicito stampa 1,6666666
        System.out.println("Casting implicito di c: "+c);
        System.out.println("Casting esplicito di d: " + d);
    }
}
