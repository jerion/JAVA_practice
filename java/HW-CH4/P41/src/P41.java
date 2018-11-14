
public class P41 {
	public static void main (String[] args)
	{
		car car1 = new car(1234, 20.5);
		
		car1.vshow();
		car1.mshow();
	}
}

interface vehicle
{
	void vshow();
}

interface material
{
	void mshow();
}

class car implements vehicle, material
{
	private int no;
	private double gas;
	
	public car(int n, double g)
	{
		no = n; gas = g;
		System.out.println("生產了車號是" + no
				+ "，汽油量是" + gas + "的車子");
	}
	
	public void vshow()
	{
		System.out.println("車號是" + no);
		System.out.println("汽油量是" + gas);
	}
	
	public void mshow()
	{
		System.out.println("車號是的材質是鐵");
	}
}