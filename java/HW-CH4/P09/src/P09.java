
public class P09 {
	public static void main (String[] args)
	{
		racingcar rccar1 = new racingcar();
		
		rccar1.newshow();
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
	
	public void setcourse(int c)
	{
		course = c;
		System.out.println("�N�ɨ������]��" + course);
	}
	
	public void newshow()
	{
		System.out.println("�ɨ������O" + no);
		System.out.println("�T�o�q�O" + gas);
		System.out.println("�ɨ��s���O" + course);
	}
}