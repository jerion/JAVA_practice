
public class P47 {
	public static void main(String[] args) {
		car car1; car1 = new car();
		car1.show();
		
		int no = 1234; double gas = 20.5; String name = "1����";
		
		car1.setcar(no, gas);
		car1.setname(name);
		
		car1.show();
	}
}

class car
{
	private int no;
	private double gas;
	private String name;
	
	public car()
	{
		no = 0; gas = 0.0; name = "�S���W��";
		System.out.println("�Ͳ��F���l");
	}
	
	public void setcar(int n, double g)
	{
		no = n; gas = g;
		System.out.println("�N�����]��"+no+"�A�T�o�q�]��"+gas);
	}
	
	public void setname(String nm)
	{
		name = nm;
		System.out.println("�N���W�]��"+name);
	}
	
	public void show()
	{
		System.out.println("�����O"+no);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("���W�O"+name);
	}
}