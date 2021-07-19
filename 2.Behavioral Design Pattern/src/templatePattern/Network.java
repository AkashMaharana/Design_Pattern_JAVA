package templatePattern;

public abstract class Network {

	private String userName;
	private String password;

	public Network(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public boolean post(String message) {
		if (logIn(this.userName, this.password)) {
			boolean result = sendData(message.getBytes());
			logOut();
			return result;
		}
		return false;
	}

	abstract boolean logIn(String userName, String password);

	abstract boolean sendData(byte[] data);

	abstract void logOut();

}
