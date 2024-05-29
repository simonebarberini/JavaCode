import java.time.LocalDate;

public class KitProntoSoccorso implements DispositivoDiSicurezza{
    private LocalDate scadenzaDate;
    private boolean stato;

    public LocalDate getScadenzaDate() {
        return scadenzaDate;
    }

    public boolean stato() {
        return stato;
    }

    public KitProntoSoccorso(LocalDate scadenzaDate){
        this.scadenzaDate = scadenzaDate;
        this.stato = false;
    }

    @Override
    public void attiva() {
        this.stato =true;
        System.out.println("Kit di pronto soccorso attivo");
    }

    @Override
    public void disattiva() {
        this.stato = true;
        System.out.println("Kit di pronto soccorso disattivo");
    }

    @Override
    public boolean statoDispositivo() {
        LocalDate currentDate = LocalDate.now();
        if(scadenzaDate.isBefore(currentDate)){
            System.out.println("Il kit é scaduto");
            disattiva();
            return false;
        }else{
            System.out.println("Il kit NON é ancora scaduto");
            attiva();
            return false;
        }
    }

}
