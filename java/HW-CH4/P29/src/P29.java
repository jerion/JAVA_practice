
public class P29 {
	public static void main (String[] args)
	{
		vehicle[] vc = new vehicle[2];
		
		vc[0] = new car(1234, 20.5);
		vc[0].setspeed(60);
		
		vc[1] = new plane(232);
		vc[1].setspeed(500);
		
		for(int i = 0; i<vc.length; i++)
		{
			vc[i].show();
		}
	}
}

abstract class vehicle
{
	protected int speed;
	protected void setspeed(int s)
	{
		speed = s;
		System.out.println("�N�t�׳]��" + speed);
		
	}
	
	abstract void show();
}

class car extends vehicle
{
	private int no;
	private double gas;
	
	public car(int n, double g)
	{
		no = n; gas = g;
		System.out.println("�Ͳ��F�����O" + no
				+ "�A�T�o�q�O" + gas + "�����l");	
	}
	
	public void show()
	{
		System.out.println("�����O" + no);
		System.out.println("�T�o�q�O" + gas);
		System.out.println("�t�׬O" + speed);
	}
}

class plane extends vehicle
{
	private int flight;
	
	public plane(int f)
	{
		flight = f;
		System.out.println("�Ͳ��F" + flight + "�Z��������");
	}
	
	public void show()
	{
		System.out.println("�������Z���O" + flight);
		System.out.println("�t�׬O" + speed);
	}
}