import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in); 
		String st=s.nextLine();
		int count=0;
		char[] c=st.toCharArray();
		for(int i=0;i<st.length();i++)
		if(c[i]!=' ') count++;
		System.out.println((st.length()-count));
		String words[]=st.split(" ");

	}

}
