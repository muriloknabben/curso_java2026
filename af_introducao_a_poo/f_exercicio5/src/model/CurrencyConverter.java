package model;

public class CurrencyConverter {

    public static final double IOF_PERCENTAGE = 6.00;

    public static double amount(double quantity, double dollarValue) {
        double reais = quantity * dollarValue;
        return reais += reais * IOF_PERCENTAGE/100;
    }
}
