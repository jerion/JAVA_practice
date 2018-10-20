
public class P07 {
	public static void main(String[] args) {
		car car1, car2;
		car1 = new car();
		car2 = new car();
		
		car1.no = 1234;
		car1.gas = 20.5;
		
		car2.no = 2345;
		car2.gas = 30.5;

		System.out.println("car1車號是"+ car1.no);
		System.out.println("car1汽油量是"+ car1.gas);
		
		System.out.println("car2車號是"+ car2.no);
		System.out.println("car2汽油量是"+ car2.gas);
	}
}

class car
{
	int no;
	double gas;
}