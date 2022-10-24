package demo2.store.shopping;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Locales {

	public static void main(String[] args) {
		BigDecimal price = BigDecimal.valueOf(2.99);
		Double tax = 0.2;
		int quantity = 12345;
		Locale locale = new Locale("en","US");
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
		NumberFormat percentageFormat = NumberFormat.getPercentInstance(locale);
		NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
		String formattedPrice = currencyFormat.format(price);
		String formattedTax = percentageFormat.format(tax);
		String formattedQuantity = numberFormat.format(quantity);
		System.out.println("CurrencyFormat = " + currencyFormat);
		System.out.println("percentageFormat = " + percentageFormat);
		System.out.println("numberFormat = " + numberFormat);
		System.out.println("formattedPrice = " + formattedPrice);
		System.out.println("formattedTax = " + formattedTax);
		System.out.println("formattedQuantity = " + formattedQuantity);
		

	}

}
