
public class P24 {
	public static void main(String[] args) throws InterruptedException {
		car car1;
		car1 = new car();
		
		car1.setcar(1234, 20.5);
		car1.show();
		
		Thread.sleep(2000);
		
		System.out.println("�u�ܧ󨮸�");
		car1.setcar(2345);
		car1.show();
		
		Thread.sleep(2000);
		
		System.out.println("�u�ܧ�T�o�q");
		car1.setcar(30.5);
		car1.show();
	}
}

class car
{
	private int no;
	private double gas;
	
	public void setcar(int n) 
	{
		no = n;
		System.out.println("�N�����]��"+no+"\n");
	}
	
	public void setcar(double g)
	{
		gas = g;
		System.out.println("�N�T�o�q�]��"+gas+"\n");
	}
	
	public void setcar(int n, double g)
	{
		no = n; gas = g;
		System.out.println("�N�����]��"+no+"�A�T�o�q�]��"+gas+"\n");
	}
	
	public void show()
	{
		System.out.println("�����O"+this.no);
		System.out.println("�T�o�q�O"+this.gas);
	}
}