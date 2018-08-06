import java.util.Scanner;
public class Main 
{
    private static int countWords(String input)
    {
        if(input == null)
        return 1;
        String[] words = input.split("\\s+");
        return words.length;
    }
    public static void main(String[] args) 
    {
	Scanner scanner = new Scanner(System.in);
	String inputStr = scanner.nextLine();
	System.out.println(countWords(inputStr));
    }
}
