import java.lang.reflect.Array;

public class P40 {
	public static void main(String[] args)
	{
		int[] a = (int[]) Array.newInstance(int.class, 3);
		
		Array.set(a, 0, 123);
		Array.set(a, 1, 456);
		Array.set(a, 2, 789);
		
		for(int i = 0; i<3; i++)
		{
			System.out.println("a["+i+"] = "+Array.get(a,i));
		}
	}
}
