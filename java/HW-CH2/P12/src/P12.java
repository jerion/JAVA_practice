import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P12 {

	public static void main(String[] args)throws IOException
	{
		System.out.println("��ơCOK?");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		if(a==1)
			System.out.println("�O1�O");
		else if(a==2)
			System.out.println("WOW�A�O2�C");
		else
			System.out.println("���ڿ�J1��2��");
	}
}
