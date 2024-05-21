import java.util.ArrayList;

public class Videoteca {
    ArrayList<Film> filmList;
    ArrayList<Utente> utenti;

    public Videoteca(){
        filmList = new ArrayList<>();
        utenti = new ArrayList<>();
    }

    public void addFilm(Film film){
        filmList.add(film);
        System.out.println("Film aggiunto: "+film.getTitle());
    }

    public void signUser(Utente utente){
        utenti.add(utente);
        System.out.println("Utente aggiunto: " + utente);
    }

    public void removeFilm(Film film){
        filmList.remove(film);
        System.out.println("Film rimosso: " + film.getTitle());
    }

    public void rentFilm(Utente utente, Film film){
        if(filmList.contains(film)){
            utente.rentFilm(film);
            System.out.println("Film \""+film.getTitle()+"\" noleggiato da " + utente.getName());
        }else{
            System.out.println("Film non disponibile ");
        }
    }

    public void userList(){
        if(utenti.isEmpty()){
            System.out.println("Nessun utente registrato.");
        }else{
            for (int i = 0; i<utenti.size();i++) {
                System.out.println(i+")"+"id: "+utenti.get(i).id+" nome: "+utenti.get(i).getName());
            }
        }
    }

    public void filmList() {
        if (filmList.isEmpty()) {
            System.out.println("Nessun film disponibile.");
        } else {
            for (int i = 0; i < filmList.size(); i++) {
                System.out.println(i + ")" + filmList.get(i).getTitle()+", "+filmList.get(i).getYear());
            }
        }
    }
}
