import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P45 {
	public static void main(String[] args)throws IOException
	{
		System.out.println("5�ӼƦr");
		int[] a = new int[5];
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i<a.length ; i++)
		{
			int b = Integer.parseInt(br.readLine());
			a[i] = b;
		}
		
		int c;
		
		for (int i = 0; i<a.length-1 ;i++)
		{
			for (int j = i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
		}
		
		for (int i = 0; i<a.length; i++)
		{
			System.out.println("��"+(i+1)+"�W���ƬO"+a[i]);
		}
	}
}
