
public class P49 {
	public static void main(String[] args)throws InterruptedException
	{
		int[][] a;
		a = new int [2][5];
		
		a[0][0]=80;
		a[0][1]=60;
		a[0][2]=22;
		a[0][3]=50;
		a[0][4]=75;
		a[1][0]=90;
		a[1][1]=55;
		a[1][2]=68;
		a[1][3]=72;
		
		for (int i = 0 ; i<a[0].length; i++)
		{
			System.out.print("��"+(i+1)+"�H�A�����ƬO"+a[0][i]+"�A");
			System.out.println("�^����ƬO"+a[1][i]);
			Thread.sleep(250);
		}
	}
}
