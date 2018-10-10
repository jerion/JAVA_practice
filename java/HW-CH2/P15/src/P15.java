import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P15 {
	public static void main(String[] args)throws IOException
	{
		System.out.println("輸入整數");
		
		BufferedReader BR =
				new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(BR.readLine());
		
		
		switch(A)
		{
			case 1:
			{
				System.out.println("是1");
			}
			case 2:
			{
				System.out.println("g42");
			}
			default:
			{
				System.out.println("2831OR2");
			}
		}
	}
}
