package strategyPattern;

public class DebitCard {

	private String debitCardNumber;
	private String cardHolderName;
	private int balanceAmount;
	private int cvv;

	public DebitCard(String debitCardNumber, String cardHolderName, int cvv) {
		this.debitCardNumber = debitCardNumber;
		this.cardHolderName = cardHolderName;
		this.balanceAmount = 20000;
		this.cvv = cvv;
	}

	public String getDebitCardNumber() {
		return debitCardNumber;
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
