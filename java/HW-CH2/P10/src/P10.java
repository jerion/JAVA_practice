import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P10 {

	public static void main(String[] args)throws IOException
	{
		System.out.println("��J���");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		if(a==1)
		{
			System.out.println("��J�F1");
		}
		
		else
		{
			System.out.println("��J�F���O1�A�O"+a);
		}
	}
}
