
public class Main30 extends Sample30 {
	public void process() {
		System.out.println("B");
	}
	public static void main(String[] args) {
		Sample30 s = new Main30();
		Sample30 s2  = new Sample30();
		test(s);
		test(s2);
	}
	public static void test(Function f) {
		f.process();
	}
}