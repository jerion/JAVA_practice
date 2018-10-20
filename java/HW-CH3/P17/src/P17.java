
public class P17 {
	public static void main(String[] args) {
		car car1;
		car1 = new car();
		
		car1.setnosetgas(1234, 20.5);
		
		int no = car1.getno();
		double gas = car1.getgas();
		
		System.out.println("調查樣品車時得知");
		System.out.println("車號是"+no+"，汽油量是"+gas);
	}
}

class car
{
	int no; double gas; 
	
	int getno()
	{
		System.out.println("調查車號");
		return no;
	}
	
	double getgas()
	{
		System.out.println("調查汽油量");
		return gas;
	}
	
	void setnosetgas(int n, double g)
	{
		no = n;
		gas = g;
		System.out.println("將車號設為"+ no+ "，汽油量設為"+ gas);
	}
}