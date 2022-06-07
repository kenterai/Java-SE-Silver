
public class Main53 {
	private String val;
	private int num;
	public Main53(int num) {
		this.num = num;
	}
	public Main53() {
		this.val = "test";
		this.num = 10;
	}
	public static void main(String[] args) {
		Main53 m = new Main53(20);
		System.out.println(m.val + ", " + m.num);
	}
}