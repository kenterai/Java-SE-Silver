
public class B43 extends A43 {
	public int test(int num) {
		if(isValue(num)) {
			return num;
		}
		return 0;
	}
	public static void main(String[] args) {
		B43 b = new B43();
		System.out.println(b.test(10));
	}
}