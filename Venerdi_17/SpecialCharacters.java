/*
 * La soluzione standard per dividere una stringa è usando split() metodo fornito dal String classe. 
 * Accetta un'espressione regolare come delimitatore e restituisce un array di stringhe. Per dividere 
 * su qualsiasi carattere di spazio vuoto, puoi utilizzare la classe di caratteri predefinita \s che rappresenta uno spazio vuoto.
 */

import java.util.Arrays;

public class SpecialCharacters {
    public static void main(String[] args){
            String str = "Hello World";
            String[] words = str.split("\\s");
            System.out.println(Arrays.toString(words));
        }
    }