
public class P15 {
	public static void main(String[] args) {
		car car1;
		car1 = new car();
		
		int no = 1234; double gas = 20.5;
		
		car1.setNOsetGas(no, gas);
	}
}

class car
{
	int no; double gas;
	
	void setNOsetGas(int n, double g)
	{
		no = n; gas = g;
		System.out.println("�N�����]��"+ no+ "�A�T�o�q�]��"+ gas);
	}
	
	void show()
	{
		System.out.println("�����O"+ no);
		System.out.println("�T�o�q�O"+ gas);
	}
}