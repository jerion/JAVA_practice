
public class P47 {
	public static void main(String[] args) {
		car car1; car1 = new car();
		car1.show();
		
		int no = 1234; double gas = 20.5; String name = "1號車";
		
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
		no = 0; gas = 0.0; name = "沒有名稱";
		System.out.println("生產了車子");
	}
	
	public void setcar(int n, double g)
	{
		no = n; gas = g;
		System.out.println("將車號設為"+no+"，汽油量設為"+gas);
	}
	
	public void setname(String nm)
	{
		name = nm;
		System.out.println("將車名設為"+name);
	}
	
	public void show()
	{
		System.out.println("車號是"+no);
		System.out.println("汽油量是"+gas);
		System.out.println("車名是"+name);
	}
}