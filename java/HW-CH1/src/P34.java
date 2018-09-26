
public class P34 
{
	public static void main(String[] args)
	{
		int a1 = 8;
		int a2 = 9;
		
		System.out.println("a1, a2的運算");
		
		System.out.println("a1+a2= "+(a1+a2));
		System.out.println("a1-a2= "+(a1-a2));
		System.out.println("a1*a2= "+(a1*a2));
		System.out.println("a1/a2= "+(a1/a2));
		System.out.println("a1%a2= "+(a1%a2));
		
		int b1 = 1, b2 = 1, b3 = 1;
		
		b2 = b1++;				
		System.out.println("因為是在指定後遞增，故b2= "+b2);
		
		System.out.println("b1= "+b1+"，b2= "+b2+"，b3= "+b3);
		
		b3 = ++b1;
		System.out.println("因在指定後遞增，故b3= "+b3);
	}
}
