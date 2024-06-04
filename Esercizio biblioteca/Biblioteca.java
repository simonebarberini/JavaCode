import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Biblioteca {

    static ArrayList<Libro> libriDisponibili;
    HashMap<Libro, Integer> copieDisponibili;
    HashMap<Libro, Integer> copiePrestate;

    public Biblioteca() {
        libriDisponibili = new ArrayList<>();
        copieDisponibili = new HashMap<>();
        copiePrestate = new HashMap<>();

        libriDisponibili.add(new Libro("Cent'anni di solitudine"));
        libriDisponibili.add(new Libro("Il GGG"));
        libriDisponibili.add(new Libro("Il Signore degli Anelli"));
        libriDisponibili.add(new Libro("Harry Potter"));
        libriDisponibili.add(new Libro("Orgoglio e Pregiudizio"));
        libriDisponibili.add(new Libro("Il Piccolo Principe"));
        libriDisponibili.add(new Libro("Moby Dick"));
        libriDisponibili.add(new Libro("Don Chisciotte"));
        libriDisponibili.add(new Libro("Decameron"));
        libriDisponibili.add(new Libro("I Promessi Sposi"));
        libriDisponibili.add(new Libro("Il ritratto di Dorian Gray"));
        libriDisponibili.add(new Libro("Il buio oltre la siepe"));
        libriDisponibili.add(new Libro("1984"));
        libriDisponibili.add(new Libro("La fattoria degli animali"));
        libriDisponibili.add(new Libro("Animal Farm"));
        libriDisponibili.add(new Libro("Il Maestro e Margherita"));
        libriDisponibili.add(new Libro("Dracula"));
        libriDisponibili.add(new Libro("Frankenstein"));
        libriDisponibili.add(new Libro("Il processo"));
        libriDisponibili.add(new Libro("L'uomo invisibile"));
        libriDisponibili.add(new Libro("Viaggio al centro della Terra"));
        libriDisponibili.add(new Libro("L'isola del tesoro"));
        libriDisponibili.add(new Libro("Moby Dick"));
        libriDisponibili.add(new Libro("Le avventure di Tom Sawyer"));
        libriDisponibili.add(new Libro("Il giro del mondo in 80 giorni"));
        libriDisponibili.add(new Libro("Ventimila leghe sotto i mari"));
        libriDisponibili.add(new Libro("I viaggi di Gulliver"));

    
        Random random = new Random();
        for (Libro libro : libriDisponibili) {
            int copieCasuali = random.nextInt(6); 
            copieDisponibili.put(libro, copieCasuali);
        }

        for (Libro libro : libriDisponibili) {
            copiePrestate.put(libro, 0);
        }
    }

   
    public Libro findLibro(String bookTitle) {
        for (Libro libro : libriDisponibili) {
            if (libro.getName().equalsIgnoreCase(bookTitle)) {
                return libro;
            }
        }
        return null;
    }

    public void prestaLibro(Scanner scanner) {
        System.out.println("Inserisci il titolo del libro da noleggiare");
        String bookName = scanner.nextLine();

        Libro libroDaPrestare = findLibro(bookName);
        if (libroDaPrestare != null) {
            if (copieDisponibili.get(libroDaPrestare) > 0) {
                int copie = copieDisponibili.get(libroDaPrestare);
                copie--;
                copieDisponibili.put(libroDaPrestare, copie);

                int copiePrestateVal = copiePrestate.getOrDefault(libroDaPrestare, 0);
                copiePrestateVal++;
                copiePrestate.put(libroDaPrestare, copiePrestateVal);
                System.out.println("Libro prestato con successo!");
            } else {
                System.out.println("Copie non disponibili");
            }
        } else {
            System.out.println("Libro non presente nella biblioteca");
        }
    }

    public void restituisciLibro(Scanner scanner) {
        System.out.println("Inserisci il titolo del libro da restituire");
        String bookName = scanner.nextLine();

        Libro libroDaRestituire = findLibro(bookName);
        if (libroDaRestituire != null) {
            if (copiePrestate.get(libroDaRestituire) > 0) {
                int copiePrestateVal = copiePrestate.get(libroDaRestituire);
                copiePrestateVal--;
                copiePrestate.put(libroDaRestituire, copiePrestateVal);

                int copieDisponibiliVal = copieDisponibili.get(libroDaRestituire);
                copieDisponibiliVal++;
                copieDisponibili.put(libroDaRestituire, copieDisponibiliVal);
                System.out.println("Libro restituito con successo!");
            } else {
                System.out.println("Non ci sono copie prestate di questo libro");
            }
        } else {
            System.out.println("Libro non presente nella biblioteca");
        }
    }

    public void aggiungiLibro(Scanner scanner) {
        System.out.println("Inserisci il titolo del libro da aggiungere");
        String bookName = scanner.nextLine();

        Libro nuovoLibro = new Libro(bookName);
        if (!libriDisponibili.contains(nuovoLibro)) {
            libriDisponibili.add(nuovoLibro);
            copieDisponibili.put(nuovoLibro, 1);
            copiePrestate.put(nuovoLibro, 0);
            System.out.println("Libro aggiunto con successo!");
        } else {
            System.out.println("Il libro è già presente nella biblioteca");
            //System.out.println("Vuoi aggiungere un'altra copia?");
            // if (scanner.nextLine().equalsIgnoreCase("si")) {
            //     int c = copieDisponibili.get(nuovoLibro);
            //     c++;
            //     copieDisponibili.put(nuovoLibro, c);
            //     System.out.println("Copia aggiunta con successo");
            // }else{
            //     System.out.println("Nessuna copia aggiunta");
            // }
        }
    }

    public void rimuoviLibro(Scanner scanner) {
        System.out.println("Inserisci il titolo del libro da rimuovere");
        String bookName = scanner.nextLine();

        Libro libroDaRimuovere = findLibro(bookName);
        if (libroDaRimuovere != null) {
            libriDisponibili.remove(libroDaRimuovere);
            copieDisponibili.remove(libroDaRimuovere);
            copiePrestate.remove(libroDaRimuovere);
            System.out.println("Libro rimosso con successo!");
        } else {
            System.out.println("Libro non presente nella biblioteca");
        }
    }

    public void stampaLibriDisponibili() {
        System.out.println("Libri disponibili nella biblioteca:");
        for (Libro libro : libriDisponibili) {
            int copie = copieDisponibili.get(libro);
            System.out.println(libro.getName() + ": " + copie+" copie");
        }
    }
}