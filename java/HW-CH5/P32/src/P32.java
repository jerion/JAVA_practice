
public class P32 {
	public static void main (String[] args)throws carexception
	{
		car car1 = new car();
		
		car1.setcar(1234, -10.0);
		
		car1.show();
	}
}

class carexception extends Exception
{
	
}

class car
{
	private int no;
	private double gas;
	
	public car()
	{
		no = 0; gas = 0; 
		
		System.out.println("已生產了車子");
	}
	
	public void setcar(int n, double g)throws carexception
	{
		if(g < 0)
		{
			carexception e = new carexception();
			throw e;
		}else
		{
			no = n; gas = g; 
			
			System.out.println("將車號設為" + no + "汽油量設為" + gas);
		}		
	}
	
	public void show()
	{
		System.out.println("車號是" + no);
		System.out.println("汽油量是" + gas);
	}
}