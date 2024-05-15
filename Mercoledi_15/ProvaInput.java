/*
 * È una classe utilizzata per ottenere input dell'utente, la troviamo nella libreria "java.util". 
 * Per utilizzare lo scanner dobbiamo prima importare la classe Scanner.
 * Per ricavare il valore inserito dall'utente bisogna usare le funzioni di Scanner, 
 * come "nextLine()" che legge i valori String.
 * Nota: per accedere alle funzioni (come per i metodi e tutti gli elementi accessibili) bisogna utilizzare il ".";
 * 
 * Scanner ha le funzioni per leggere le principali 8 primitive di java e sono:
 * nextLine() - legge i valori di tipo char e String;
 * nextBoolean() - legge i valori di tipo booleano;
 * nextByte() - legge i valori di tipo byte;
 * nextDouble() - legge i valori di tipo double;
 * nextFloat() - legge i valori di tipo float;
 * nextInt() - legge i valori di tipo int;
 * nextLong() - legge i valori di tipo long;
 * nextShort() - legge i valori di tipo short;
 * Nota: inserire un valore in input di diverso tipo da quello che si aspetta lo Scanner con le funzioni 
 * di lettura genererà un errore (come "InputMismatchException")
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
