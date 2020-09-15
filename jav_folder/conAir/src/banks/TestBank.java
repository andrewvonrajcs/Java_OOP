package banks;

public class TestBank {
    public static void main(String[] args) {
        SBI mine = new SBI();
        PNB yours = new PNB();
        mine.getRateOfInterest();
        yours.getRateOfInterest();
    }
}