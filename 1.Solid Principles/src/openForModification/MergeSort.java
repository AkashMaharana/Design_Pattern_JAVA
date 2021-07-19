package openForModification;

public class MergeSort extends Sorter{

	public MergeSort() {
		super.sortType=SortType.MERGESORT;
	}
	
	@Override
	protected void sort() {
		System.out.println("Merge Sort...");
	}
	
	

}
