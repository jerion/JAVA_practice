
public class P41 {
	public static void main (String[] args)
	{
		car car1 = new car(1234, 20.5);
		
		car1.vshow();
		car1.mshow();
	}
}

interface vehicle
{
	void vshow();
}

interface material
{
	void mshow();
}

class car implements vehicle, material
{
	private int no;
	private double gas;
	
	public car(int n, double g)
	{
		no = n; gas = g;
		System.out.println("�Ͳ��F�����O" + no
				+ "�A�T�o�q�O" + gas + "�����l");
	}
	
	public void vshow()
	{
		System.out.println("�����O" + no);
		System.out.println("�T�o�q�O" + gas);
	}
	
	public void mshow()
	{
		System.out.println("�����O������O�K");
	}
}