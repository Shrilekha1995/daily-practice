import java.util.Scanner;

/*
 *        * * * * *
 *          * * *
 *            *
 *          * * *
 *        * * * * *
 *          
 * 
 * 
 */
public class DamaruPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of columns need to be printed");
		int n = sc.nextInt();
		sc.close();

		/*
		 * for(int i=0;i<cols;i++) { for(int j=0;j<i;j++) {
		 * System.out.print(" "); } for(int k=0;k<cols-2*i;k++) {
		 * System.out.print("*"); } System.out.println(); } for(int
		 * i=1;i<cols;i++){
		 * 
		 * for(int j=2;j<cols-i;j++) { System.out.print(" "); } for(int
		 * k=0;k<=2*i;k++){ System.out.print("*"); } System.out.println(); }
		 */
		int k;
		for (int i = 0; i < n; i++) {
			k = n / 2;
			for (int j = 0; j < n; j++) {
				if (k >= i) {
					if (j >= i && j <= n-1 - i) {

						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				} else {
					if (j >= n-1-i  && j <= i ) {

						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				}

			}
			System.out.println();
		}

	}

}
