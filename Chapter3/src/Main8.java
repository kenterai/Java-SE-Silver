
public class Main8 {
	public static void main(String[] args) {
		Sample8 s1 = new Sample8(10);
		Sample8 s2 = s1;
		s1 = new Sample8(10);
		System.out.println(s1 == s2);
	}
}