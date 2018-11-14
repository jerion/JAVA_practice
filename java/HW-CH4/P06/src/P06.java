
public class P06 {
	public static void main(String[] args)
	{
		racingcar rccar1 = new racingcar(1234, 20.5, 5);
	}
}

class car
{
	private int no;
	private double gas;
	
	public car()
	{
		no = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public car(int n, double g)
	{
		no = n; gas = g;
		System.out.println("生產了車號是" + no
				+ "，汽油量是" + gas + "的車子");
	}
	
	public void setcar(int n, double g)
	{
		no = n; gas = g;
		System.out.println("將車號設為" + no
				+ "將汽油量設為" + gas);
	}
	
	public void show()
	{
		System.out.println("車號是" + no);
		System.out.println("汽油量是" + gas);
	}
}

class racingcar extends car
{
	private int course;
	
	public racingcar()
	{
		course = 0;
		System.out.println("生產了賽車");
	}
	
	public racingcar(int n, double g, int c)
	{
		super(n, g);
		course = 0;
		System.out.println("生產了編號為" + c + "的賽車");
	}
	
	public void setcourse(int c)
	{
		course = c;
		System.out.println("將賽車車號設為" + course);
	}
}