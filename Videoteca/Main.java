import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerS = new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);
        Videoteca videoteca = new Videoteca();
        boolean running = true;
        int scelta;


        System.out.println("Sistema di gestione dei noleggi.");

        while (running) {
            System.out.println("\nScegli un'operazione da svolgere:");
            System.out.println("1. Aggiungi film");
            System.out.println("2. Rimuovi film");
            System.out.println("3. Registra utente");
            System.out.println("4. Noleggia film");
            System.out.println("5. Elenco film disponibili");
            System.out.println("6. Elenco utenti registrati");
            System.out.println("7. Film noleggiati da utente x.");
            System.out.println("8. Esci");
            System.out.print("Scelta: ");
            scelta = scannerN.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci il titolo del film: ");
                    String titleAdd = scannerS.nextLine();
                    System.out.println("Inserisci l'anno di uscita del film: ");
                    int yearAdd = scannerN.nextInt();
                    Film filmAdd = new Film(titleAdd, yearAdd);
                    videoteca.addFilm(filmAdd);
                    break;
                case 2:
                    System.out.println("Inserisci il titolo del film da rimuovere: ");
                    String titleRemove = scannerS.nextLine();
                    Film filmRemove = null;
                    for (Film film : videoteca.filmList) {
                        if(film.getTitle().equalsIgnoreCase(titleRemove)){
                            filmRemove = film;
                            break;
                        }
                    }
                    if(filmRemove!=null){
                        videoteca.removeFilm(filmRemove);
                    }else{
                        System.out.println("Film non trovato.");
                    }
                    break;
                case 3:
                    System.out.println("Inserisci id utene: ");
                    String idAdd = scannerS.nextLine();
                    System.out.println("Inserisci nome utente: ");
                    String nomeAdd = scannerS.nextLine();
                    Utente utenteAdd = new Utente(idAdd, nomeAdd);
                    videoteca.utenti.add(utenteAdd);
                    System.out.println("Utente: "+utenteAdd.getName()+ ", aggiunto.");
                    break;
                case 4:
                    System.out.println("Inserisci l'id dell'utente che vuole effettuare il noleggio: ");
                    videoteca.userList();
                    String utenteId = scannerS.nextLine();
                    System.out.println("Inserisci il titolo del film da noleggiare da uno di quelli in lista: ");
                    videoteca.filmList();
                    String titleRent = scannerS.nextLine();
                    Film filmRent = null;
                    Utente utenteRent = null;

                    for(Utente utente: videoteca.utenti){
                        if(utente.id.equalsIgnoreCase(utenteId)){
                            utenteRent = utente;
                        }
                    }

                    for (Film film : videoteca.filmList) {
                        if (film.getTitle().equalsIgnoreCase(titleRent)) {
                            filmRent = film;
                            break;
                        }
                    }
                    if(filmRent!=null && utenteRent!= null){
                        videoteca.rentFilm(utenteRent, filmRent);
                    }else if (filmRent ==null) {
                        System.out.println("Film non disponibile.");
                    }else{
                        System.out.println("Utente non registrato.");
                    }
                    break;
                case 5:
                    System.out.println("Elenco film disponibili: ");
                    videoteca.filmList();
                    break;
                case 6:
                    System.out.println("Elenco utenti registrati: ");
                    videoteca.userList();
                    break;
                case 7:
                    
                case 8:
                    running = false;
                    System.out.println("Uscita dal programma...");
            
                default:
                    break;
            }
        }
        
    }
}