
public class Sample42 implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("C");
	}
}