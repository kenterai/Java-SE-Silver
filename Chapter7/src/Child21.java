
class Child21 extends Parent21 {
	public Child21() {
		super("B");
		System.out.println("C");
	}
	public Child21(String val) {
		this();
		System.out.println(val);
	}
}