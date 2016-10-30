package is.gens.tictactoe;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	@Test
	public void checkWinnerRow() {

    	char[][] table = {{'X', 'X', 'X'}, {'4', '5', '6'}, {'7', '8', '9'}};
    	
    	Board board = new Board();
    	boolean check = board.checkRowWinner(table);

    	assertTrue(board.checkRowWinner(table));
	 }

	@Test
	public void checkXdoesnotwin() {

    	char[][] table = {{'X', '2', 'X'}, {'X', '5', '6'}, {'O', '8', '9'}};
    	
    	Board board = new Board();
    	boolean check = board.checkColWinner(table);

    	assertTrue(board.checkColWinner(table));
	 }
}
