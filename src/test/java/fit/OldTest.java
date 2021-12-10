// package fit;

// import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertTrue;

// import org.junit.Test;

// import fit.core.IrpfCalculator;

// /**
//  * Unit test for simple App.
//  */
// public class OldTest 
// {
//     /**
//      * Rigorous Test :-)
//      */
//     @Test
//     public void shouldCalculateInssWith11Percent()
//     {
//         // arrange
//         var totalSalary = 3000.00;
//         var baseSalaryExpected = 2670.00;
//         // act
//         var actualBaseSalary = IrpfCalculator.calculateBaseSalary(totalSalary);
//         // assert
//         assertEquals(baseSalaryExpected, actualBaseSalary, 0.01);
//     }

//     @Test
//     public void shouldCalculateExemptionValue() {
//         // arrange
//         var exemptionValueExpected = 1903.98;

//         // act
//         var actualExemptionValue = IrpfCalculator.calculateExemption();

//         // assert
//         assertEquals(exemptionValueExpected, actualExemptionValue, 0.01);
//     }

//     @Test
//     public void shouldCalculateDiscountValue() {
//         // arrange
//         var baseSalary  = 2670.00;
//         var discountValueExpected = 766.02;

//         // act
//         var actualDiscountValue = IrpfCalculator.calculateDiscount(baseSalary);

//         // assert
//         assertEquals(discountValueExpected, actualDiscountValue, 0.01);
//     }

//     @Test
//     public void shouldCalculateTaxLayerValue() {
//         // arrange
//         var baseSalary  = 2670.00;
//         var taxLayerExpected = 0.075;

//         // act
//         var actualTaxLayex = IrpfCalculator.calculateTaxLayer(baseSalary);

//         // assert
//         assertEquals(actualTaxLayex, taxLayerExpected, 0.01);
//     }

//     @Test
//     public void shouldCalculateIrpfValue() {
//         // arrange
//         var totalSalary = 3000.00;
//         var irpfValueExpected = 57.45;

//         // act
//         var actualIrpfValue = IrpfCalculator.calculateIrpf(totalSalary);

//         // assert
//         assertEquals(actualIrpfValue, irpfValueExpected, 0.01);
//     }
// }
