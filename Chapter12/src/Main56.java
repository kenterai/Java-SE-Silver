
public class Main56 {
	public static void main(String[] args) {
		String[][] array = {
				{"A", "B"},
				{"C"},
				{"D", "E", "F", "G"}
		};
		for(int i = 0; i < array.length; i++) {
			int j = 0;
			for(; j < array[i].length; j++) {
				System.out.println("[" + i + "," + j + "] = " + array[i][j]);
			}
		}
	}
}