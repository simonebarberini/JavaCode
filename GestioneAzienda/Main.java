public class Main {
    public static void main(String[] args) {
        final double percentualeBonusTecnico = 10;
        final double percentualeBonusAmministrativo = 15;
        final double percentualeBonusManager = 20;
        Dipendente tecnico = new Tecnico("Mario Rossi", 30000, percentualeBonusTecnico);
        Dipendente amministrativo = new Amministrativo("Anna Bianchi", 25000, percentualeBonusAmministrativo);
        Dipendente manager = new Manager("Luca Verdi", 50000, percentualeBonusManager);

        

        System.out.println(tecnico.getName() + " bonus: " + tecnico.calculateBonus());
        System.out.println(amministrativo.getName() + " bonus: " + amministrativo.calculateBonus());
        System.out.println(manager.getName() + " bonus: " + manager.calculateBonus());
    }
}
