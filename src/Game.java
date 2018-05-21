import java.util.Collections;
import java.util.Set;

public class Game {

	public static void main(String[] args) {
		Set<Object> emptySet = Collections.emptySet();
		emptySet.add("EDFR");
		System.out.println(emptySet);
		/*
		 * // TODO Auto-generated method stub Changer changer = new Changer();
		 * changer.passByValue(20); System.out.println(changer.val);
		 * 
		 * changer.passByRefVal(changer); System.out.println(changer.val);
		 */
	}

}

class Changer {
	int val = 8;

	Changer passByRefVal(Changer c) {
		Changer ch = c;
		ch.val = 90;
		return c;

	}

	int passByValue(int a) {
		return val = val * a;
	}
}
/**
 * [25-04-2016 10:39] Jamshed Satyanarayan Katta: public class Fibbonaci {
 * private static int fibb(int n) { return (4 << n*(3+n)) / ((4 << 2*n) - (2 <<
 * n) - 1) & ((2 << n) - 1); }
 *
 * public static void main(String[] args) { int a = fibb(4); //Nth Fibbonaci
 * System.out.println(a); } }
 */
