
public class P24 {
	public static void main(String[] args)
	{
		car car1 = new car();
		
		car1.setcar(1234, 20.5);
		System.out.println(car1);
	}
}

class car
{
	protected int no;
	protected double gas;
	
	public car()
	{
		no = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public void setcar(int n, double g)
	{
		no = n; gas = g;
		System.out.println("將車號設為" + no
				+ "，將汽油量設為" + gas);
	}
	
	public String toString()
	{
		String str = "車號是" + no + "，汽油量是" + gas;
		return str;
	}
}