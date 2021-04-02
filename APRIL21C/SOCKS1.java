import java.util.Scanner;

class SOCKS1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		long c = in.nextLong();
		if(a==b||a==c||b==c) System.out.println("YES");
		else System.out.println("NO");
	}
}
