import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scannerN = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        boolean run = true;
        String uno = "1";
        String due = "2";
        String tre = "3";
        int scelta;
        int sceltaDue;
        String risposta;
       

        while (run) {
            System.out.println("Inserisci un numero tra 1 e 3: \n(1)Menu\n(2)Saluta\n(3)Stampa");
            scelta = scannerN.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println(uno);
                    break;
                case 2: 
                    System.out.println(due);
                    break;
                case 3:
                    System.out.println(tre);
                    break;
                default:
                    System.out.println("Input non valido ");
                    break;
            }
            System.out.println("Vuoi sovrascrivere un case? ");
            risposta = scannerS.nextLine();
            if (risposta.trim().equalsIgnoreCase("si")) {
                System.out.println("Quale case vuoi sovrascriver? 1, 2 o 3");
                sceltaDue= scannerN.nextInt();
                switch (sceltaDue) {
                    case 1:
                        System.out.println("Cosa vuoi che stampi il case 1?");
                        uno = scannerS.nextLine();
                        break;
                    case 2:
                        System.out.println("Cosa vuoi che stampi il case 2?");
                        due = scannerS.nextLine();
                        break;
                    case 3:
                        System.out.println("Cosa vuoi che stampi il case 3?");
                        tre = scannerS.nextLine();
                        break;
                    default:
                        System.out.println("Input non valido ");
                        break;
                }
                
            }
            System.out.println("Vuoi continuare il programma? si o no?");
            if (!scannerS.nextLine().trim().equalsIgnoreCase("si")) {
                run = false;
            }

        }
    
    }
}