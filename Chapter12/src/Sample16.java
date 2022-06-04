import static java.time.DayOfWeek.*;

import java.time.LocalDate;

public class Sample16 {
	public static void main(String[] args) {
		var today = LocalDate.now().with(TUESDAY).getDayOfWeek();
		switch(today) {
		case SUNDAY:
		case SATURDAY:
			System.out.println("weekend");
			break;
		case MONDAY:
			 FRIDAY: System.out.println("working");
		default:
			System.out.println("other");
		}
	}
}