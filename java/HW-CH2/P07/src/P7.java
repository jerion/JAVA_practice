import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P7 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("�п�J���");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		if(a==1)
		{
			System.out.println("�A��J�F1");
			System.out.println("�A��F1");
		}
		
		System.out.println("�{������");
	}
	
}
