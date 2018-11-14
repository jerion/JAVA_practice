
public class P38 {
	public static void main(String[] args)
	{
		vehicle[] vc = new vehicle[2];
		
		vc[0] = new car(1234, 20.5);
		vc[1] = new plane(232);
		
		for(int i = 0; i<vc.length; i++)
		{
			vc[i].show();
		}
	}
}

interface vehicle
{
	int weight = 1000;
	void show();
}

class car implements vehicle
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
	}
}

class plane implements vehicle
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
	}
}