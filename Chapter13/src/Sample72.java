
public class Sample72 {
	public static final int length = 3;
	public static void main(String[] args) {
		int[] array = new int[length];
		for(int i = 0; i < 3; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
		Integer[] array2 = new Integer[length];
		for(int i = 0; i < 3; i++) {
			System.out.print(array2[i]);
		}
	}
}