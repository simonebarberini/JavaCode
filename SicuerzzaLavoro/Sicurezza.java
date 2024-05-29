import java.util.ArrayList;

public class Sicurezza {
    private ArrayList<DispositivoDiSicurezza> dispositivi;

    public Sicurezza(){
        dispositivi = new ArrayList<>();
    }

    public void addDispositivo(DispositivoDiSicurezza disp){
        dispositivi.add(disp);
    }

    public void verificaDispositivi(){
        for(DispositivoDiSicurezza disp: dispositivi){
            disp.statoDispositivo();
            System.out.println();
            System.out.println();
        }
    }

}
