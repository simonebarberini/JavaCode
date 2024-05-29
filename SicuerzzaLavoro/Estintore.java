public class Estintore implements DispositivoDiSicurezza{
    private boolean stato;
    private double pressione;

    public Estintore(double pressione){
        this.pressione = pressione;
        this.stato = false;
    }
    public double getPressione() {
        return pressione;
    }
    public void setPressione(double pressione) {
        this.pressione = pressione;
    }

    @Override
    public void attiva() {
        this.stato = true;
        System.out.println("Estintore attivo.");
    }

    @Override
    public void disattiva() {
        this.stato = false;
        System.out.println("Estintore disattivo.");
    }

    @Override
    public boolean statoDispositivo() {
        if(pressione>4.6){
            System.out.println("Estintore funzionante pressione attuale: "+getPressione());
            attiva();
            return true;
        }else{
            System.out.println("Estintore non funzionante pressione inferiore a 4.6 riparare o aumentare pressione;"+
                "\npressione attuale:"+getPressione());
                disattiva();
                return false;
        }

    }
    
}
