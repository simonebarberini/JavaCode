/*
 * Possiamo usare ArrayList come struttura intermedia e aggiungere gli elementi nell'ArrayList usando il metodo add(). 
 * ArrayList è una struttura dati che ci consente di aggiungere dinamicamente elementi. 
 * Tuttavia, possiamo convertire l'ArrayList nell'array utilizzando il metodo toArray(). 
 * Quindi questo processo prevede i seguenti passaggi. 
 */

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static void main(String[] args) {
        Integer arr[] = { 1 , 2 , 3 , 4 , 5 , 6 };//array di interi  
        System.out.println( "Array: " +Arrays.toString(arr));  
        ArrayList<Integer> arrayList =  new  ArrayList<Integer>(Arrays.asList(arr));  
        arrayList.add( 7 );  
        arr = arrayList.toArray(arr);  
        System.out.println( "Array dopo aver aggiunto l'elemento: " +Arrays.toString(arr));
    }
}
