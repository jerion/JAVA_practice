import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P19 {
	public static void main(String[] args)throws IOException
	{
		System.out.println("是男的?");
		System.out.println("type Y / N");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str =br.readLine();
		
		char ch = str.charAt(0);
		
		if(ch=='y'||ch=='Y')
		{
			System.out.println("man");
		}
		else if(ch=='n'||ch=='N')
		{
			System.out.println("woman");
		}
		else
		{
			System.out.println("人妖?");
		}
	}
}
