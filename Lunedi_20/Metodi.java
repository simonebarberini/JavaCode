public class Metodi {
    int x = 5;

    public void printX(){//metodo non statico di proprietá dell'oggetto metodi
        System.out.println(x);
    }

    public static void myMethod(){//metodo statico di proprietá della classe, accessibile senza la costruzione di un oggetto Metodi
        System.out.println("Sono un metodo statico.");
    }
    public static void main(String[] args) {
        myMethod();
        Metodi myObj = new Metodi();
        System.out.println(myObj.x);
        myObj.printX();
    }
}
