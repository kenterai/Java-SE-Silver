
public class Main76 {
	public void test(Object[] array) {
		System.out.println("A");
	}
	public void test(String[] array) {
		System.out.println("B");
	}
	public void test(Object obj) {
		System.out.println("C");
	}
	public static void main(String[] args) {
		new Main76().test(args);
	}
}