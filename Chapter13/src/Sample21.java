
public class Sample21 {
	private int num;
	private int test() {
		for(int i = 0; i < 3; i++) {
			num += i;
		}
		return num;
	}
	public static void main(String[] args) {
		Sample21 s = new Sample21();
		int num = s.test();
		s.test();
		System.out.println(num);
	}
}