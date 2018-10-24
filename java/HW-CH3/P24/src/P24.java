
public class P24 {
	public static void main(String[] args) throws InterruptedException {
		car car1;
		car1 = new car();
		
		car1.setcar(1234, 20.5);
		car1.show();
		
		Thread.sleep(2000);
		
		System.out.println("只變更車號");
		car1.setcar(2345);
		car1.show();
		
		Thread.sleep(2000);
		
		System.out.println("只變更汽油量");
		car1.setcar(30.5);
		car1.show();
	}
}

class car
{
	private int no;
	private double gas;
	
	public void setcar(int n) 
	{
		no = n;
		System.out.println("將車號設為"+no+"\n");
	}
	
	public void setcar(double g)
	{
		gas = g;
		System.out.println("將汽油量設為"+gas+"\n");
	}
	
	public void setcar(int n, double g)
	{
		no = n; gas = g;
		System.out.println("將車號設為"+no+"，汽油量設為"+gas+"\n");
	}
	
	public void show()
	{
		System.out.println("車號是"+this.no);
		System.out.println("汽油量是"+this.gas);
	}
}