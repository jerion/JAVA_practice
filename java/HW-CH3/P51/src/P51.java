
public class P51 {
	public static void main(String[] args) {
		car[] car1; car1 = new car[3];
		
		for (int i = 0; i < car1.length; i++)
		{
			car1[i] = new car();
		}
		
		car1[0].setcar(1234, 20.5);
		car1[1].setcar(2345, 30.5);
		car1[2].setcar(3456, 40.5);
		
		for	(int i = 0; i < car1.length; i++)
		{
			car1[i].show();
		}
	}
}

class car
{
	int no;
	double gas;
	
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