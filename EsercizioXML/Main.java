import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = UserInput.createUser();
        System.out.println(user.toString());
        Scanner scanerS = new Scanner(System.in);
        System.out.println("Vuoi salvare le informazini in un file XML");
        if(scanerS.nextLine().trim().equals("si")){
            System.out.println("Inserisci il nome del file in cui vuoi salvare le tue info.");
            String fileName = scanerS.nextLine();
            UserInput.serializeToXML(user, fileName);
        }else{
            System.out.println("Arrivederci.");
        }
    }
}
