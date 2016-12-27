import java.util.Arrays;
	
	 
	public class SelectionSort {
	
	    public static void selectionSort(int[] array) {
	        if(array == null || array.length < 2) {
	            return;
	        }
	        int n = array.length;
	        for(int i = 0; i < n-1; i++) {
	            int minIndex = i;     
	            for(int j = i+1; j < n; j++) {
	                if(array[minIndex] > array[j]) {
	                    minIndex = j;
	                }
	            }
	            if(i != minIndex && array[i] != array[minIndex]) {
	                swap(array, i, minIndex);
	            }
	        }
	    }
	
	    private static void swap(int[] array, int i, int j) {
	        int tmp = array[i];
	        array[i] = array[j];
	        array[j] = tmp;        
	    }

	    public static void main(String[] args) {
	        int[] array = {12, 35, 87, 26, 9, 28, 7}; 
	        selectionSort(array);
	        System.out.println("Sorted array: "  + Arrays.toString(array))
	    }
	
	}
