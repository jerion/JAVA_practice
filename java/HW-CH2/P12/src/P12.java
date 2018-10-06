import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P12 {

	public static void main(String[] args)throws IOException
	{
		System.out.println("整數。OK?");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		if(a==1)
			System.out.println("是1呢");
		else if(a==2)
			System.out.println("WOW，是2耶");
		else
			System.out.println("給我輸入1或2喔");
	}
}
