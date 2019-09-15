public class bottle {
	static class bottles{
		int N = 99;
	}
	public static void main(String[] args) {
		bottles a = new bottles();
		String s1 = " bottle";
		String s2 = " bottles";
		while(a.N > 0) {
			if(a.N > 1)
				System.out.println(a.N + s2 + " of beer on the wall," + a.N + s2 + " of beer.");
			else
				System.out.println(a.N + s1 + " of beer on the wall," + a.N + s1 + " of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			if(a.N > 2)
				System.out.println(a.N - 1 + s2 + " of beer on the wall.");
			else if (a.N == 2)
				System.out.println(a.N - 1 + s1 + " of beer on the wall.");
			else
				System.out.println("No more bottles of beer on the wall");
			a.N -= 1;
		}
	}
} 
