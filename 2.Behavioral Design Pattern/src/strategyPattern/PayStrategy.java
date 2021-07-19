package strategyPattern;

public interface PayStrategy {

	public boolean pay(int amount);

	public void collectPaymnetDetails();

}
