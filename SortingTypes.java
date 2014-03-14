public class SortingTypes {

	public static void main(String[] args) {
		int[] list = {3, 2, 1, 6, 7, 1, 2, 3, 6, 9, 0};
		printList(selectionSort(list));
		printList(insertionSort(list));
		printList(bubbleSort(list));
	}

	public static int[] selectionSort(int[] list) {
		for (int i=0; i<list.length; i++) {
			int minValue = list[i];
			int minPos = i;
			for (int j=i; j<list.length; j++) {
				if (list[j]<minValue) {
					minValue = list[j];
					minPos = j;
				}
			}
			list[minPos] = list[i];
			list[i] = minValue;
		}
		return list;
	}

	public static int[] insertionSort(int[] list) {
		int temp = 0;
		for (int i=1; i<list.length; i++) {
			int numPos = i;
			while (numPos != 0 && list[numPos]<list[numPos-1]) {
				temp = list[numPos];
				list[numPos] = list[numPos-1];
				list[numPos-1] = temp;
				numPos--;
			}
		}
		return list;
	}

	public static int[] bubbleSort(int[] list) {
		int temp = 0;
		boolean switched = true;
		while (switched) {
			switched = false;
			for (int j=0; j<list.length-2; j++) {
				if (list[j]>list[j+1]) {
					temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
					switched = true;
				}
			}
			if (!switched) {
				return list; 
			}
		}
		return list;
	}

	public static void printList(int[] list) {
		for (int i=0; i<list.length; i++) {
			System.out.print(list[i] + " ");
		}
		if (isSorted(list)) {
			System.out.print("-Sorted");
		}
		System.out.println();
	}

	public static boolean isSorted(int[] list) {
		for (int i=0; i<list.length-1; i++) {
			if(list[i] > list[i+1]) {
				return false;
			}
		}
		return true;
	}
	
}