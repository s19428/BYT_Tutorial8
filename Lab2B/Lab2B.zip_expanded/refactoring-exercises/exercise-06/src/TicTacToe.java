public class TicTacToe {
	public StringBuffer board;

	public TicTacToe(String s) {
		board = new StringBuffer(s);
	}

	public TicTacToe(String s, int position, char player) {
		board = new StringBuffer(s);
		board.setCharAt(position, player);
	}

	private MoveSuggester moveSuggester = new MoveSuggester();
	private WinnerManager winnerManager = new WinnerManager();
	
	public int suggestMove(char player) {
		return moveSuggester.suggestMove(this, player);
	}

	public TicTacToe makeMove(int i, char player) {
		return new TicTacToe(board.toString(), i, player);
	}

	public char winner() {
		return winnerManager.winner(this);
	}
}
