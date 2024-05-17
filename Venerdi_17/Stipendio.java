import java.util.Scanner;

public class Stipendio {
    public static void main(String[] args) {
        float stipendio;
        float numMesi=0;
        float tax=0;
        float stipendioTotale = 0;
        float stipendioLordo;
        float stipendioNetto;
        Scanner scannerS = new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);
        boolean datiInseriti = false;
        //String[] mesi ={"Genaio", "Febbraio","Marzo", "Aprile","Maggio","Giugno", "Luglio","Agosto","Settembre","Ottobre","Novembre", "Dicembre"};
        while (!datiInseriti) {
            System.out.println("Quanti mesi hai lavorato? ");
            numMesi= scannerN.nextInt();
            System.out.println("Qual'é la tua aliquota fiscsle? ");
            tax = scannerN.nextFloat();
            if(tax!=0 && numMesi!=0){
                datiInseriti =true;
            }
        }
        for (int i = 1;i<=numMesi;i++) {
            //System.out.println("Quanto hai guadagnato a "+mese);
            System.out.println("Quanto hai guadagnato il mese n."+i+" ?");
            stipendio = scannerN.nextFloat();
            stipendioTotale+= stipendio;
        }

        stipendioLordo = stipendioTotale/numMesi;
        stipendioNetto = (stipendioTotale-((stipendioTotale*tax)/100))/12;
        System.out.println("Stipendio medio lordo mensile : "+stipendioLordo);
        System.out.println("Stipendio medio netto mensile: "+ stipendioNetto);

        scannerN.close();
        scannerS.close();
    }
}
