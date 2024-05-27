public class Test {
    public static void main(String[] args) {
        ContoBancario conto = new ContoBancario("12345678", 2223.99, "Campari Mirko");
        conto.preleva(223.99);
        conto.deposita(1022);
        System.out.println("Benvenuto " +conto.getTitolare()+"Saldo: "+ conto.getSaldo());
    }
}
class ContoBancario{
    private String numeroConto;
    private double saldo;
    private String titolare;

    public ContoBancario(String numeroConto, double saldo, String titolare){
        this.numeroConto = numeroConto;
        this.saldo = saldo;
        this.titolare = titolare;
    }

    public String getNumeroConto() {
        return numeroConto;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitolare() {
        return titolare;
    }

    public void deposita(double importo){
        this.saldo+=importo;
        System.out.println("Hai depositato: "+importo);

    }

    public void preleva(double importo){
        if(saldo>=importo){
            this.saldo -= importo;
            System.out.println("Hai prelevato: "+importo);
        }else{
            System.out.println("Saldo troppo basso, sul conto hai: "+getSaldo());
        }
    }
    

 }