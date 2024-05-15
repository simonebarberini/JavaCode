import java.util.Scanner;

public class StampaEta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci la tua etá: ");
        int eta = in.nextInt();
        if (eta<18) {
            System.out.println("Sei minorenne hai " + eta +" anni");
        }else if (eta>=18 && eta<26) {
            System.out.println("Sei maggiorenne hai " + eta + " anni");
        }else if(eta>=26 && eta<60){
            System.out.println("Sei un adulto hai " + eta + " anni");
        }else{
            System.out.println("Sei anziano hai " + eta + " anni");
        }
        in.close();
    }
}
