
public class B25 extends A25 {
	@Override
	void sample(int i) {
		System.out.println(10);
	}
	public static void main(String[] args) {
		A25 a = new B25();
		a.sample();
	}
}