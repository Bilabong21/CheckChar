import java.util.*;

public class CheckCharB
  {
    public static void main(String[] args)
	{
	    Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter the characters : ");
		char theChar = kb.nextLine().charAt(0);
		
		while(theChar != '*')
		{
		    boolean returned = letterDigit(theChar);
			System.out.println(returned);
		    System.out.print("Enter the characters : ");
		    theChar = kb.nextLine().charAt(0);	
		}
	}
	public static boolean letterDigit(char theChar)
	{
		boolean answer = true;
		if(Character.isLetterOrDigit(theChar))
	    {
		    answer = true;
		}
		else
		{
			answer = false;
		}
		return answer;
	}

  }