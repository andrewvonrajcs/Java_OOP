package manyBanks;

public class returning {
    public static void main(String[] args) {
        bank myBank = new bank();
        SBI herBank = new SBI();
        ICICI him = new ICICI();
        AXIS her = new AXIS();
        myBank.getRateOfInterest();
        herBank.getRateOfInterest();
        him.getRateOfInterest();
        her.getRateOfInterest();
    }
}