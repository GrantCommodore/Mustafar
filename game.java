import java.util.Scanner;
public class game {
	public String player;
	public int attempts; 
	public String result; 
	public String score; 
		public String getPlayer() {
			Scanner is = new Scanner(System.in); 
			player = is.nextLine();
		}

		public int getAttempts() {
			Scanner at = new Scanner(System.in); 
			attempts = at.nextInt(); 
		}
}
}