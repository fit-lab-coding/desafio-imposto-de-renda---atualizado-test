package fit.application.impl;

public class DiscountTable {
    private static final double EXEMPTION_VALUE_2021 = 1903.98;
    private static final double DEPENDENT_VALUE_2021 = 189.59;
    private static final double DEPENDENT_VALUE_2022 = 200.00;
    private int year;

    public DiscountTable(int year) {
        super();
        this.year = year;
    }

    public double calculateExemption() {
        return EXEMPTION_VALUE_2021;
      }

    public double getDependentsValue(int number) {
        if (year == 2021) return number * DEPENDENT_VALUE_2021;
        if (year == 2022) return number * DEPENDENT_VALUE_2022;

        return number * DEPENDENT_VALUE_2022;
    }
}
