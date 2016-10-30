package is.gens.tictactoe;

public class TicTacToe {
    public static void main(String[] args) {
		char[][] table = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
		
		Board board = new Board();    
		board.displayBoard(table);
    }
}
