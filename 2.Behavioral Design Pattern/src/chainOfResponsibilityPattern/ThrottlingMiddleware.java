package chainOfResponsibilityPattern;

public class ThrottlingMiddleware extends Middleware {
	
	private int requestPerMinute;
	private int request;
	private long currentTime;
	
	public ThrottlingMiddleware(int requestPerMinute) {
		this.requestPerMinute=requestPerMinute;
		this.currentTime=System.currentTimeMillis();
	}

	@SuppressWarnings("deprecation")
	@Override
	public boolean check(String email, String password) {
		if(System.currentTimeMillis()>currentTime+60_0000) {
			request=0;
			this.currentTime=System.currentTimeMillis();
		}
		this.request++;
		if(this.request>this.requestPerMinute) {
			System.out.println("Request limit exceeded!!!");
			Thread.currentThread().stop();
		}
		return checkNext(email,password);
	}

}
