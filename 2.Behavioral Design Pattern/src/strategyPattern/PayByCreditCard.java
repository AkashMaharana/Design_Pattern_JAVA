package strategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByCreditCard implements PayStrategy {

	private final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	private CreditCard creditCard;

	@Override
	public boolean pay(int amount) {
		if (isCardPresent()) {
			System.out.println("Paying " + amount + " using Credit Card.");
			this.creditCard.setBalanceAmount(this.creditCard.getBalanceAmount() - amount);
			return true;
		}
		System.out.println("Please enter the correct credit card details.");
		return false;
	}

	@Override
	public void collectPaymnetDetails() {
		try {
			System.out.print("Enter the credit card number: ");
			String creditCardNumber = bufferedReader.readLine();
			System.out.print("Enter the credit card holder name : ");
			String cardHolderName = bufferedReader.readLine();
			System.out.print("Enter the CVV code: ");
			String cvv = bufferedReader.readLine();
			this.creditCard = new CreditCard(creditCardNumber, cardHolderName, Integer.parseInt(cvv));
			System.out.println("Credit card validated.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	private boolean isCardPresent() {
		return true;
	}

}
