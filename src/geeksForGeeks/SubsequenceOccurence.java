package geeksForGeeks;

import java.util.Arrays;

public class SubsequenceOccurence {

	public static void main(String[] args) {

		String str1 = "babbggbag";
		String str2 = "bag";

		//System.out.println(subsequenceCount(str1, str2));
		// count(str1, str2);
		System.out.println(d.helper(str1, str2, 0, 0));
	}

	private static int subsequenceCount(String str1, String str2) {

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		int m = str1.length();
		int n = str2.length();
		int[][] result = new int[m + 1][n + 1];
		for (int i = 0; i <= n; i++) {
			result[0][i] = 0;

		}

		for (int i = 0; i <= m; i++) {
			result[i][0] = 1;

		}

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {

				if (ch1[i - 1] == ch2[j - 1]) {

					result[i][j] = result[i - 1][j - 1] + result[i - 1][j];

				} else {
					result[i][j] = result[i - 1][j];
				}

			}
		}

		for (int[] i : result) {
			for (int j : i) {
				System.out.print(j);
			}
			System.out.println();

		}

		return result[m][n];
	}

	public static void count(String s, String t) {
		char[] a = s.toCharArray();
		char[] b = t.toCharArray();
		int m = s.length();
		int n = t.length();
		int lookup[][] = new int[m + 1][n + 1];
		for (int i = 0; i <= n; ++i)
			lookup[0][i] = 0;
		for (int i = 0; i <= m; ++i)
			lookup[i][0] = 1;

		for (int[] i : lookup) {
			for (int j : i) {
				System.out.print(j);
			}
			System.out.println();

		}
		System.out.println();
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (a[i - 1] == b[j - 1])
					lookup[i][j] = lookup[i - 1][j - 1] + lookup[i - 1][j];

				else
					lookup[i][j] = lookup[i - 1][j];
			}
		}
		for (int[] i : lookup) {
			for (int j : i) {
				System.out.print(j);
			}
			System.out.println();

		}
		System.out.println(lookup[m][n]);
		return;

	}

}

class d {

	public static int helper(String a, String b, int i, int j) {
		if (j == b.length()) {
			if (i == a.length() && a.charAt(i - 1) != b.charAt(j - 1))
				return 0;
			else
				return 1;
		}
		if (i == a.length())
			return 0;
		if (a.charAt(i) == b.charAt(j))
			return helper(a, b, i + 1, j + 1) + helper(a, b, i + 1, j);
		else
			return helper(a, b, i + 1, j);
	}

	
	
}