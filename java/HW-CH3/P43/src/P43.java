import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P43 {
	public static void main(String[] args) throws IOException {
		System.out.println("�п�J2�Ӿ��");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int no1 = Integer.parseInt(str1);
		int no2 = Integer.parseInt(str2);
		int ans = Math.max(no1, no2);
		
		System.out.println(no1+"�M"+no2+"���Фj���O"+ans);
	}
}
