public class WrapperClass {
    public static void main(String[] args) {
        
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14; 
        
        if (a==true){
            System.out.println("It's Correct!");
        }
        else if (b=='@'){
            System.out.println("@ is the symbol");
        }
        else if (c==123){
            System.out.println("123 is desired integer!");
        }
        else if (d==3.14){
            System.out.println("Value of pi");
        }
        else{
            System.out.println(" Error 404 !");
        }
    }
}
