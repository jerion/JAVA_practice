
public class P14 {
	public static void main(String[] args)
	{
		car car1 = new racingcar();
		car1.setcar(1234, 20.5);
		
		car1.show();
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