package nullObjectPattern;

public class NullCustomer extends AbstractCustomer{

	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public String getCustomer() {
		return "No Customer with the given name in database";
	}

}
