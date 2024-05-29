import java.util.Scanner;

public class SistemaDiVentilazione implements DispositivoDiSicurezza {
    private boolean stato;
    public SistemaDiVentilazione(){
        this.stato =false;
    } 

    public boolean getStato() {
        return stato;
    }

    @Override
    public void attiva() {
        this.stato = true;
        System.out.println("Sistema di ventilazione attivato");
    }

    @Override
    public void disattiva() {
        this.stato = false;  
        System.out.println("Sistema di ventilazione disattivato");  
    }

    @Override
    public boolean statoDispositivo() {
        Scanner scanner = new Scanner(System.in);
        if(getStato()){
            System.out.println("Sistema di ventilazione attivo.");
            System.out.println("Vuoi disattivarlo? (1)SI  (2)NO.");
            if (scanner.nextInt()==1) {
                disattiva();
            }
            return true;
        }else{
            System.out.println("Sistema di ventilazione disattivo.");
            System.out.println("Vuoi attivarlo? (1)SI  (2)NO.");
            if (scanner.nextInt() == 1) {
                attiva();
            }
            return false;
        }

    }
}
