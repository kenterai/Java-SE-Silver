
public class Main12 {
	public static void main(String[] args) {
		String[] array = {"A", "B", "C"};
		for (String str : array) {
			str = "D";
		}
		for (String str : array) {
			System.out.print(str);
		}
	}
}