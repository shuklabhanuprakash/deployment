package geeksForGeeks;

public class ArrayElementsSum {

	public static void main(String[] args) {

		int[] a = { 1, 3, 5, 6, 1, 3, 7 };
		int count = 0;
		int number = 8;
		int sum = 0;
		L1 :for (int i = 0; i < a.length - 3; i++) {
			for (int j = 0; j < a.length - 2; j++) {

				for (int k = 0; k < a.length - 1; k++) {

					for (int l = 0; l < a.length; l++) {

						if (a[i] + a[j] + a[k] + a[l] == number) {
							count = 1;
							break L1;
						}

					}
					
				}
			}
		}
		
		System.out.println(count);

	}

}
