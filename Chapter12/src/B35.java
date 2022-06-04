
public class B35 extends A35 {
	private void print() {
		System.out.println("B");
	}
	public void b() {
		print();
	}
	public static void main(String... args) {
		B35 b = new B35();
		b.a();
		b.b();
	}
}