public class Ingrediente {
    public String nome;
    public double prezzo;

    public Ingrediente(String nome, double prezzo){
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }
    
    public double getPrezzo() {
        return prezzo;
    }
}
