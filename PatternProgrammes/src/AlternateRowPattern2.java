
public class AlternateRowPattern2 {

	public static void main(String[] args) {
		int k = 1;

		for (int i = 1; i <= 5; i++) {

			if (i % 2 != 0) {

				for (int j = 1; j <= i; j++) {
					System.out.print(k++ + " ");
				}
			} else {
				k = k + i - 1;
				for (int j = 1; j <= i; j++) {
					System.out.print(k-- + " ");
				}
				k = k + i + 1;
			}
			System.out.println();
		}

	}
}
