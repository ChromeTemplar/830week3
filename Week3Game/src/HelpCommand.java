import java.util.Scanner;

public class HelpCommand implements Commandable {
	public String help;

	public HelpCommand() { 
		help = "help";
		}
	
	int doMatch(String inout) {
		if (help.equalsIgnoreCase(input)) {
			return 1;
		} 
		
		return 0;
	}	

	void doCommand(String input) {
		//do stuff here
		// in this case, print out the help for the game
	}
	
}
	
	


