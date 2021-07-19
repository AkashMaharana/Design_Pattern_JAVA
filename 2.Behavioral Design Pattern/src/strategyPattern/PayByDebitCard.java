package strategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByDebitCard implements PayStrategy {

	private final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	private DebitCard debitCard;

	@Override
	public boolean pay(int amount) {
		if (isCardPresent()) {
			System.out.println("Paying " + amount + " using Credit Card.");
			this.debitCard.setBalanceAmount(this.debitCard.getBalanceAmount() - amount);
			return true;
		}
		System.out.println("Please enter the correct debit card details.");
		return false;
	}

	@Override
	public void collectPaymnetDetails() {
		try {
			System.out.print("Enter the debit card number: ");
			String debitCardNumber = bufferedReader.readLine();
			System.out.print("Enter the debit card holder name : ");
			String cardHolderName = bufferedReader.readLine();
			System.out.print("Enter the CVV code: ");
			String cvv = bufferedReader.readLine();
			this.debitCard = new DebitCard(debitCardNumber, cardHolderName, Integer.parseInt(cvv));
			System.out.println("Credit card validated.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	private boolean isCardPresent() {
		return true;
	}

}
