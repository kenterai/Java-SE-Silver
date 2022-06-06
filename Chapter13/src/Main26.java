
public class Main26 {
	int num;
	private static void test() {
		num++;
		System.out.println(num);
	}
	public static void main(String[] args) {
		Main26.test();
		Main26.test();
	}
}