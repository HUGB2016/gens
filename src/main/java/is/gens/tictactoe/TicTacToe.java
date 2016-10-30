package is.gens.tictactoe;
import java.util.*;

public class TicTacToe {
    public static void main(String[] args) {
		char[][] table = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
		
		Board board = new Board();    
		board.displayBoard(table);

		boolean row     = board.checkRowWinner(table);
		boolean column  = board.checkColWinner(table);
		boolean diagonal= board.checkDiogonalWinner(table);
		boolean isOver  = board.isOver(table);
		
		do {
			System.out.println("X Pick a number");
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();

			board.make_move(table, 'X', number);
			board.displayBoard(table);

			if((!(row) || !(column) || !(diagonal) || !(isOver)) && board.canMove(table)) {
				System.out.println("O Pick a number");
				Scanner scanner2 = new Scanner(System.in);
				int number2 = scanner.nextInt();
				
				board.make_move(table, 'O', number2);
				board.displayBoard(table);
			}
		} while((!(row) || !(column) || !(diagonal) || !(isOver)) && board.canMove(table));
    }
}
