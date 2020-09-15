package doodling;

public class forFun {
    //constructor
    public forFun() {
        System.out.println("I walked");
    }
    public forFun(int value) {
        System.out.println("I walked " + value +  " miles ");
 
    }
    //Methods
    public void stop() {
        System.out.println("I stoped walking");
    }
    public static void main(String[] args) {
        forFun John = new forFun();
        forFun Lyss = new forFun(); 
        John.stop();
        Lyss.stop();
    }
}