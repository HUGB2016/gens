package is.gens.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoardTest {

    @Test
    public void displayEmptyBoard() {
		char[][] table = new char[3][3];
        Board board = new Board();
		
        assertEquals("Everything is gonna be okay!", board.displayBoard(table)); 
	}
}
