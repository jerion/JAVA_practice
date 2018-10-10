
public class P30 {
	public static void main(String[] args)throws InterruptedException
	{
		int i,j;
		for(i = 0; i < 5; i++)
		{
			for(j = 0; j < 4; j++)
			{
				System.out.println("°j°é"+i+"¤§"+j);
				Thread.sleep(250);
			}
			Thread.sleep(1000);
		}
		
		System.out.println("To be continue...");
	}
}
