
public class Main17 {
	public static void main(String[] args) {
		Main17 m = new Main17();
		System.out.println(m.calc(2, 3));
	}
	private double calc(double a, int b) {
		return (a + b) / 2;
	}
	private double calc(int a, double b) {
		return (a + b) / 2;
	}
}