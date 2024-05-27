public class Main {
    public static void main(String[] args) {
        Agente det = new Detective("Detective", "Conan", "123456");
        Agente pol = new Poliziotto("Salvatore", "Esposito", "123456");
        det.descriviLavoro();
        pol.descriviLavoro();
        System.out.println(det.getMatricola());
        System.out.println( pol.getMatricola());
    }
}
