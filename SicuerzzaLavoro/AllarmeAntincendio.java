import java.util.Scanner;

public class AllarmeAntincendio implements DispositivoDiSicurezza{
    private boolean stato;
    
    public AllarmeAntincendio(){
        this.stato =false;
    }

    
    @Override
    public void attiva() {
        this.stato = true;
        System.out.println("Allarme attivato");
    }

    @Override
    public void disattiva() {
        this.stato = false;  
        System.out.println("Allarme disattivato");  
    }

    @Override
    public boolean statoDispositivo() {
        Scanner scanner = new Scanner(System.in);
        if(getStato()){
            System.out.println("Allarme antincendio attivo.");
            System.out.println("Vuoi disattivarlo? (1)SI  (2)NO.");
            if (scanner.nextInt()==1) {
                disattiva();
            }
            return true;
        }else{
            System.out.println("Allarme antincendio disattivo.");
            System.out.println("Vuoi attivarlo? (1)SI  (2)NO.");
            if (scanner.nextInt() == 1) {
                attiva();
            }
            return false;
        }

    }

    public boolean getStato() {
        return stato;
    }
    
}
