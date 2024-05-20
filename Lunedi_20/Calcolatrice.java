import java.util.Scanner;
import java.lang.Math;
public class Calcolatrice {
    public static void main(String[] args) {
        String message[] = {"Addizione", "Sottrazione", "Moltiplicazione", "Divisione"};
        int counter[] = {0,0,0,0};
        int operazione;
        float addendoUno;
        float addendoDue;
        String nomeUtente;
        Scanner scannerS = new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);
        boolean calcolatrice = true;
        float risultato;
        float risultatoErrato;
        String scelta;

        System.out.println("Insrisici il tuo nome utente: ");
        nomeUtente = scannerS.nextLine();

        while (calcolatrice) {
            System.out.println("Ciao "+nomeUtente+", scegli un operazione da svolgere:" +
            "\n-(0): Addizione\n-(1): Sottrazione\n-(2): Moltiplicazione\n-(3): Divisione");
            
            operazione = scannerN.nextInt();
            switch (operazione) {
                case 0:
                    counter[0]++;
                    System.out.println(nomeUtente+"Hai scelto la somma");
                    System.out.println("Inserisci il primo addendo: ");
                    addendoUno = scannerN.nextFloat();
                    System.out.println("Inserisci il secondo addendo: ");
                    addendoDue = scannerN.nextFloat();
                    risultato = addendoDue + addendoUno;
                    risultatoErrato = (float) (Math.random() * 101);
                    System.out.println("Risultato corretto : " + risultato +
                            "\nRisultato errato: " + risultatoErrato);
                    break;
                case 1:
                    counter[1]++;
                    System.out.println("Inserisci il primo addendo: ");
                    addendoUno = scannerN.nextFloat();
                    System.out.println("Inserisci il secondo addendo: ");
                    addendoDue = scannerN.nextFloat();
                    risultato = addendoUno-addendoDue;
                    risultatoErrato = (float) (Math.random() * 101);
                    System.out.println("Risultato corretto : "+ risultato+
                        "\nRisultato errato: "+risultatoErrato);
                    break;
                case 2:
                    counter[2]++;
                    System.out.println("Inserisci il primo addendo: ");
                    addendoUno = scannerN.nextFloat();
                    System.out.println("Inserisci il secondo addendo: ");
                    addendoDue = scannerN.nextFloat();
                    risultato = addendoDue * addendoUno;
                    risultatoErrato = (float) (Math.random() * 101);
                    System.out.println("Risultato corretto : " + risultato +
                            "\nRisultato errato: " + risultatoErrato);
                    break;
                case 3:
                    counter[3]++;
                    System.out.println("Inserisci il primo addendo: ");
                    addendoUno = scannerN.nextFloat();
                    System.out.println("Inserisci il secondo addendo: ");
                    addendoDue = scannerN.nextFloat();
                    if (addendoDue>addendoUno) {
                        risultato = addendoDue/addendoUno;
                    }else{
                        risultato = addendoUno / addendoDue;
                    }
                    risultatoErrato = (float) (Math.random() * 101);
                    System.out.println("Risultato corretto : " + risultato +
                            "\nRisultato errato: " + risultatoErrato);
                    break;
            
                default:
                    System.out.println("Scelta non valida scegliere un operazione tra quelle elencate.");
                    break;
            }
            System.out.println("Vuoi effettuare un'altra operazione? se si digitare [y] altrimenti premere invio.");
            scelta = scannerS.nextLine();
            if (!(scelta.toLowerCase().equals("y"))) {
                calcolatrice = false;
            }
        }
    
        for(int i = 0; i<counter.length; i++){
            System.out.println("Hai usato "+message[i]+" "+counter[i]+" volte");
        }
        scannerN.close();
        scannerS.close();
    }


}
