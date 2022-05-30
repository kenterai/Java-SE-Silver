
public class Main29 {
	public static void main(String[] args) {
		Sample29 s = new Sample29(10);
		modify(s.num);
		System.out.println(s.num);
	}
	private static void modify(int num) {
		num *= 2;
	}
}