
public class P48 {
	public static void main (String[] args)
	{
		car car1 = new car("1����");
		car1.start();
		
		try
		{
			car1.join();
		}catch(InterruptedException e)
		{
			
		}
		
		System.out.println("����main()���B�z�u�@");
	}
}

class car extends Thread
{
	private String name;
	
	public car(String nm)
	{
		name = nm;
	}
	
	public void run()
	{
		for(int i = 0; i<5; i++)
		{
			System.out.println("���b�i��" + name + "���u�@");
		}
	}
}