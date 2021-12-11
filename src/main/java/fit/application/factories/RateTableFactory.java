package fit.application.factories;

import fit.application.abstracts.RateTable;
import fit.application.impl.RateTable2021;
import fit.application.impl.RateTable2022;

public abstract class RateTableFactory {
    public static RateTable build(int year) {
        if (year == 2021)
            return new RateTable2021();
        if (year == 2022)
            return new RateTable2022();

        return null;
    }
}
