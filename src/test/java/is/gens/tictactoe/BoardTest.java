package is.gens.tictactoe;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

    @Test
    public void displayEmptyBoard() {
		char[][] table = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
		
		Board board = new Board();
		
        assertEquals("Everything is gonna be okay!", board.displayBoard(table)); 
	}
	
	@Test
	public void checkWinnerRow() {

    	char[][] table = {{'X', 'X', 'X'}, {'4', '5', '6'}, {'7', '8', '9'}};
    	
    	Board board = new Board();
    	boolean check = board.checkRowWinner(table);

    	assertTrue(board.checkRowWinner(table));
	 }


}
