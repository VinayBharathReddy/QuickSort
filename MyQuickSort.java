public class MyQuickSort{
	public static void main(String[] vb) {
		int[] input = {24,2,45,20,56,75,2,56,99,53,12};
		Sorting sort = new Sorting();
		sort.quickSort(input, 0, input.length - 1);
		for(int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
	}
}


class Sorting{
	// int pivot;
	public void quickSort(int[] a, int start, int end){
		if(start < end) {
			int pivot = partition(a,start,end);
			quickSort(a,start,pivot - 1);
			quickSort(a,pivot + 1,end);
		}
	}

	private int partition(int[] ar, int s, int e) {
		int pvalue = ar[e];
		int pivotIndx =  s;
		for(int i = s; i < e; i++) {
			if(ar[i] <= pvalue) {
				int temp = ar[i];
				ar[i] = ar[pivotIndx];
				ar[pivotIndx] = temp;
				pivotIndx++;
			}
		}
		int temp2 = ar[pivotIndx];
		ar[pivotIndx] = ar[e];
		ar[e] = temp2;
		return pivotIndx;
				
	}
}