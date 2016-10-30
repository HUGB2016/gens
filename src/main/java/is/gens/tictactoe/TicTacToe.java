package is.gens.tictactoe;

import java.util.*;

public class TicTacToe {
    public static void main(String[] args) {
		char[][] table = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
		char player = 'X';
		Board board = new Board();    
		board.displayBoard(table);
		

		do {
			System.out.println("X Pick a number");
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();

			board.makeMove(table, 'X', number);
			board.displayBoard(table);


			if(board.canMove(table)) {
				System.out.println("O Pick a number");
				Scanner scanner2 = new Scanner(System.in);
				int number2 = scanner.nextInt();
				
				board.makeMove(table, 'O', number2);
				board.displayBoard(table);
				board.changePlayer(player);
				
			
			}
		} while(board.canMove(table));
    }

}
