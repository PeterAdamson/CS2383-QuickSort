//Author Peter Adamson

public class QuickSort{

	public static void main(String[] args){
		int[] A = {3, 6, 10, 18, 8, 7, 25, 40};
		sort(A);
		show(A);	//display the sorted result A
	}

	public static void sort(int[] A){
		QuickSort(A, 0, A.length - 1);		
	}

	public static void show(int[] A){
		for(int i = 0; i < A.length; i++){
			System.out.println(A[i]);
		}
	}

	public static void QuickSort(int[] A, int left, int right){
		int pivot = A[left];
		int i = left, j = right;
		while (i <= j){
			while (A[i] < pivot){
				i++;
			}
			while (A[j] > pivot){
				j--;
			} 
			if (i <= j){
				swap(A, i, j);
				i++;
				j--;
			}
		}
		if (left < j){
			QuickSort(A, left, j);
		}
		if (right > i){
			QuickSort(A, i, right);
		}
	}

	public static void swap(int[] A, int i, int j){
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
}
