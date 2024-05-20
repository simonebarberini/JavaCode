/*
 * Chiedere all'utente di inserire 5 nomi e aggiungerli all'ArrayList.
 * Stampare tutti i nomi presenti nell'ArrayList.
 * Chiedere all'utente un nome da cercare nell'ArrayList e indicare se il nome è presente o meno.
 * Chiedere all'utente un nome da rimuovere dall'ArrayList e rimuoverlo, se presente.
 * Stampare la lista aggiornata dei nomi.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class EsercizioArrayListBase {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        Scanner scannerS = new Scanner(System.in);
        boolean trovato = false;
        String cercato;

        System.out.println("Inserisci cinque nomi da inserire nell'array list.");
        // Aggiunta
        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci nome [" + (i+1) + "] da inserire nell'array list.");
            names.add(scannerS.nextLine());
        }
        // Stampa
        for (String name : names) {
            System.out.println(names.indexOf(name) + " " + name);
        }
        // Ricerca
        System.out.println("Inserisci un nome da cercare nell'array list.");
        trovato = false;
        cercato = scannerS.nextLine();
        for (String name : names) {
            if (name.toLowerCase().equals(cercato.toLowerCase())) {
                trovato = true;
                //names.remove(names.indexOf(name));
                break;
            } else {
                trovato = false;
            }
        }
        if (trovato) {
            System.out.println(cercato + " é presente.");
        } else {
            System.out.println(cercato + " non é presente.");
        }

        // Rimozione
        System.out.println("Inserire un nome da rimuovere ");
        trovato = false;
        cercato = scannerS.nextLine();
        for (String name : names) {
            if (name.toLowerCase().equals(cercato.toLowerCase())) {
                trovato = true;
                names.remove(names.indexOf(name));
                break;
            } else {
                trovato = false;
            }
        }
        if (trovato) {
            System.out.println(cercato + " é stato rimosso.");
        } else {
            System.out.println(cercato + " non é presente e non é stato rimosso.");
        }

        // Stampa aggiornata
        for (String name : names) {
            System.out.println(names.indexOf(name) + " " + name);
        }
        scannerS.close();
    }
}