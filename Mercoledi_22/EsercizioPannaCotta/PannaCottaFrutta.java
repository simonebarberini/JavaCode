package EsercizioPannaCotta;

public class PannaCottaFrutta extends PannaCotta{
    String tipoFrutta;

    public PannaCottaFrutta(String nome, double prezzo, String tipoFrutta){
        super(nome, prezzo);
        this.tipoFrutta = tipoFrutta;
    }

    public String getTipoFrutta() {
        return tipoFrutta;
    }

    public void setTipoFrutta(String tipoFrutta) {
        this.tipoFrutta = tipoFrutta;
    }
    
    
}