
public class P14 {
	public static void main(String[] args) {
		car car1;
		car1 = new car();
		
		car1.setNO(1234);
		car1.setGas(20.5);
	}
}

class car
{
	int no; double gas;
	
	void setNO(int n)
	{
		no = n;
		System.out.println("�N�����]��"+ no);		
	}
	
	void setGas(double g)
	{
		gas = g;
		System.out.println("�N�T�o�q�]��"+ gas);
	}
}