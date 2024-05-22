package EsercizioPannaCotta;

import java.util.ArrayList;
import java.util.Scanner;

public class PannaCotta {
    private String nome;
    private ArrayList<String> ingredienti;
    private double prezzo;

    public PannaCotta(String nome, double prezzo){
        this.nome = nome;
        this.prezzo = prezzo;
        ingredienti = new ArrayList<>();
        ingredienti.add("Latte");
        ingredienti.add("Colla di pesce");
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public ArrayList<String> getIngredienti() {
        return ingredienti;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void aggiungiIngrediente(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInserisci il nome dell'ingrediente");
        String nomeIngrediente = scanner.nextLine();
        ingredienti.add(nomeIngrediente);
        System.out.println("Ingrediente: "+nomeIngrediente+" aggiunto");
        scanner.close();
    }


}
