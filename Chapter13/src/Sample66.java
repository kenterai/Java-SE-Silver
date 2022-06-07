
public class Sample66 {
	public static void main(String[] args) {
		Item66[] items = new Item66[3];
		items[1] = new Item66("A");
		items[2] = new Item66("B");
		for(Item66 item : items) {
			System.out.println(item.name);
		}
	}
}