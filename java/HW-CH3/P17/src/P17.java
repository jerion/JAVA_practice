
public class P17 {
	public static void main(String[] args) {
		car car1;
		car1 = new car();
		
		car1.setnosetgas(1234, 20.5);
		
		int no = car1.getno();
		double gas = car1.getgas();
		
		System.out.println("�լd�˫~���ɱo��");
		System.out.println("�����O"+no+"�A�T�o�q�O"+gas);
	}
}

class car
{
	int no; double gas; 
	
	int getno()
	{
		System.out.println("�լd����");
		return no;
	}
	
	double getgas()
	{
		System.out.println("�լd�T�o�q");
		return gas;
	}
	
	void setnosetgas(int n, double g)
	{
		no = n;
		gas = g;
		System.out.println("�N�����]��"+ no+ "�A�T�o�q�]��"+ gas);
	}
}