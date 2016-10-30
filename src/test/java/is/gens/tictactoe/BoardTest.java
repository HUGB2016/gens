package is.gens.tictactoe;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {


    @Test
    public void makeMoveTest() {

        char[][] table = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
        
        Board board = new Board();

        assertTrue(board.checkRowWinner(table));
     }

     @Test
     public void changePlayerTest() {
        Board board = new board();
        board.changePlayer("X");
        assertEquals("Value should be X","X", board.player);
     }


	@Test
	public void checkWinnerRow() {

    	char[][] table = {{'X', 'X', 'X'}, {'4', '5', '6'}, {'7', '8', '9'}};
    	
    	Board board = new Board();

    	assertTrue(board.checkRowWinner(table));
	 }

	@Test
	public void checkXdoesnotwin() {

    	char[][] table = {{'X', '2', 'X'}, {'X', '5', '6'}, {'O', '8', '9'}};
    	
    	Board board = new Board();

    	assertFalse(board.checkColWinner(table));
	 }

	@Test
	public void checkDiagonal() {

    	char[][] table = {{'X', '2', '3'}, {'X', 'X', '6'}, {'X', '8', 'X'}};
    	
    	Board board = new Board();

    	assertTrue(board.checkColWinner(table));
	 }

    @Test
    public void isOverTest() {
        char[][] table = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
        char[][] table1 = {{'X', 'O', 'X'}, {'O', 'X', 'O'}, {'7', 'X', '9'}};
        char[][] table2 = {{'X', 'O', 'X'}, {'O', 'X', 'O'}, {'X', 'O', 'X'}};

        Board board = new Board();
        
        assertFalse(board.isOver(table));
        assertFalse(board.isOver(table1));
        assertTrue(board.isOver(table2));
    }

    @Test 
    public void canMoveTest() {
        char[][] table = {{'O', 'X', 'X'}, {'X', 'X', 'O'}, {'O', 'O', 'X'}};
        
        Board board = new Board();

        assertFalse(board.canMove(table));
     }
}
