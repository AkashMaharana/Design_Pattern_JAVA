package strategyPattern;

public class CreditCard {

	private String creditCardNumber;
	private String cardHolderName;
	private int balanceAmount;
	private int cvv;

	public CreditCard(String creditCardNumber, String cardHolderName, int cvv) {
		this.creditCardNumber = creditCardNumber;
		this.cardHolderName = cardHolderName;
		this.balanceAmount = 10000;
		this.cvv = cvv;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public int getBalanceAmount() {
		return balanceAmount;
	}

	public int getCvv() {
		return cvv;
	}

	public void setBalanceAmount(int balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

}
