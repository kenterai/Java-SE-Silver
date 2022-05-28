
public class Sample9 {
	private int num;
	private String name;
	public Sample9(int num, String name) {
		this.num = num;
		this.name = name;
	}
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof Sample9) {
			Sample9 s = (Sample9) obj;
			return s.num == this.num;
		}
		return false;
	}
}