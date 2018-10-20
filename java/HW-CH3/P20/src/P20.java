
public class P20 {
	public static void main(String[] args) {
		car car1;
		car1 = new car();
		
		car1.no = 1234;
		car1.gas = -10;
		
		car1.show();
	}
}

class car
{
	int no; double gas;
	
	void show()
	{
		System.out.println("車號是"+ this.no);
		System.out.println("汽油量是"+ this.gas);
	}
}