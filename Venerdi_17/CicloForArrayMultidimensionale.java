public class CicloForArrayMultidimensionale {
    public static void main(String[] args) {
        for(int i =1; i<=5; i++){
            System.out.println(i);
        }
        System.out.println();

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(int i = 0; i<cars.length; i++){
            System.out.println(cars[i]);
        }

        System.out.println();

        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println();

        int[][] myNumbers ={{1,2,3,4},{5,6,7}};
        System.out.println(myNumbers[1][2]);

        System.out.println();

        for(int i =0; i<myNumbers.length; i++){
            System.out.println();
            for(int j=0; j<myNumbers[i].length; j++){
                System.out.print(myNumbers[i][j]+" ");
            }
        }
        System.out.println();
    }
}
