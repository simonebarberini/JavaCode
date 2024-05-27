public class Artiglieria extends Soldato implements Specialista{
    String equipaggiamentoSpeciale;
    String specializzazione;
    public Artiglieria(String nome, String cognome, String grado, String equipaggiamentoSpeciale, String specializzazione){
        this.nome = nome;
        this.cognome = cognome;
        this.grado = grado;
        this.equipaggiamentoSpeciale = equipaggiamentoSpeciale;
        this.specializzazione = specializzazione;
    }

    @Override
    public void specializzazione() {
        System.out.println("Specializzaione: "+ this.specializzazione); 
    }

    @Override
    public void usaEquipaggiamentoSpeciale() {
        System.out.println("Sto usando " + this.equipaggiamentoSpeciale); 
    }

    @Override
    public void combatti() {
        System.out.println(toString());
        specializzazione();
        usaEquipaggiamentoSpeciale();
    }

    @Override
    public String toString() {
        return "Sono " + this.nome + " " + this.cognome + " un " + this.grado + " di artiglieria.";
    }
}
