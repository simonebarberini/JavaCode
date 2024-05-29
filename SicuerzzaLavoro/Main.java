import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sicurezza gestioneDispSicurezza = new Sicurezza();
        AllarmeAntincendio alarm = new AllarmeAntincendio();
        AllarmeAntincendio alarm2 = new AllarmeAntincendio();
        SistemaDiVentilazione vent = new SistemaDiVentilazione();
        SistemaDiVentilazione vent2 = new SistemaDiVentilazione();
        KitProntoSoccorso kit = new KitProntoSoccorso(LocalDate.of(2024, 12, 31));
        KitProntoSoccorso kit2 = new KitProntoSoccorso(LocalDate.of(2023, 4, 20));
        Estintore est = new Estintore(4.9);
        Estintore est2 = new Estintore(3.9);

        gestioneDispSicurezza.addDispositivo(est);
        gestioneDispSicurezza.addDispositivo(kit);
        gestioneDispSicurezza.addDispositivo(alarm);
        gestioneDispSicurezza.addDispositivo(vent);
        gestioneDispSicurezza.addDispositivo(kit2);
        gestioneDispSicurezza.addDispositivo(alarm2);
        gestioneDispSicurezza.addDispositivo(est2);
        gestioneDispSicurezza.addDispositivo(vent2);

        gestioneDispSicurezza.verificaDispositivi();

        Scanner scannerN = new Scanner(System.in);
        
        // while (true) {
        //     System.out.println("Scegli un dispositivo da aggiungere\n");
        //     System.out.println("1. Estintore");
        //     System.out.println("2. Kit Pronto Soccorso");
        //     System.out.println("3. Allarme antincendio");
        //     System.out.println("4. Sistema di ventilazione");
        //     System.out.println("5. Esci\n");
        //     System.out.print("Choice: ");

        //     int choice = scannerN.nextInt();
        //     switch (choice) {
        //         case 1:
        //             System.out.println("Quale é la pressione del tuo estintore? ");
        //             double press = scannerN.nextDouble();
        //             Estintore est3 = new Estintore(press);
        //             gestioneDispSicurezza.addDispositivo(est3);
        //             break;
        //         case 2:
        //             System.out.println("Quale é la pressione del tuo estintore? ");
        //             LocalDate data;
        //             while(true){
        //                 System.out.println("Inserisci una da");
        //             }
        //             Estintore kit3 = new Estintore(data);
        //             gestioneDispSicurezza.addDispositivo(est3);
        //             break;
            
        //         default:
        //             break;
        //     }
        // }

        
    }
}
