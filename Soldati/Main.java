public class Main {
    public static void main(String[] args) {
        Soldato soldatoFanteria = new Fanteria("Francesco", "Martini", "Generale", "Ariete", "Incursione");
        Soldato soldatoArtiglieria = new Artiglieria("Ryan", "Marin", "Colonnello", "Mitragliatrice tattica", "assalitore");

        soldatoFanteria.combatti();
        soldatoArtiglieria.combatti();
    }
}
