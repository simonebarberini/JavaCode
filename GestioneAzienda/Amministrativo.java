public class Amministrativo extends Dipendente{
    final double bonusPercentage;

    public Amministrativo(String name, double salary, double bonusPercentage){
        super(name, salary);
        this.bonusPercentage = bonusPercentage; 
    }
    @Override
    public double calculateBonus() {
        double bonus = getSalary()* this.bonusPercentage/100;
        return bonus;
    }
    
}
