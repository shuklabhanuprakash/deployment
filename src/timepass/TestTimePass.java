package timepass;

public class TestTimePass {

	public static void main(String[] args) {

		// System.out.println(testExceptio());
		String s2 = new String("ABC");
		String s = s2.intern();// new String("ABC");
		String s1 = "ABC";
		String s4 = "ABC";
		
		TestTimePass t =new TestTimePass();
		 System.out.println(t.hashCode());
		 System.out.println(System.identityHashCode(t));
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s4));
	}

	private static int testExceptio() {

		try {
			System.out.println("Try");
			int a = 10 / 0;
			return 23;

		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("Finally");
			return 100;
		}

	}
}
