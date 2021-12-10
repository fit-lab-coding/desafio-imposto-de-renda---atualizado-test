package fit.application.impl;

public class RateTable {
    private static final double INSS_VALUE_2021 = 0.11;

    public double getInssValue(double baseSalary) {
        return INSS_VALUE_2021 * baseSalary;
    }

    public double getTaxLayer(double baseSalary) {
        if (baseSalary <= 1903.98)
            return 0.0;
        if (baseSalary <= 2826.65)
            return 0.075;
        if (baseSalary <= 3751.05)
            return 0.15;
        if (baseSalary <= 4664.68)
            return 0.225;
        return 0.275;
    }
}
