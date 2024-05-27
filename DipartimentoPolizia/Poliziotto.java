public class Poliziotto extends Agente {


    public Poliziotto(String nome, String cognome, String matricola){
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }
    
    @Override
    public void descriviLavoro() {
        System.out.println("Mi chiamo "+ getNome() +" "+getCognome()+" e sono un poliziotto");
    }
    
}
