package openForModification;

public class InsertionSort extends Sorter{
	
	public InsertionSort() {
		super.sortType=SortType.INSERTIONSORT;
	}
	
	@Override
	public void sort() {
		System.out.println("Insertion Sort...");
	}

}
