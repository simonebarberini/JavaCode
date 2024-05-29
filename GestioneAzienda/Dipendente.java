public abstract class Dipendente implements BonusCalcolabile {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Dipendente(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public abstract double calculateBonus();

    
    
}