public class test {

	static int arr[] = new int[100];

	public static int print(Integer m) {
		System.out.println(m);
		arr[100 - m] = 1;
		m--;
		return print(m);
	}

	public static void permuteString(String beginningString, String endingString) {
		if (endingString.length() <= 1) {
			System.out.println(beginningString + endingString);
		} else {
			for (int i = 0; i < endingString.length(); i++) {
				try {
					
					System.out.println(endingString.substring(0, i) +"  -----   "+endingString.substring(i + 1));
					String newString = endingString.substring(0, i)
							+ endingString.substring(i + 1);
System.out.println("00=====  "+newString);
					permuteString(beginningString + endingString.charAt(i),
							newString);
				} catch (StringIndexOutOfBoundsException exception) {
					exception.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		permuteString("", "ABC");
	//	print(100);
		/*
		 * int c = 1; for (int i = 1; i < 10; i++) { for (int j = 1; j < i; j++)
		 * { System.out.print(c + " "); c++; } System.out.println(); }
		 */
		// int a[] = { 11, 32, 3, 4, 5 };
		// bubbleSort(a);
		/*
		 * String str = "#@&#@%123A4@#$5";
		 * 
		 * int counter = 0; for (int i = 0; i < str.length(); i++) { if
		 * (Character.isDigit(str.charAt(i))) { counter++; } }
		 * System.out.println(counter + " letters.");
		 * 
		 * System.out.println(str.length() - str.replaceAll("\\p{Punct}",
		 * "").length());
		 * 
		 * counter = 0; for (int i = str.length() - 1; i >= 0; i--) { if
		 * (Character.isUpperCase(str.charAt(i))) { counter++; }
		 * 
		 * } System.out.println(counter);
		 */
		/*
		 * String s = null; DateFormat df = new
		 * SimpleDateFormat("dd-MM-yy hh:mm:ss"); Object[] obj = { "hhdhgh" };//
		 * Calendar.getInstance().getTime() };// // ,new // Long(34),"hhdhgh"
		 * for (Object strn : obj) {
		 * 
		 * s = (String) strn;// df.format(strn); } System.out.println(s);
		 */

		// int[] a = { 2, 5, 3, -1, -4, 9, 1 };
		// bubbleSort(a);
		// 1,2,6,15
		// boolean t1 = false ? false : true ? false : true ? false : true;
		// System.out.println(t1);
		// System.out.println(returnNumber(150));

		// int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		// System.out.println(Arrays.toString(cyclic(a, -2)));
/*
		MyClass myClass = new MyClass();
		MyClass w = myClass;
		System.out.println(myClass);
		w.data = 9008;

		System.out.println(w);

		System.out.println(myClass);
		myClass.data = 8976;
		System.out.println(myClass);
		System.out.println(w);*/
	}

	private static int[] cyclic(int[] a, int i) {
		if (i > a.length) {
			i = i % a.length;
		}
		// System.out.println(i);
		if (i > 0) {
			for (int j = 0; j < i; j++) {
				for (int k = a.length - 1; k > 0; k--) {
					int temp = a[k];
					a[k] = a[k - 1];
					a[k - 1] = temp;
				}
			}
		} else {

			for (int j = 0; j < i; j++) {
				for (int k = a.length - 1; k > 0; k--) {
					int temp = a[k - 1];
					a[k - 1] = a[k];
					a[k] = temp;
				}
			}
		}

		return a;
	}

	public static int returnNumber(int i) {
		if (i == 1) {
			return 1;
		} else {
			return (i - 1) * (i - 1) + returnNumber(i - 1);
		}
	}

	public static void bubbleSort(int arr[]) {

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr.length - 1; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
			printData(arr);
		}

	}

	private static void printData(int[] arr) {
		for (int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println("\n");
	}

	private static void sortData(int j, int k, int arr[]) {
		int temp = arr[j];
		arr[j] = arr[k];
		arr[k] = temp;
	}

}

class MyClass {

	Integer data = 90;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "" + data;
	}

}

/**
 * public static void main(String args[]) { permuteString("", "ABCD"); }
 * 
 * public static void permuteString(String beginningString, String endingString)
 * { if (endingString.length() <= 1) System.out.println(beginningString +
 * endingString); else for (int i = 0; i < endingString.length(); i++) { try {
 * String newString = endingString.substring(0, i) + endingString.substring(i +
 * 1);
 * 
 * permuteString(beginningString + endingString.charAt(I), newString); } catch
 * (StringIndexOutOfBoundsException exception) { exception.printStackTrace(); }
 * } } }
 *
 */

