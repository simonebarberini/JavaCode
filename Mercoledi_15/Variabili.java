public class Variabili {
    public static void main(String[] args) {
    
        int provaNumero = 12;
        System.out.println(provaNumero);

        String provaTesto = "Ciao Mondo";
        System.out.println(provaTesto);

        boolean provaBool = true;
        System.out.println(provaBool);

        // Dichiarazione e inizializzazione possono avvenire in momenti differenti
        int contatore;
        contatore = 0;
        System.out.println(contatore);

        final int provaCostante = 15;
        //provaCostante = 20; non puó essere riassegnata viene rilevato errore nell'IDE
        System.out.println("Costante:"+provaCostante);
        //Concatenazione
        String firstPart = "Ciao";
        String lastPart = "Mondo";
        String fullPart = firstPart + lastPart;
        System.out.println("Concatenazione di stringhe: "+fullPart);

        //Numeri
        // int x = 5;
        // int y =6;
        // System.out.println(x+y);

        //Valorizzazione delle variabili sulla stessa riga
        // int x = 5, y = 6, z = 50;
        // System.out.println(x + y + z); 

        int x, y, z;
        x = y = z =50;
        int result = x+y+z;
        System.out.println("Dichiarazione sulla stessa riga e Valorizzazione sulla stessa riga: "+result);

        //Concatenazione di stringhe e numeri
        int numero = 22;
        String parola = "ventidue";
        System.out.println("Concatenazione di Stringhe e numeri: " + parola + numero);//Vengono concatenati come se fossero entrambe stringhe

        String parolaNumero = "22";
        System.out.println("Concatenazione di Stringhe e numeri: "+ parolaNumero + numero);// Vengono concatenati come se fossero entrambe stringhe

        //I tipi primitivi solo da sapere che esistono 
        float myFloat = 6.76f; //10 cifre dopo lo zero
        double myDouble = 19.99d; //100 cifre dopo lo zero
        System.out.println("My float: " + myFloat);
        System.out.println("My double: " + myDouble);

        

    }
}
