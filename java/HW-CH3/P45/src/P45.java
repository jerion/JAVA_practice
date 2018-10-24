
public class P45 {
	public static void main(String[] args) {
		System.out.println("宣告car1");
		car car1;
		car1 = new car();
		car1.setcar(1234, 20.5);
		
		System.out.println("宣告car2");
		car car2;
		
		System.out.println("將car1指定給car2");
		car2 = car1;
		
		System.out.println("car1的");
		car1.show();
		
		System.out.println("car2的");
		car2.show();
		
		System.out.println("改變car1的相關資料");
		car1.setcar(2345, 30.5);
		
		System.out.println("car1的");
		car1.show();
		
		System.out.println("car2的");
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
	
	public void setcar(int n, double g)
	{
		no = n; gas = g;
		System.out.println("將車號設為"+no+"，汽油量設為"+gas);
	}
	
	public void show()
	{
		System.out.println("車號是"+no);
		System.out.println("汽油量是"+gas);
	}
}