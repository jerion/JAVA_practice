import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class P47 {
	public static void main(String[] args)throws IOException
	{
		System.out.println("5個數字");
		Integer a[] = new Integer[5];
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i<a.length ; i++)
		{
			int b = Integer.parseInt(br.readLine());
			a[i] = b;
		}
		
		Arrays.sort(a, Collections.reverseOrder());
		
		for (int i = 0; i<a.length; i++)
		{
			System.out.println("第"+(i+1)+"名分數是"+a[i]);
		}
	}
}
