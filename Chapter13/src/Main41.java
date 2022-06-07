
public class Main41 {
	public static void main(String[] args) {
		String[] array = {"A","B","C","D","E"};
		for(String str : array) {
			if("B".equals(str)) {
				continue;
			}
			System.out.println(str);
			if("C".equals(str)) {
				break;
			}
		}
	}
}