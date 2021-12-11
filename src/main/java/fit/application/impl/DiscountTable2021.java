package fit.application.impl;

import fit.application.abstracts.DiscountTable;

public class DiscountTable2021 implements DiscountTable {
    private static final double EXEMPTION_VALUE = 1903.98;
    private static final double DEPENDENT_VALUE = 189.59;

    public double calculateExemption() {
        return EXEMPTION_VALUE;
    }

    public double getDependentsValue(int number) {
        return number * DEPENDENT_VALUE;
    }
}
