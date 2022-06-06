
public class Main3 {
	public static void main(String[] args) {
		int a = 10;
		float b = 10.0f;
		double c = 20;
		a = (int) b;
		b = a;
		c = b;
		c = a;
	}
}