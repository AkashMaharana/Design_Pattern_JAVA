package chainOfResponsibilityPattern;

public class UserExistMiddleware extends Middleware {
	
	private Server server;
	
	public UserExistMiddleware(Server server) {
		this.server=server;
	}

	@Override
	public boolean check(String email, String password) {
		if(!server.hasEmail(email)) {
			System.out.println("The input email is not present in our database.");
			return false;
		}
		if(!server.isValidPassword(email,password)) {
			System.out.println("Username or password is incorrect.");
			return false;
		}		
		return checkNext(email,password);
	}

}
