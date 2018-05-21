import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class A {
	@SuppressWarnings("null")
	int GetValue() {
		return (true ? null : 0);
	}

	/*
	 * public void f1(Integer i) { System.out.println("inside 1"); }
	 */

	public void f1(int i) {
		System.out.println("inside 2");
	}

	public static void findSquareRoot(double number) {

		boolean isPositiveNumber = true;
		double g1;

		// if the number given is a 0
		if (number == 0) {
			System.out.println("Square root of " + number + " = " + 0);
		}

		// If the number given is a -ve number
		else if (number < 0) {
			number = -number;
			isPositiveNumber = false;
		}

		// Proceeding to find out square root of the number
		double squareRoot = number / 2;
		do {
			g1 = squareRoot;
			squareRoot = (g1 + (number / g1)) / 2;
		} while ((g1 - squareRoot) != 0);

		// Displays square root in the case of a positive number
		if (isPositiveNumber) {
			System.out.println("Square roots of " + number + " are ");
			System.out.println("+" + squareRoot);
			System.out.println("-" + squareRoot);
		}
		// Displays square root in the case of a -ve number
		else {
			System.out.println("Square roots of -" + number + " are ");
			System.out.println("+" + squareRoot + " i");
			System.out.println("-" + squareRoot + " i");
		}

	}

	public static void main(String[] args) {

		A a1 = new SubClass();
		a1.f1(new Integer(89));

		int[] dest = new int[] { 0, 1, 2, 3, 4, 5 };
		System.out.println(dest[0] + dest[5] + dest[2]);

		Map<String, String> map = new HashMap<String, String>();

		map.put("Z", "KK");
		map.put("B", "KK");
		map.put("A", "KK");
		map.put("H", "KK");
		map.put("Q", "KK");
		System.out.println(map);
		List<String> link = new LinkedList<String>();
		link.add("A");
		link.add("B");
		link.add("C");
		link.add("D");
		link.add("E");
		link.add("F");
		link.add("G");
		link.add("H");
		link.add("I");
		link.add("J");
		System.out.println(link);
		System.out.println(link.get(1));
		// findSquareRoot(45);
		// squareRoot(26);

		int[] a = new int[] { 2, 4, 5, 1, 7, 9 };
		int highest = 0;
		int secondHighest = 0;
		for (int i : a) {
			if (highest < i) {
				secondHighest = highest;
				highest = i;

			} else if (secondHighest < i) {
				secondHighest = i;
			}

		}
		// Arrays.sort(a);

		System.out.println(a[a.length - 2]);

		System.out.println("second highest");
		System.out.println(secondHighest);
		System.out.println(" highest");
		System.out.println(highest);

		// sort("Bbttggbbhanunn");
	}

	private static void squareRoot(int n) {
		for (int i = 1; i < n / 2; i++) {
			if (i * i == n) {
				System.out.println("Square Root of n :-" + i);
				break;
			}
		}

	}

	private static void sort(String string) throws Exception {
		if(null == string && string.isEmpty()){
			throw new Exception("Illegal parameter");
		}
		
		String str = "";
		for (int i = 0; i < string.length(); i++) {
			if (str.indexOf(string.charAt(i)) == -1) {
				str += string.charAt(i);
			}
		}
		System.out.println(str);
	}
}

class SubClass extends A {
	@Override
	public void f1(int i) {
		System.out.println("5555");
	}
}