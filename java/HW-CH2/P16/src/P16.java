import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class P16 {
	public static void main(String[] args)throws IOException
	{
		System.out.println("a or b");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		char letter = str.charAt(0);
		
		switch(letter)
		{
		case 'a':
		{
			System.out.println("g4 a");
			break;
		}
		case 'b':
		{
			System.out.println("g4 b");
			break;
		}
		default:
		{
			System.out.println("a nor b");
			break;
		}
		}
	}

}
