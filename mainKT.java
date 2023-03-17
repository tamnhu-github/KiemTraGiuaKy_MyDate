package KiemTraJava;
public class mainKT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate initDate = new MyDate(2001,2,29); //Nam khong nhuan: thang 2 co 29 ngay -> loi
		System.out.println("Check error date: " +initDate.toString());
		initDate.previousDay(); // 28/2/2001 -> hop le
		System.out.println("\nCheck correct date: " +initDate.toString());
		if (MyDate.isValidDate(initDate.getYear(),initDate.getMonth() ,initDate.getDay())) {
			MyDate testDate = initDate.nextDay(); //1/3/2001
			System.out.println("The next day: " + testDate.toString());
		}
	}
}
