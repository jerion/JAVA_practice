import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P32 {
	public static void main(String[] args)throws IOException,InterruptedException
	{
		System.out.println("�b��a���j����X�j��?(1~10)");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= 10; i++)
		{
			System.out.println("�j��"+i);
			Thread.sleep(450);
			if(i==a)
				break;
		}
		
		System.out.println("End");
	}
}
