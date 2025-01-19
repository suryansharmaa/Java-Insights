public class Arrays {
    public static void main(String[] args) {
        
        // Array

        String [] Cars = {"R8", "M8 Competiton", "Huracane V12", "Ghost"};
        System.out.println(Cars[2]);

        String[] Car = new String[4];

        Car[0] = "Audi";
        Car[1] = "BMW";
        Car[2] = "Lamborghini";
        Car[3] = "Rolls Royce";

        for (int i=0; i<Car.length; i++){
            System.out.println(Car[i]);
        }

        //2D Arrays

        String[][] Marks = {
            {"48", "47", "49"},
            {"50", "49", "47"},
            {"49", "48", "50"}
        };

        for (int i=0; i<Marks.length; i++){
            System.out.println();
            for (int j=0; j<Marks[i].length; j++){
                System.out.print(Marks[i][j]+"  ");
            }
        }
    }
}
