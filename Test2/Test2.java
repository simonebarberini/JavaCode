public class Test2 {
    public static void main(String[] args) {
        Auto auto = new Auto("Audi", "A3", 2020, 4);
        Moto moto = new Moto("Yamaha", "R1", 2019, "Sport");

        System.out.println(auto.toString());
        System.out.println(moto.toString());
    }
}


class Veicolo {
    private String marca;
    private String modello;
    private int anno;

    public Veicolo(String marca, String modello, int anno) {
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public int getAnno() {
        return anno;
    }

    @Override
    public String toString() {
        return "Veicolo: Marca = " + marca + ", Modello = " + modello + ", Anno = " + anno;
    }
}

class Auto extends Veicolo {
    private int numeroPorte;

    public Auto(String marca, String modello, int anno, int numeroPorte) {
        super(marca, modello, anno);
        this.numeroPorte = numeroPorte;
    }

    public int getNumeroPorte() {
        return numeroPorte;
    }

    @Override
    public String toString() {
        return "Auto Marca = " + getMarca() + ", Modello = " + getModello() + ", Anno = " + getAnno() + ", Numero Porte = " + numeroPorte;
    }
}


class Moto extends Veicolo {
    private String tipoManubrio;

    public Moto(String marca, String modello, int anno, String tipoManubrio) {
        super(marca, modello, anno);
        this.tipoManubrio = tipoManubrio;
    }

    public String getTipoManubrio() {
        return tipoManubrio;
    }

    @Override
    public String toString() {
        return "Moto Marca = " + getMarca() + ", Modello = " + getModello() + ", Anno = " + getAnno() + ", Tipo Manubrio = " + tipoManubrio;
    } 
}


