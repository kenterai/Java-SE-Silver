import java.util.ArrayList;

public class Main11 {
	public static void main(String[] args) {
		ArrayList<Item11> list = new ArrayList<>();
		list.add(new Item11("A", 100));
		list.add(new Item11("B", 200));
		list.add(new Item11("C", 300));
		list.add(new Item11("A", 100));
		list.remove(new Item11("A", 500));
		for (Item11 item : list) {
			System.out.println(item.getName());
		}
	}
}