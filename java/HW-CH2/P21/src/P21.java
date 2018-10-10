import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class P21 {
	public static void main(String[] args)throws IOException
	{
		System.out.println("路線2選1");
		System.out.println("輸整數選擇");
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		char ans = (res == 1)?'A':'B';
		
		System.out.println("路線"+ans);
	}
}
