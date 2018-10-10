
public class P28 {
	public static void main(String[] args)throws InterruptedException
	{
		int i = 1;
		do
		{
			System.out.println("LOOP "+i);
			i++;
			Thread.sleep(250);
		}while (i <= 5);
		
		System.out.println("To be continue...");
	}
}
