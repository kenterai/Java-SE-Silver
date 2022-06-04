
public class Sample20 {
	private char a;
	private int b = 1;
	String test(char a, int b) {
		return a + ", " + b;
	}
	public static void main(String[] args) {
		Sample20 app = new Sample20();
		System.out.println(app.test('A'));
	}
}