import java.util.*;
public class Utility 
{
	private static Scanner scan = new Scanner(System.in);
	private static String menuAnswer = "";





	public String promptUser()/////////////////////////////////////////////////////////////////////////////// This method Prompts the User and converts
	{//////////////////////////////////////////////////////////////////////////////////////////////////////// the answer into a single character
		menuAnswer = scan.next();////////////////////////////////////////////////////////////////////////////
		menuAnswer = menuAnswer.toUpperCase();/////////////////////////////////////////////////////////////// 
		menuAnswer = menuAnswer.substring(0,1);////////////////////////////////////////////////////////////// 
		return menuAnswer;/////////////////////////////////////////////////////////////////////////////////// 
	}//////////////////////////////////////////////////////////////////////////////////////////////////////// promptUser() End.
	





	public void checkClass()///////////////////////////////////////////////////////////////////////////////// This method is a tester
	{////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("This class works fine");/////////////////////////////////////////////////////////
	}//////////////////////////////////////////////////////////////////////////////////////////////////////// checkClass() End.
}
