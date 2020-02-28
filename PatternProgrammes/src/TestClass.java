import java.util.Arrays;

public class TestClass {
	static int[] arr;
	public static void main(String[] args) {
		int a[] = { 10, 6,15,9};
		permutation(a, a.length, a.length);
		
	}

	static void printArr(int a[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	// Generating permutation using Heap Algorithm
	static void permutation(int a[], int size, int n) {
		// if size becomes 1 then prints the obtained
		// permutation
		if (size == 1)
			printArr(a, n);

		for (int i = 0; i < size; i++) {
			permutation(a, size - 1, n);
			
			// if size is odd, swap first and last
			// element
			if (size % 2 == 1) {
				int temp = a[0];
				a[0] = a[size - 1];
				a[size - 1] = temp;
			}
			// If size is even, swap ith and last
			// element
			else {
				int temp = a[i];
				a[i] = a[size - 1];
				a[size - 1] = temp;
			}
		}
	}

}
