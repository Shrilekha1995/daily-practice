package arrays;

import java.util.HashSet;
import java.util.Set;

public class PrintDubli {
	public static void main(String[] args) {

		int a[] = { 1, 22, 22, 4, 3, 3 };

		Set<Integer> hs = new HashSet<>();

		for (int i = 0; i < a.length; i++) {
			if (hs.add(a[i]) == false) {
				System.out.println(a[i]);
			}
		}

	}
}
