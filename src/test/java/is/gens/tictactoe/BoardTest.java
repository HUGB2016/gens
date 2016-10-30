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

    	assertFalse(board.checkColWinner(table));
	 }

	 @Test
	public void checkDiagonal() {

    	char[][] table = {{'X', '2', '3'}, {'X', 'X', '6'}, {'X', '8', 'X'}};
    	
    	Board board = new Board();
    	boolean check = board.checkColWinner(table);

    	assertTrue(board.checkColWinner(table));
	 }
}
