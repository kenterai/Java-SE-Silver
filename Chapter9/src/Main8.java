import java.util.ArrayList;

public class Main8 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add("A");
		list.add(10);
		list.add('B');
		for (Object obj : list) {
			System.out.print(obj);
		}
	}
}