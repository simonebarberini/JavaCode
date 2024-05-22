package EsercizioPannaCotta;

public class PannaCottaCioccolato extends PannaCotta {
    double percentualeCioccolato;

    public PannaCottaCioccolato(String nome, double prezzo, double percentualeCioccolato){
        super(nome, prezzo);
        this.percentualeCioccolato = percentualeCioccolato;
    }

    public double getPercentualeCioccolato() {
        return percentualeCioccolato;
    }

    public void setPercentualeCioccolato(double percentualeCioccolato) {
        this.percentualeCioccolato = percentualeCioccolato;
    }

}