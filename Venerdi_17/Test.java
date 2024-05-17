public class Test {
    public static void main(String[] args) {
        int counter = 1;
        int somma =0;
        while (counter<=50) {
            if(counter%2==0){
                somma += counter;
            }
            counter++;
        }
        System.out.println(somma);
    }
}
