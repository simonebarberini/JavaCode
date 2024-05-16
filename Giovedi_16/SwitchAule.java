import java.util.Scanner;

public class SwitchAule {
    public static void main(String[] args) {
        Scanner scannerN = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome: ");
        String nome = scannerS.nextLine();

        System.out.println("Inserisci la tua etá: ");
        int eta = scannerN.nextInt();

        System.out.println("Inserisci la tua sezione: ");
        String sezione = scannerS.nextLine();

        //Conversione da char a int
        char classe = sezione.charAt(0);
        int numClasse = Character.getNumericValue(classe);//Casting implicito

        if (numClasse>5 || numClasse<0) {
            System.out.println("Classe non valida: inserisci una classe compresa tra 1 e 5");
        }else if(eta>=6 && eta<12){
            System.out.println("Sei uno studente delle elementari");
            switch (numClasse) {
                case 1:
                    System.out.println(nome + " Vai in aula 4 ");
                    break;
                case 2:
                    System.out.println(nome +" Vai in aula 3 ");
                    break;
                case 3:
                    System.out.println(nome +" Vai in aula 12 ");
                    break;
                case 4:
                    System.out.println(nome +" Vai in aula 1 ");
                    break;
                case 5:
                    System.out.println(nome +" Vai in aula 11 ");
                    break;
                default:
                    System.out.println("Non sei iscritto a questa scuola ");
                    break;
            }
        } else if (eta >=12 && eta <15 ) {
            System.out.println("Sei uno studente delle scuole medie");
            switch (numClasse) {
                case 1:
                    System.out.println(nome + " Vai in aula 12 ");
                    break;
                case 2:
                    System.out.println(nome + " Vai in aula 5 ");
                    break;
                case 3:
                    System.out.println(nome + " Vai in aula 7 ");
                    break;
                default:
                System.out.println("Non sei iscritto a questa scuola ");
                    break;
            }
        } else if (eta >= 15 && eta < 20) {
            System.out.println("Sei uno studente delle superiori");
            switch (numClasse) {
                case 1:
                    System.out.println(nome + " Vai in aula 22 ");
                    break;
                case 2:
                    System.out.println(nome + " Vai in aula 5 ");
                    break;
                case 3:
                    System.out.println(nome + " Vai in aula 6 ");
                    break;
                case 4:
                    System.out.println(nome + " Vai in aula 13 ");
                    break;
                case 5:
                    System.out.println(nome + " Vai in aula 15 ");
                    break;
                default:
                    System.out.println("Non sei iscritto a questa scuola ");
                    break;
            }
        } else if (eta >= 20) {
            System.out.println("Sei uno studente universitario");
            switch (numClasse) {
                case 1:
                    System.out.println(nome + " Vai in aula 12 per la lezione di chimica");
                    break;
                case 2:
                    System.out.println(nome + " Vai in aula 5 per la lezione di filosofia");
                    break;
                case 3:
                    System.out.println(nome + " Vai in aula 7 per la lezione di informatica");
                    break;
                case 4:
                    System.out.println(nome + " Vai in aula 9 per la lezione di matematica");
                    break;
                case 5:
                    System.out.println(nome + " Vai in aula 10 per la lezione di geometria");
                    break;
                default:
                    System.out.println("Non sei iscritto a questa scuola ");
                    break;
            }
        }
        scannerN.close();
        scannerS.close();
    }
}
