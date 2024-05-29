public class Tecnico extends Amministrativo {
    public Tecnico(String name, double salary, double bonusPercentage){
        super(name, salary, bonusPercentage);
    }

    @Override
    public double calculateBonus() {
        double bonus = getSalary() * bonusPercentage / 100;
        return bonus;
    }
}
