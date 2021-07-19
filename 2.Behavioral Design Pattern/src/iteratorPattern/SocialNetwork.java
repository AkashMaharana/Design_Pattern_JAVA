package iteratorPattern;

public interface SocialNetwork {

	public ProfileIterator createFriendsIterator(String profileEmail);

	public ProfileIterator createCoworkersIterator(String profileEmail);

}
