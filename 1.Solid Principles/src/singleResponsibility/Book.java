package singleResponsibility;

public class Book implements BookHandler{

	private String authorName;
	private int numberOfPages;
	private BookPersistence bookPersistence;

	public Book(String authorName, int numberOfPages) {
		this.authorName = authorName;
		this.numberOfPages = numberOfPages;
		this.bookPersistence=new BookPersistence();
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	@Override
	public void save() {
		this.bookPersistence.save(this);
	}

	@Override
	public String toString() {
		return "Book [authorName=" + authorName + ", numberOfPages=" + numberOfPages + "]";
	}

}
