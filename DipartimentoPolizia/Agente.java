public abstract class Agente{
    String nome;
    String cognome;
    String matricola;
    
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getMatricola() {
        return matricola;
    }

    public abstract void descriviLavoro();
}