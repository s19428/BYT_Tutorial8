
public class MoveSuggester {

	public int suggestMove(TicTacToe ticTacToe, char player) {
		for (int i = 0; i < 9; i++) {
			if (ticTacToe.board.charAt(i) == '-') {
				TicTacToe game = ticTacToe.makeMove(i, player);
				if (game.winner() == player)
					return i;
			}
		}
	
		for (int i = 0; i < 9; i++) {
			if (ticTacToe.board.charAt(i) == '-')
				return i;
		}
	
		return -1;
	}

}
