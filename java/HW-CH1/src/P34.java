
public class P34 
{
	public static void main(String[] args)
	{
		int a1 = 8;
		int a2 = 9;
		
		System.out.println("a1, a2���B��");
		
		System.out.println("a1+a2= "+(a1+a2));
		System.out.println("a1-a2= "+(a1-a2));
		System.out.println("a1*a2= "+(a1*a2));
		System.out.println("a1/a2= "+(a1/a2));
		System.out.println("a1%a2= "+(a1%a2));
		
		int b1 = 1, b2 = 1, b3 = 1;
		
		b2 = b1++;				
		System.out.println("�]���O�b���w�Ỽ�W�A�Gb2= "+b2);
		
		System.out.println("b1= "+b1+"�Ab2= "+b2+"�Ab3= "+b3);
		
		b3 = ++b1;
		System.out.println("�]�b���w�Ỽ�W�A�Gb3= "+b3);
	}
}
