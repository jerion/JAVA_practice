import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P7 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入整數");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		if(a==1)
		{
			System.out.println("你輸入了1");
			System.out.println("你選了1");
		}
		
		System.out.println("程式結束");
	}
	
}
