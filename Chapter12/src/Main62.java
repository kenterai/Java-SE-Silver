
public class Main62 {
	public static void main(String[] args) {
		char[][] arrays = {{'a', 'd'}, {'b', 'e'}, {'c', 'f'}};
		for(char[] array : arrays) {
			for(char ch : array) {
				System.out.print(ch);
			}
			System.out.print(" ");
		}
	}
}