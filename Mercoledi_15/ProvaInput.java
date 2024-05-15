/*
 * È una classe utilizzata per ottenere input dell'utente, la troviamo nella libreria "java.util". 
 * Per utilizzare lo scanner dobbiamo prima importare la classe Scanner.
 * Per ricavare il valore inserito dall'utente bisogna usare le funzioni di Scanner, 
 * come "nextLine()" che legge i valori String.
 * Nota: per accedere alle funzioni (come per i metodi e tutti gli elementi accessibili) bisogna utilizzare il ".";
 * 
 */

import java.util.Scanner;

public class ProvaInput {
    public static void main(String[] args) {

    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input

    myObj.close();
    }

}
