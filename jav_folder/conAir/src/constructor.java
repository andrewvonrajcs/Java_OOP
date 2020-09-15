public class constructor {
    public constructor(){
        System.out.println("Default constructor ran.");
    }
    
    public constructor(int value) {
        System.out.println(value);
      }
    
      public static void main(String[] args) {
        //create instances here
        constructor c = new constructor(5839);

        //use no arg constructor
        constructor cNoArg = new constructor();

      }
}   