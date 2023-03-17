package KiemTraJava;
public class mainKT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate initDate = new MyDate(2001,2,29);
		System.out.println("Check error date: " +initDate.toString());
		initDate.previousDay();
		System.out.println("\nCheck correct date: " +initDate.toString());
		if (MyDate.isValidDate(initDate.getYear(),initDate.getMonth() ,initDate.getDay())) {
			MyDate testDate = initDate.nextDay();
			System.out.println("The next day: " + testDate.toString());
		}
	}
}
