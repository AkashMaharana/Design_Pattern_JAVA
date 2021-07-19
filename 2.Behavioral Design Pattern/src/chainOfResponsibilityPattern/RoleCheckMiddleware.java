package chainOfResponsibilityPattern;

public class RoleCheckMiddleware extends Middleware{

	@Override
	public boolean check(String email, String password) {
		if(email.equals("akash@admin.com")) {
			System.out.println("Hello Admin");
			return true;
		}
		System.out.println("Hello User");
		return false;
	}
	
	

}
