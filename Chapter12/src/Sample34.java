
public class Sample34 {
	public static void main(String[] args) {
		char c = 'b';
		int i = 0;
		switch(c) {
		case 'a':
			i++;
			break;
		case 'b':
			i++;
		case 'c' | 'd':
			i++;
		case 'e':
			i++;
			break;
		case 'f':
			i++;
			break;
		default:
			System.out.println(c);
		}
		System.out.println(i);
	}
}