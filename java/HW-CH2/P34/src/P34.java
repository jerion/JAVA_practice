import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P34 {
	public static void main(String[] args)throws IOException,InterruptedException
	{
		System.out.println("¸õ¹L²Äa¦¸°j°é?(1~10)");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= 10; i++)
		{
			if(i==a)
			{
				continue;
			}
			System.out.println("°j°é"+i);
			Thread.sleep(450);
		}
		
		System.out.println("End");
	}
}
