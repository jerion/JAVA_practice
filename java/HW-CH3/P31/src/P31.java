
public class P31 {
	public static void main(String[] args) {
		car.showsum();
		
		car car1;
		car1 = new car();
		car1.setcar(1234, 20.5);
		
		car.showsum();
		
		car car2;
		car2 = new car();
		car2.setcar(4567, 30.5);
	}
}

class car
{
	public static int sum = 0;
	
	private int no;
	private double gas;
	
	public car()
	{
		no = 0; gas = 0.0; sum++;
		System.out.println("生產了車子");
	}
	
	public void setcar(int n, double g)
	{
		no = n; gas = g;
		System.out.println("將車號設為"+no+"，汽油量設為"+gas);
	}
	
	public static void showsum()
	{
		System.out.println("車子共有"+sum+"台");
	}
	
	public void show()
	{
		System.out.println("車號是"+no);
		System.out.println("汽油量是"+gas);
	}
}