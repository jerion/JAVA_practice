
public class P17 {
	public static void main(String[] args)
	{
		car car[] = new car[2];
		
		car[0] = new car();
		car[0].setcar(1234, 20.5);
		
		car[1] = new racingcar();
		car[1].setcar(4567, 30.5);
		
		for(int i = 0; i<car.length; i++)
		{
			car[i].show();
		}
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
	
	public void show()
	{
		System.out.println("�����O" + no);
		System.out.println("�T�o�q�O" + gas);
	}
}

class racingcar extends car
{
	private int course;
	
	public racingcar()
	{
		course = 0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	
	public void setcourse(int c)
	{
		course = c;
		System.out.println("�N�ɨ������]��" + course);
	}
	
	public void show()
	{
		System.out.println("�ɨ������O" + no);
		System.out.println("�T�o�q�O" + gas);
		System.out.println("�ɨ��s���O" + course);
	}
}