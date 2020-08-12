import java.util.HashMap;

public class CurrencyConverter {
	HashMap<CurrencyPair, Double> conversions = new HashMap<CurrencyPair, Double>();
	
	public CurrencyConverter() {
		// you need to put it in both ways for it to work both ways
		conversions.put(new CurrencyPair("aud", "usd"), 0.72);
		conversions.put(new CurrencyPair("usd", "aud"), 1.28);;
		
		conversions.put(new CurrencyPair("aud", "yen"), 75.52);
		
		conversions.put(new CurrencyPair("aud", "euro"), 0.52);
	}
	
	public double ConvertCurrency(String from, String to, double amount) {
		return amount * conversions.get(new CurrencyPair(from, to));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrencyConverter converter = new CurrencyConverter();
		System.out.println("AUD to USD of $100 is: " + converter.ConvertCurrency("AUD", "USD", 100));
		System.out.println("AUD to YEN of $500 is: " + converter.ConvertCurrency("AUD", "USD", 500));
		System.out.println("AUD to EURO of $300 is: " + converter.ConvertCurrency("AUD", "USD", 300));
		
		System.out.println("USD TO AUD of $5 is: " + converter.ConvertCurrency("USD", "AUD", 5));
	}


}
