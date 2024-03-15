
public class TokenPass {

	private int[] board;
	private int currentPlayer;
	
	public TokenPass(int playerCount) {
		board = new int [playerCount];
		for (int x = 0; x < board.length; x++) {
			board[x] = (int)(Math.random()*10 + 1);
			}//end for loop
		this.currentPlayer = (int)(Math.random()* playerCount-1);
	}//end one argument constructor
	
	public void distributeCurrentPlayerTokens() {
		int t = board[currentPlayer];
		board[currentPlayer] = 0;
		int condition = currentPlayer + 1;
		
		while (t > 0) {
			
			if (condition == board.length) {
				condition = 0;
				board[condition]++;
				t--;
				condition++;
			}//end if
		}//end while
	}//end method distribute
	
	public void turns() {
		currentPlayer++;
		if (currentPlayer >= board.length);
			currentPlayer = 0;
	}//end method turns
	
	public String winner() {
		int y = 0;
		int winner = 0;
		String output = " ";
		for (int x = 0; x < board.length; x++) {
			if (board[x] > y) {
				y = board[x];
			}//end if
		}//end for
		output = "The winner is Player " + (winner + 1);
		return output;
	}//end winner method
	
	public String toString() {
		String output = "";
			for (int x = 0; x < board.length; x++) {
				output += ("Player: " + (x+1) + " has " + board[x] + "Tokens");
				output += "\n";
			}//end for
		return output;
	}//end toString
}//end class
