package chainOfResponsibilityPattern;

public abstract class Middleware {
	
	private Middleware next;
	
	public Middleware linkWith(Middleware next) {
		this.next=next;
		return next;
	}
	
	public abstract boolean check(String email,String password);
	
	protected boolean checkNext(String email,String password) {
		if(this.next==null) {
			return false;
		}
		return this.next.check(email,password);
	}

}
