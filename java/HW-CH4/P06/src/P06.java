
public class P06 {
	public static void main(String[] args)
	{
		racingcar rccar1 = new racingcar(1234, 20.5, 5);
	}
}

class car
{
	private int no;
	private double gas;
	
	public car()
	{
		no = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	
	public car(int n, double g)
	{
		no = n; gas = g;
		System.out.println("�Ͳ��F�����O" + no
				+ "�A�T�o�q�O" + gas + "�����l");
	}
	
	public void setcar(int n, double g)
	{
		no = n; gas = g;
		System.out.println("�N�����]��" + no
				+ "�N�T�o�q�]��" + gas);
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
	
	public racingcar(int n, double g, int c)
	{
		super(n, g);
		course = 0;
		System.out.println("�Ͳ��F�s����" + c + "���ɨ�");
	}
	
	public void setcourse(int c)
	{
		course = c;
		System.out.println("�N�ɨ������]��" + course);
	}
}