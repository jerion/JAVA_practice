package pa;

class car {
	private int no;
	private double gas;
	
	public car()
	{
		no = 0; 
		gas = 0.0;
		System.out.println("�w�Ͳ��F�T��");
	}
	
	public void setcar(int n, double g)
	{
		no = n; gas = g;
		System.out.println("�N�����]��" + no + 
				"�T�o�q�]��" + gas);
	}
	
	public void show()
	{
		System.out.println("�����O" + no);
		System.out.println("�T�o�q�O" + gas);
	}
}
