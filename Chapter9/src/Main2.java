import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		Sample2[] samples = {
				new Sample2(2, "B"),
				new Sample2(3, "C"),
				new Sample2(1, "A")
		};
		List<Sample2> list = new ArrayList<Sample2>(Arrays.asList(samples));
		list.sort(new SampleComparator());
		for (Sample2 s : list) {
			System.out.println(s.getName());
		}
	}
}