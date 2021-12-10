package fit.core;

import fit.application.impl.DiscountTable;
import fit.application.impl.RateTable;
import fit.domain.Person;

public class IrpfCalculator {

  private int year;
  private Person person;
  private DiscountTable discountTable;
  private RateTable rateTable;

  public IrpfCalculator(int year, Person person) {
    this.year = year;
    this.person = person;
    this.discountTable = new DiscountTable(year);
    this.rateTable = new RateTable();
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
