package is.gens.tictactoe;

public class Board {
    
	public String displayBoard(char[][] table){
        for (int row = 0; row < 3; row ++)
            for (int col = 0; col < 3; col++)
                System.out.println(table[row][col]);
			
		return "Everything is gonna be okay!";
    }

    public boolean checkRowWinner(char table[][]) {
    	if((table[0][0] == 'X' || table [0][0] == 'O') && table[0][0] == table[0][1] && table[0][1] == table[0][2]) {
	        return true;	
	    }
	    else if((table [1][0] == 'X' || table[1][0] == 'O') && table[1][0] == table[1][1] && table[1][1] == table[1][2]) {
	        return true;	
	    }
	    else if((table [2][0] == 'X' || table [2][0] == 'O') && table[2][0] == table[2][1] && table[2][1] == table[2][2]) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
    }
}

