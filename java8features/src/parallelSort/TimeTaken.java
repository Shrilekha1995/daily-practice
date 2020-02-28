package parallelSort;

import java.util.Arrays;

public class TimeTaken {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 8, 4, 9, 0, 78, 9, 4, 2, 34, 67, 90 };
		long sTime = System.currentTimeMillis();
		Arrays.sort(arr);
		long eTime = System.currentTimeMillis();
		System.out.println("Time taken by sequential sort: " + (eTime - sTime));

		sTime = System.currentTimeMillis();
		Arrays.parallelSort(arr);
		eTime = System.currentTimeMillis();
		System.out.println("Time taken by parallel sort: " + (eTime - sTime));
		Arrays.stream(arr).forEach(System.out::println);

	}

}
