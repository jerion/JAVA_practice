
public class P17 {
	public static void main(String[] args)
	{
		car car[] = new car[2];
		
		car[0] = new car();
		car[0].setcar(1234, 20.5);
		
		car[1] = new racingcar();
		car[1].setcar(4567, 30.5);
		
		for(int i = 0; i<car.length; i++)
		{
			car[i].show();
		}
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
	
	public void setcourse(int c)
	{
		course = c;
		System.out.println("將賽車車號設為" + course);
	}
	
	public void show()
	{
		System.out.println("賽車車號是" + no);
		System.out.println("汽油量是" + gas);
		System.out.println("賽車編號是" + course);
	}
}