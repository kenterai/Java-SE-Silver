
public class Item11 {
	private String name;
	private int price;
	public Item11(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public boolean equals(Object obj) {
		if (obj instanceof Item11) {
			Item11 tmp = (Item11) obj;
			if (tmp.name.equals(this.name)) {
				return true;
			}
		}
		return false;
	}
	public String getName() {
		return name;
	}
}