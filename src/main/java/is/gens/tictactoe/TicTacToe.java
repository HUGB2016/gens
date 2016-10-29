package is.gens.tictactoe;

public class TicTacToe {
    public static void main(String[] args) {
		char[][] table = new char[3][3];
		
		Board board = new Board();    
		board.displayBoard(table);
		
		System.out.println("Everything is working now... Finally!");
    }
}
