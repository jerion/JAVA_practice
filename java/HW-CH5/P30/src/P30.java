
public class P30 {
	public static void main (String[] args)
	{
		car car1 = new car();
		
		try
		{
			car1.setcar(1234, -10.0);
		}catch(carexception e)
		{
			System.out.println("�ߥX" + e + "�F");
		}
		
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
		
		System.out.println("�w�Ͳ��F���l");
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
			
			System.out.println("�N�����]��" + no + "�T�o�q�]��" + gas);
		}		
	}
	
	public void show()
	{
		System.out.println("�����O" + no);
		System.out.println("�T�o�q�O" + gas);
	}
}