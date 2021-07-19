package singleResponsibility;

public class BookPersistence {
	
	public void save(Book book){
		System.out.println("Book : Author Name : "+book.getAuthorName()+" "
				+ ": Number of Pages : "+book.getNumberOfPages());
	}

}
