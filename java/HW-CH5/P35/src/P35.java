import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class P35 {
	public static void main (String[] args)
	{
		try
		{
			FileWriter fw = new FileWriter("test.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			
			pw.println("Hello!");
			pw.println("GoodBye!");
			
			pw.close();
			
			System.out.println("����w�g�J�ɮפF");
		}catch (IOException e)
		{
			System.out.println("��X�J���~");
		}
	}
}