import java.util.Scanner;
import java.io.*;
public class Save
{
	File inputPlayer1 = new File("Player1.txt");/////////////////////////////////////////////////////////////
	Scanner scan1 = new Scanner(inputPlayer1);/////////////////////////////////////////////////////////////// Read Player Two's Save File
	File inputPlayer2 = new File("Player2.txt");/////////////////////////////////////////////////////////////
	Scanner scan2 = new Scanner(inputPlayer2);/////////////////////////////////////////////////////////////// Read Player Two's Save File
	File inputPlayer3 = new File("Player3.txt");/////////////////////////////////////////////////////////////
	Scanner scan3 = new Scanner(inputPlayer3);/////////////////////////////////////////////////////////////// Read Player Two's Save File

	private String player;/////////////////////////////////////////////////////////////////////////////////// Active player's name
	private String player1;////////////////////////////////////////////////////////////////////////////////// Player One Name
	private String player2;////////////////////////////////////////////////////////////////////////////////// Player Two Name
	private String player3;////////////////////////////////////////////////////////////////////////////////// Player Three Name
	private int storyEvent;////////////////////////////////////////////////////////////////////////////////// Story progress

	public Save() throws IOException///////////////////////////////////////////////////////////////////////// Default Constructor
	{////////////////////////////////////////////////////////////////////////////////////////////////////////
		player = "player1";////////////////////////////////////////////////////////////////////////////////// Active player name default
		player1 = scan1.nextLine();////////////////////////////////////////////////////////////////////////// Finds the player1 name in the txt
		player2 = scan2.nextLine();////////////////////////////////////////////////////////////////////////// Finds the player2 name in the txt
		player3 = scan3.nextLine();////////////////////////////////////////////////////////////////////////// Finds the player3 name in the txt
		storyEvent = 0;////////////////////////////////////////////////////////////////////////////////////// Default story start
	}//////////////////////////////////////////////////////////////////////////////////////////////////////// End of Default Constructor





	//public void savePlayer1() throws IOException/////////////////////////////////////////////////////////// This method saves Player1 file (doesn't work)
	//{
		//FileOutputStream outputPlayer1 = new FileOutputStream("Player1.txt", false);///////////////////////
		//PrintWriter p1 = new PrintWriter(outputPlayer1);/////////////////////////////////////////////////// Print to Player One's Save File	
		//try 
		//{
			//p1.println(player1);
			//p1.close();
		//}
		//catch (IOException bleh)
	//	{
			
		//}
	//}////////////////////////////////////////////////////////////////////////////////////////////////////// savePlayer1() End.





	//public void savePlayer2() throws Exception///////////////////////////////////////////////////////////// This method saves Player2 file (doesn't work)
	//{
		//FileOutputStream outputPlayer2 = new FileOutputStream("Player2.txt", false);///////////////////////
		//PrintWriter p2 = new PrintWriter(outputPlayer2);/////////////////////////////////////////////////// Print to Player Two's Save File
		//p2.println(player2);
	//}////////////////////////////////////////////////////////////////////////////////////////////////////// savePlayer2() End.





	//public void savePlayer3() throws Exception///////////////////////////////////////////////////////////// This method saves Player3 file (doesn't work)
	//{
		//FileOutputStream outputPlayer3 = new FileOutputStream("Player3.txt", false);///////////////////////
		//PrintWriter p3 = new PrintWriter(outputPlayer3);/////////////////////////////////////////////////// Print to Player Three's Save File
		//p3.println(player3);
	//}////////////////////////////////////////////////////////////////////////////////////////////////////// savePlayer3() End.




	
	public String getPlayerName()//////////////////////////////////////////////////////////////////////////// This method retrieves the active player name
	{////////////////////////////////////////////////////////////////////////////////////////////////////////
		return player;///////////////////////////////////////////////////////////////////////////////////////
	}//////////////////////////////////////////////////////////////////////////////////////////////////////// getPlayerName() End.





	public String getPlayer1Name()/////////////////////////////////////////////////////////////////////////// This method retrieves the player1 name
	{////////////////////////////////////////////////////////////////////////////////////////////////////////
		return player1;//////////////////////////////////////////////////////////////////////////////////////
	}//////////////////////////////////////////////////////////////////////////////////////////////////////// getPlayer1Name() End.





	public String getPlayer2Name()/////////////////////////////////////////////////////////////////////////// This method retrieves the player2 name
	{////////////////////////////////////////////////////////////////////////////////////////////////////////
		return player2;//////////////////////////////////////////////////////////////////////////////////////
	}//////////////////////////////////////////////////////////////////////////////////////////////////////// getPlayer2Name() End.





	public String getPlayer3Name()/////////////////////////////////////////////////////////////////////////// This method retrieves the player3 name
	{////////////////////////////////////////////////////////////////////////////////////////////////////////
		return player3;//////////////////////////////////////////////////////////////////////////////////////
	}//////////////////////////////////////////////////////////////////////////////////////////////////////// getPlayer3Name() End.





	public void setPlayerName(String answer)///////////////////////////////////////////////////////////////// This method sets the active player name
	{////////////////////////////////////////////////////////////////////////////////////////////////////////
		player = answer;/////////////////////////////////////////////////////////////////////////////////////
	}//////////////////////////////////////////////////////////////////////////////////////////////////////// setPlayerName() End.





	public void setPlayer1Name(String answer)//////////////////////////////////////////////////////////////// This method sets the player1 name
	{////////////////////////////////////////////////////////////////////////////////////////////////////////
		player1 = answer;////////////////////////////////////////////////////////////////////////////////////
	}//////////////////////////////////////////////////////////////////////////////////////////////////////// setPlayer1Name() End.





	public void setPlayer2Name(String answer)//////////////////////////////////////////////////////////////// This method sets the player2 name
	{////////////////////////////////////////////////////////////////////////////////////////////////////////
		player2 = answer;////////////////////////////////////////////////////////////////////////////////////
	}//////////////////////////////////////////////////////////////////////////////////////////////////////// setPlayer2Name() End.





	public void setPlayer3Name(String answer)//////////////////////////////////////////////////////////////// This method sets the player3 name
	{////////////////////////////////////////////////////////////////////////////////////////////////////////
		player3 = answer;////////////////////////////////////////////////////////////////////////////////////
	}//////////////////////////////////////////////////////////////////////////////////////////////////////// setPlayer3Name() End.




	public int getStoryEvent()/////////////////////////////////////////////////////////////////////////////// This method retrieves the story progress
	{////////////////////////////////////////////////////////////////////////////////////////////////////////
		return storyEvent;///////////////////////////////////////////////////////////////////////////////////
	}//////////////////////////////////////////////////////////////////////////////////////////////////////// getStoryEvent() End.





	public void setStoryEvent(int answer)/////////////////////////////////////////////////////////////////////////////// This method retrieves the story progress
	{////////////////////////////////////////////////////////////////////////////////////////////////////////
		storyEvent = answer;///////////////////////////////////////////////////////////////////////////////////
	}//////////////////////////////////////////////////////////////////////////////////////////////////////// getStoryEvent() End.



	
	public void checkClass()///////////////////////////////////////////////////////////////////////////////// This method is a tester
	{////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("This class works fine");/////////////////////////////////////////////////////////
	}//////////////////////////////////////////////////////////////////////////////////////////////////////// checkClass() End.


	
}//////////////////////////////////////////////////////////////////////////////////////////////////////////// End of Save class.