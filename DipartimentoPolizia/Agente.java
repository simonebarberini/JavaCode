public abstract class Agente{
    String nome;
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getMatricola() {
        return matricola;
    }

    String cognome;
    String matricola;

    public abstract void descriviLavoro();
}