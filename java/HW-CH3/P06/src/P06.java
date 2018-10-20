
public class P06 {
	public static void main(String[] args) {
		Car car1;
		car1 = new Car();
		
		car1.no = 1234;
		car1.gas = 20.5;
		
		System.out.println("車號是"+car1.no);
		System.out.println("汽油量是"+car1.gas);
	}
}

class Car
{
	int no;
	double gas;
}