package is.gens.tictactoe;

public class Board {
    
	public String displayBoard(char[][] table) {
        for (int row = 0; row < 3; row ++)
            for (int col = 0; col < 3; col++)
                System.out.println(table[row][col]);
			
		return "Everything is gonna be okay!";
    }
}
