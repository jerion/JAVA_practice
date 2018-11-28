package pa;

class car {
	private int no;
	private double gas;
	
	public car()
	{
		no = 0; 
		gas = 0.0;
		System.out.println("已生產了汽車");
	}
	
	public void setcar(int n, double g)
	{
		no = n; gas = g;
		System.out.println("將車號設為" + no + 
				"汽油量設為" + gas);
	}
	
	public void show()
	{
		System.out.println("車號是" + no);
		System.out.println("汽油量是" + gas);
	}
}
