
public class P24 {
	public static void main(String[] args)
	{
		car car1 = new car();
		
		car1.setcar(1234, 20.5);
		System.out.println(car1);
	}
}

class car
{
	protected int no;
	protected double gas;
	
	public car()
	{
		no = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	
	public void setcar(int n, double g)
	{
		no = n; gas = g;
		System.out.println("�N�����]��" + no
				+ "�A�N�T�o�q�]��" + gas);
	}
	
	public String toString()
	{
		String str = "�����O" + no + "�A�T�o�q�O" + gas;
		return str;
	}
}