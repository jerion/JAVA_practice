
public class P28 {
	public static void main(String[] args) {
		car car1;
		car1 = new car();
		car1.show();
		
		car car2;
		car2 = new car(1234, 25.0);
		car2.show();
	}
}

class car
{
	private int no;
	private double gas;
	
	public car()
	{
		no = 0; gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	
	public car(int n, double g)
	{
		this();
		no = n; gas = g;
		System.out.println("�Ͳ��F�����O"+no+"�A�T�o�q�O"+gas+"�����l");
	}
	
	public void show()
	{
		System.out.println("�����O"+no);
		System.out.println("�T�o�q�O"+gas);
	}
}