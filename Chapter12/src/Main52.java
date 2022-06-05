import java.util.Arrays;

public class Main52 {
	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = {1, 2, 4, 5, 3};
		int result1 = Arrays.mismatch(array1, array2);
		int result2 = Arrays.compare(array1, array2);
		System.out.println(result1 + ":" + result2);
	}
}