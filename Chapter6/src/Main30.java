
public class Main30 {
	public static void main(String[] args) {
		Sample30 s = new Sample30(10);
		modify(s);
		System.out.println(s.num);
	}
	private static void modify(Sample30 s) {
		s.num *= 2;
	}
}