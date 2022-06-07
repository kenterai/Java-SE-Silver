
public class Sample49 {
	int a, b;
	public Sample49(int a, int b) {
		init(a, b);
	}
	public void init(int a, int b) {
		this.a = a * a;
		this.b = b * b;
	}
	public static void main(String[] args) {
		int a = 2, b = 3;
		Sample49 s = new Sample49(a, b);
		System.out.println(a + ", " + b);
	}
}