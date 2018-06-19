import java.util.ArrayList;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		Test2 test = new Test2(1, "A");
		List<Test2> l = new ArrayList<Test2>();
		l.add(test);
		test.id = 23;
		System.out.println(test);
		test = null;
		System.out.println(l.get(0));
	}

}

class Test2 {
	int id;
	String name;

	public Test2(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " " + this.id + "  " + this.name;
	}
}
