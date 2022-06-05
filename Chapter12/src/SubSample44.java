
public class SubSample44 extends Sample44 {
	int price;
	public SubSample44(int price) {
		this.price = price;
	}
	public SubSample44(String name, int num, int price) {
		super(name, num);
		this(price);
	}
}