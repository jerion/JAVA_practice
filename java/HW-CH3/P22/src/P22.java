
public class P22 {
	public static void main(String[] args) {
		car car1;
		car1 = new car();
		
		car1.setnosetgas(1234, 20.5);
		car1.show();
		
		System.out.println("���w�����T���T�o�q(-10.0)�ݬ�");
		
		car1.setnosetgas(1234, -10);
		car1.show();
	}
}

class car
{
	private int no;
	private double gas;
	
	public void setnosetgas(int n, double g)
	{
		if(g>0 && g<1000)
		{
			no = n; gas = g;
			
			System.out.println("�N�����]��"+ no+ "�A�T�o�q�]��"+ gas);
		}
		
		else
		{
			System.out.println("���O���T���T�o�q");
			System.out.println("�L�k��ܨT�o�q");
		}
	}
	
	public void show()
	{
		System.out.println("�����O"+ this.no);
		System.out.println("�T�o�q�O"+ this.gas);
	}
}