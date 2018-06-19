import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		TreeSet<String> tree = new TreeSet<String>();
		System.out.println(tree);

		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		//matrix();
		/*
		 * Boolean isRun = true; while (isRun) {
		 * System.out.println("ENTER NUMBER"); Scanner sc = new
		 * Scanner(System.in); int num = sc.nextInt(); boolean isPrime = true;
		 * for (int i = 2; i < num; i++) { if (num % i == 0) { isPrime = false;
		 * break; }
		 *
		 * } if (isPrime) { System.out.println(num + " is prime"); isRun =
		 * false; } else { System.out.println(num + " is not prime"); }
		 *
		 * }
		 */
		
		 String str = "{()"; 
		 if (validExp(str)) {
		 System.out.println("Valid Expression"); } else {
		  System.out.println("Invalid Expression"); }
		 
	}

	/**
	 *
	 */
	private static void matrix() {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("before");
		for (int[] element : a) {

			for (int j = 0; j < a.length; j++) {

				System.out.print(element[j] + "\t");
			}
			System.out.println();
		}
		System.out.println("After");

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < i; j++) {

				if (i == j) {
					continue;
				} else {
					int temp = i;
					i = j;
					j = temp;
					System.out.print(a[i][j] + "\t");
				}

			}

			System.out.println();
		}
	}

	private static Boolean validExp(String exp) {
		Stack<Character> stack = new Stack<Character>();
		if (stack.isEmpty()) {
			return true;
		}

		for (int i = 0; i < exp.length(); i++) {
			char c = exp.charAt(i);
			if (c == '[' || c == '{' || c == '(') {
				stack.push(c);
			}
			if (c == ']' || c == '}' || c == ')') {
				if (stack.isEmpty()) {
					return false;
				}
				char lastChar = stack.peek();
				if (c == '}' && lastChar == '{' || c == ']' && lastChar == '['
						|| c == ')' && lastChar == '(') {
					stack.pop();
				} else {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}
}
