package com.deepa.calculator.tax;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TaxCalculator taxCalculator = getCalculator();
		taxCalculator.calculateTax(); // loose coupling
		
	}
	
	public static TaxCalculator getCalculator() {
		return new TaxCalculator2019();
//		Now you might ask that here we are using above concrete class so for any change in concrete class, Main class also needs to be compiled again, but as this is a short example, in enterprise application we use something called as dependency injection instead.
	}

}
