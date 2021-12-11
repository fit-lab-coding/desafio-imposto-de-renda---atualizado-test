package fit.core;

import fit.application.abstracts.DiscountTable;
import fit.application.abstracts.RateTable;
import fit.application.factories.DiscountTableFactory;
import fit.application.factories.RateTableFactory;
import fit.domain.Person;

public class IrpfCalculator {

  private Person person;
  private DiscountTable discountTable;
  private RateTable rateTable;

  public IrpfCalculator(int year, Person person) {
    this.person = person;
    this.discountTable = DiscountTableFactory.build(year);
    this.rateTable = RateTableFactory.build(year);
  }

  public double calculateBaseSalary() {
    var totalSalary = this.person.getTotalSalary();
    var inss = this.rateTable.getInssValue(totalSalary);
    var dependentsDisccount = this.discountTable.getDependentsValue(this.person.getDependents());

    return totalSalary - inss - dependentsDisccount;
  }

  public double calculateDiscount() {
    return this.calculateBaseSalary() - this.discountTable.calculateExemption();
  }

  public double calculate() {
    var discountValue = this.calculateDiscount();
    var taxValue = this.rateTable.getTaxLayer(this.calculateBaseSalary());

    return discountValue * taxValue;
  }

}
