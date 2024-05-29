import java.time.LocalDate;

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
    }
}
