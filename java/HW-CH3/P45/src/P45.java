
public class P45 {
	public static void main(String[] args) {
		System.out.println("�ŧicar1");
		car car1;
		car1 = new car();
		car1.setcar(1234, 20.5);
		
		System.out.println("�ŧicar2");
		car car2;
		
		System.out.println("�Ncar1���w��car2");
		car2 = car1;
		
		System.out.println("car1��");
		car1.show();
		
		System.out.println("car2��");
		car2.show();
		
		System.out.println("����car1���������");
		car1.setcar(2345, 30.5);
		
		System.out.println("car1��");
		car1.show();
		
		System.out.println("car2��");
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
	
	public void setcar(int n, double g)
	{
		no = n; gas = g;
		System.out.println("�N�����]��"+no+"�A�T�o�q�]��"+gas);
	}
	
	public void show()
	{
		System.out.println("�����O"+no);
		System.out.println("�T�o�q�O"+gas);
	}
}