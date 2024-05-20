/*
 * Chiedere all'utente di inserire 5 nomi e aggiungerli all'ArrayList.
 * Stampare tutti i nomi presenti nell'ArrayList.
 * Chiedere all'utente un nome da cercare nell'ArrayList e indicare se il nome è presente o meno.
 * Chiedere all'utente un nome da rimuovere dall'ArrayList e rimuoverlo, se presente.
 * Stampare la lista aggiornata dei nomi.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class EsercizioArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        Scanner scannerS = new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);
        boolean trovato = false;
        boolean ricerca =true;
        boolean rimozione = true;
        String cercato;
        int numero;

        System.out.println("Inerisci il numero di nomi da inserire.");
        numero = scannerN.nextInt();
        System.out.println();
        System.out.println("Inserisci "+numero+ " nomi da inserire nell'array list.");
        //Aggiunta
        for(int i = 0; i<numero;i++){
            System.out.println("Inserisci nome ["+(i+1)+"] da inserire nell'array list.");
            names.add(scannerS.nextLine());
        }

        System.out.println();

        //Stampa
        for(String name: names){
            System.out.println(names.indexOf(name)+" "+name);
        }

        System.out.println();

        while (ricerca) {
            // Ricerca
            System.out.println("Inserisci un nome da cercare nell'array list.");
            trovato = false;
            cercato = scannerS.nextLine();
            for (String name : names) {
                if (name.toLowerCase().equals(cercato.toLowerCase())) {
                    trovato = true;
                    // names.remove(names.indexOf(name));
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
            System.out.println("Vuoi effettuare una nuova ricerca? [y] Si alrtrimenti premi invio.");
            if (scannerS.nextLine().toLowerCase().trim().equals("y")) {
                ricerca = true;
            } else {
                ricerca = false;
            }
        }
        

        //Rimozione
        while (rimozione){
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
            System.out.println("Vuoi effettuare una nuova rimozione? [y] Si alrtrimenti premi invio.");
            if (scannerS.nextLine().toLowerCase().trim().equals("y")) {
                rimozione = true;
            } else {
                rimozione = false;
            }

        }
        
        // Stampa aggiornata
        for (String name : names) {
            System.out.println("["+names.indexOf(name) + "] " + name);
        }
        scannerS.close();
        scannerN.close();
    }
}
