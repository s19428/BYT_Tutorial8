
public class WinnerManager {

	private char noWinner = '-';
	
	public char winner(TicTacToe ticTacToe) {
		char winner = noWinner;
		winner = nextCheck(winner, checkForHorizontalWinner(ticTacToe));
		winner = nextCheck(winner, checkForVerticalWinner(ticTacToe));
		winner = nextCheck(winner, checkForDiagonalWinner(ticTacToe));
	
		return winner;
	}
	
	private char nextCheck(char winner, char check)
	{
		if(winner == noWinner)
			return check;
		return winner;
	}

	private char checkForDiagonalWinner(TicTacToe ticTacToe) {
		if (ticTacToe.board.charAt(0) != '-' && ticTacToe.board.charAt(4) == ticTacToe.board.charAt(0)
				&& ticTacToe.board.charAt(8) == ticTacToe.board.charAt(0))
			return ticTacToe.board.charAt(0);
		if (ticTacToe.board.charAt(2) != '-' && ticTacToe.board.charAt(4) == ticTacToe.board.charAt(2)
				&& ticTacToe.board.charAt(6) == ticTacToe.board.charAt(2))
			return ticTacToe.board.charAt(2);
		return noWinner;
	}

	private char checkForVerticalWinner(TicTacToe ticTacToe) {
		for (int i = 0; i < 3; ++i) {
			if (ticTacToe.board.charAt(i) != '-'
					&& ticTacToe.board.charAt(i + 3) == ticTacToe.board.charAt(i)
					&& ticTacToe.board.charAt(i + 6) == ticTacToe.board.charAt(i))
				return ticTacToe.board.charAt(i);
		}
		return noWinner;
	}

	private char checkForHorizontalWinner(TicTacToe ticTacToe) {
		for (int i = 0; i < 9; i += 3) {
			if (ticTacToe.board.charAt(i) != '-'
					&& ticTacToe.board.charAt(i + 1) == ticTacToe.board.charAt(i)
					&& ticTacToe.board.charAt(i + 2) == ticTacToe.board.charAt(i))
				return ticTacToe.board.charAt(i);
		}
		return noWinner;
	}

}