
public class P26 {
	public static void main(String[] args) throws InterruptedException
	{
		int i = 1;
		while(i <= 5)
		{
			System.out.println("�j��"+i+"��");
			Thread.sleep(500);
			i++;
		}
		System.out.println("����");
	}
}
