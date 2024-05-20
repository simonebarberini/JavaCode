import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");// aggiunge in coda
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        cars.set(0, "Opel");
        System.out.println(cars.get(0));
        System.out.println(cars.size());// stampa la grandezza dell'array list (4)
        cars.remove(0);// rimuove l'elemento in posizione 0
        System.out.println(cars.size());// 3
        cars.clear();// pulisce l'arraylist
        System.out.println(cars.size());// 0
    }
}
