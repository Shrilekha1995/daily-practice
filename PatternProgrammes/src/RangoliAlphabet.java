import java.util.Scanner;

public class RangoliAlphabet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows need to be printed");
		int n = sc.nextInt();
		sc.close();
		int k = n / 2;
		int r = 0;
		char c = (char) (96 + k);
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				if (k > i) {

					if (j >= k - i && j <= k + i) {
						if(i%2==0&&j%2!=0)
							System.out.print(c);
						else if(i%2!=0&&j%2==0)
							System.out.print(c);
						else
							System.out.print("-");
					} else {
						System.out.print("-");
					}

				} else {

					if (j >= i - k && j <= k + i - r) {

						if(i%2==0&&j%2==0)
							System.out.print(c);
						else if(i%2!=0&&j%2!=0)
							System.out.print(c);
						else
							System.out.print("-");

					} else {
						System.out.print("-");
					}

				}

			}
			if (i >= k)
				r = r + 2;
			System.out.println();
		}

	}

}
