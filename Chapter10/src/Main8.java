
public class Main8 {
	public static void main(String[] args) {
		try {
			System.out.println("A");
		} finally {
			System.out.println("B");
		} finally {
			System.out.println("C");
		}
	}
}