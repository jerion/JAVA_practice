
public class P07 {
	public static void main(String[] args) {
		car car1, car2;
		car1 = new car();
		car2 = new car();
		
		car1.no = 1234;
		car1.gas = 20.5;
		
		car2.no = 2345;
		car2.gas = 30.5;

		System.out.println("car1�����O"+ car1.no);
		System.out.println("car1�T�o�q�O"+ car1.gas);
		
		System.out.println("car2�����O"+ car2.no);
		System.out.println("car2�T�o�q�O"+ car2.gas);
	}
}

class car
{
	int no;
	double gas;
}