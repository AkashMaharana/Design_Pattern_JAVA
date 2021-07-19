package openForModification;

public class SorterManager {
	
	public void sort(Sorter sorter) {
		if(sorter.sortType==SortType.MERGESORT) {
			doMergeSort(sorter);
		}
		else {
			doInsertionSort(sorter);
		}
	}

	private void doInsertionSort(Sorter sorter) {
		sorter.sort();
	}

	private void doMergeSort(Sorter sorter) {
		sorter.sort();
	}

}
