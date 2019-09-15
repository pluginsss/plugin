import java.util.*;

public class Integral {
	static float fun(float x){
		return 1 + x * x;
	}
	static float text(float a, float b)
	{
		float s, h;
		int n = 100, i;

		s = fun(a) + fun(b) / 2;
		h = (b - a) / 100;
		for(i = 1; i < n; i++)
			s += fun(a + i * h);
		return s * h;
	}
	public static void main(String[] args)
	{
		float sum;
		
		System.out.print("Please enter the lower and upper: ");
		Scanner in = new Scanner(System.in);
		float a = in.nextFloat();
		float b = in.nextFloat();
		sum = text(a, b);
		System.out.println("The integral is "+ sum);
	}
}

