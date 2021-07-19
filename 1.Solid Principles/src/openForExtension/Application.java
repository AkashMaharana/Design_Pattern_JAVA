package openForExtension;

public class Application {
	
	public static void main(String[] args) {
		SorterManager sorterManager=new SorterManager();
		sorterManager.sort(new MergeSort());
	}

}
