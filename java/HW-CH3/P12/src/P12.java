
public class P12 {
	public static void main(String[] args) {
		car car1;
		car1 = new car();
		
		car1.no = 1234;
		car1.gas = 20.5;
		
		car1.showcar();
	}
}

class car
{
	int no;double gas;
	
	void show()
	{
		System.out.println("�����O"+ no);
		System.out.println("�T�o�q�O"+ gas);
	}
	
	void showcar()
	{
		System.out.println("�}�l��ܨ��l���");
		this.show();
	}
}