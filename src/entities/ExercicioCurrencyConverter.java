package entities;

public class ExercicioCurrencyConverter {
    
    public static double IOF = 0.06;
    
    public static double dollarToReal(double dollarPrice, double dollarBought) {
        return dollarPrice * dollarBought * (1.0 + IOF);
    }

}
