
public class P28 {
	public static void main(String[] args) {
		car car1;
		car1 = new car();
		car1.show();
		
		car car2;
		car2 = new car(1234, 25.0);
		car2.show();
	}
}

class car
{
	private int no;
	private double gas;
	
	public car()
	{
		no = 0; gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public car(int n, double g)
	{
		this();
		no = n; gas = g;
		System.out.println("生產了車號是"+no+"，汽油量是"+gas+"的車子");
	}
	
	public void show()
	{
		System.out.println("車號是"+no);
		System.out.println("汽油量是"+gas);
	}
}