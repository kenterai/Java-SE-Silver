
public class Sample65 {
	public static void main(String[] args) {
		int a = 2;
		int b = 1;
		if(a++ > ++b) {
			System.out.print("A ");
		} else {
			System.out.print("B ");
		}
		System.out.println(a + ":" + b);
	}
}
