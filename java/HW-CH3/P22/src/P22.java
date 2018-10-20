
public class P22 {
	public static void main(String[] args) {
		car car1;
		car1 = new car();
		
		car1.setnosetgas(1234, 20.5);
		car1.show();
		
		System.out.println("指定不正確的汽油量(-10.0)看看");
		
		car1.setnosetgas(1234, -10);
		car1.show();
	}
}

class car
{
	private int no;
	private double gas;
	
	public void setnosetgas(int n, double g)
	{
		if(g>0 && g<1000)
		{
			no = n; gas = g;
			
			System.out.println("將車號設為"+ no+ "，汽油量設為"+ gas);
		}
		
		else
		{
			System.out.println("不是正確的汽油量");
			System.out.println("無法顯示汽油量");
		}
	}
	
	public void show()
	{
		System.out.println("車號是"+ this.no);
		System.out.println("汽油量是"+ this.gas);
	}
}