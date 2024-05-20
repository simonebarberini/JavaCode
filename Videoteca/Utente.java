import java.util.ArrayList;

public class Utente {
    String id;
    String name;
    ArrayList<Film> rentedFilm;

    public Utente(String idString, String nameString){
        id = idString;
        name = nameString;
        rentedFilm = new ArrayList<Film>();
    }

    public void rentFilm(Film film){
        rentedFilm.add(film);
    }

    public void rentList(){
        for (Film film : rentedFilm) {
            System.out.println(film);
        }
    }

    public String getName(){
        return name;
    }
}
