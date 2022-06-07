
public class Main42 {
	public static void main(String[] args) {
		try(Sample42 s = new Sample42()) {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("A");
		} finally {
			System.out.println("B");
		}
	}
}