import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P14 {

	public static void main(String[] args)throws IOException
	{
		System.out.println("整數，K?");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		switch(a)
		{
		case 1:
		{
			System.out.println("輸了1");
			break;
		}
		case 2:
		{
			System.out.println("是2");
			break;
		}
		default:
		{
			System.out.println("type 1 or 2");
			break;
		}
		
		}
	}
}
