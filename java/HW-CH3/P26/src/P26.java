
public class P26 {
	public static void main(String[] args) {
		car car1;
		car1 = new car();
		
		car1.show();
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
	
	public void show()
	{
		System.out.println("車號是"+no);
		System.out.println("汽油量是"+gas);
	}
}