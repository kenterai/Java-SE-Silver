
public class Main6 {
	public static void main(String[] args) {
		String[] array = {"A","B","C","D"};
		array[0] = null;
		for (String str : array) {
			System.out.print(str);
		}
	}
}