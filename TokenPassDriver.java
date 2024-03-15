
public class TokenPassDriver {
	public static void main (String[]args) {
		TokenPass one = new TokenPass(4); //player count of 4
		for (int x = 0; x < 40; x++) {
			one.distributeCurrentPlayerTokens();
			one.turns();
		}//end for
		System.out.println(one);
		System.out.println(one.winner());
	}//end main
}//end class
