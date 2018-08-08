import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
						Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		StringBuilder str = new StringBuilder(s);
		for(int i = 0; i < n; i++) 
		{
			str.append(s);
		}
		System.out.println(str.toString());
	}
}
