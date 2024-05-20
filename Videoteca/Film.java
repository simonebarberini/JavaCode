import java.util.Scanner;

public class Film {
    String title;
    int year;

    public Film(String titolo, int anno){
        title = titolo;
        year = anno;
    }
    public String getTitle(){
        return title;
    }

    public int getYear(){
        return year;
    }
    public void setTitle(Scanner scanner){
        System.out.println("Inserisci il titolo: ");
        title = scanner.nextLine();
    }
    
    public void setYear(Scanner scanner) {
        System.out.println("Inserisci il titolo: ");
        year = scanner.nextInt();
    }
}
