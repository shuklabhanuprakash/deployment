

public class CheckClass {

	public static void main(String[] args) {

		CheckClass c = new CheckClass();
		String s = null;
		Integer i = null;
		c.getName(s, i);
	}

	private void getName(String s, Integer i) {
		System.out.println("NAME : " + s);
		System.out.println("ID : " + i);
	}

}
