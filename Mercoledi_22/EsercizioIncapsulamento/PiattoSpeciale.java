import java.util.ArrayList;


public class PiattoSpeciale {
    private ArrayList<Ingrediente> ingredientiPrivati;
    public ArrayList<Ingrediente> ingredientiPubblici;
    private double prezzoBase;
    public ArrayList<Ingrediente> ingredientiScelti;

    public PiattoSpeciale(){
        ingredientiPrivati = new ArrayList<>();
        ingredientiPubblici = new ArrayList<>();
        prezzoBase = 1.0;

        Ingrediente ing1 = new Ingrediente("Bacon", 1.25);
        Ingrediente ing2 = new Ingrediente("Salame", 2.25);
        Ingrediente ing3 = new Ingrediente("Cheddar", 3.00);
        Ingrediente ing8 = new Ingrediente("Maionese", 0.50);
        Ingrediente ing9 = new Ingrediente("Hamburger", 3.50);
        ingredientiPrivati.add(ing1);
        ingredientiPrivati.add(ing2);
        ingredientiPrivati.add(ing3);
        ingredientiPrivati.add(ing8);
        ingredientiPrivati.add(ing9);

        Ingrediente ing4 = new Ingrediente("Pane normale", 2.0);
        Ingrediente ing5 = new Ingrediente("Pane di sesamo", 3.50);
        Ingrediente ing6 = new Ingrediente("Mozzarella", 0.50);
        Ingrediente ing7 = new Ingrediente("Insalata", 0.50);
        ingredientiPubblici.add(ing4);
        ingredientiPubblici.add(ing5);
        ingredientiPubblici.add(ing6);
        ingredientiPubblici.add(ing7);

        ingredientiScelti = new ArrayList<>();
    }

    public void aggiungniIngrPublic(String nomeIng){
        boolean trovato =false;
        Ingrediente ingredienteDaAggiungere=null;
        for(Ingrediente ingr : ingredientiPubblici){
            if(ingr.nome.equalsIgnoreCase(nomeIng)){
                trovato = true;
                ingredienteDaAggiungere = ingr;
                break;
            }
        }
        if (trovato) {
            ingredientiScelti.add(ingredienteDaAggiungere);
            System.out.println("Ingrediente scelto disponibile e aggiunto al panino.");
        }else{
            System.out.println("Ingrediente scelto non disponibile.");
        }
    }

    //getter 
    public ArrayList<Ingrediente> getIngredientiPrivati() {
        return ingredientiPrivati;
    }

    public void stampaIngredientiScelti(){
        System.out.println("Ingredienti Scelti: ");
        for(Ingrediente ingrediente : ingredientiScelti){
            System.out.println("- "+ingrediente.nome+" "+ingrediente.prezzo);
        }
    }

    public void aggiungiInredientiPrivati(String nomeIng){
        boolean trovato = false;
        Ingrediente ingredienteDaAggiungere = null;
        for (Ingrediente ingr : ingredientiPrivati) {
            if (ingr.nome.equalsIgnoreCase(nomeIng)) {
                trovato = true;
                ingredienteDaAggiungere = ingr;
                break;
            }
        }
        if (trovato) {
            ingredientiScelti.add(ingredienteDaAggiungere);
            System.out.println("Ingrediente scelto disponibile e aggiunto al panino.");
        } else {
            System.out.println("Ingrediente scelto non disponibile.");
        }
    }

    public void calcolaPrezzo(){
        double totale = prezzoBase;
        for(Ingrediente ing : ingredientiScelti){
            totale += ing.prezzo;
        }
        System.out.println("Il totale del tuo panino é: "+totale);
    }


    

}
