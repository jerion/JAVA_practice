import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P14 {

	public static void main(String[] args)throws IOException
	{
		System.out.println("��ơAK?");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		switch(a)
		{
		case 1:
		{
			System.out.println("��F1");
			break;
		}
		case 2:
		{
			System.out.println("�O2");
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
