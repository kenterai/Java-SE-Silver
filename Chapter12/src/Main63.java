
public class Main63 {
	public static void main(String[] args) {
		int x;
		int y = 3;
		if(y > 2) {
			x = ++y;
			y = x + 5;
		} else {
			y++;
		}
		System.out.println(x + ", " + y);
	}
}