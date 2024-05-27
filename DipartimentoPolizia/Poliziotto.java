public class Poliziotto extends Agente {
    String nome;
    String cognome;
    String matricola;

    public Poliziotto(String nome, String cognome, String matricola){
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }
    
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getMatricola() {
        return matricola;
    }

    @Override
    public void descriviLavoro() {
        System.out.println("Mi chiamo "+ getNome() +" "+getCognome()+" e sono un poliziotto");
    }
    
}
