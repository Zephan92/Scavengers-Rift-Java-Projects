public class NewGameMenu extends MainMenu 
{
	public String displayMenu()//////////////////////////////////////////////////////////// This method changes the mainOptions
	{
		Save save = new Save();
		Save save1 = save.readFile(1);
		Save save2 = save.readFile(2);
		Save save3 = save.readFile(3);
		return /////////////////////////////////////////////////////////////////////////////////////// 
			"                ________________________________________________                " +
			"               |        ____________        ____________        |               " +
			"               |     1.|"+save1.getPlayerName()+ "|    2.|"+save2.getPlayerName()+ "|       |               " +
			"               |       |____________|      |____________|       |               " +
			"               |        ____________        ____________        |               " +
			"               |     3.|"+save3.getPlayerName()+ "|    4.|    Back    |       |               " +
			"               |       |____________|      |____________|       |               " +
			"               |________________________________________________|               \n\n";
	}//////////////////////////////////////////////////////////////////////////////////////////////////////// changeMainOptions_Overwrite() End.

	public String displayPrompt()
	{return "Which file do you want to overwrite? ";}
}
