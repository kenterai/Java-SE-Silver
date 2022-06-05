
public class Main77 {
	public static void main(String[] args) {
		SubSample77 sub = new SubSample77();
		Sample77 sample = new SubSample77();
		sub = sample;
		sub.test();
		sample.test();
	}
}