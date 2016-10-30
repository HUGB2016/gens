package is.gens.tictactoe;

public class Board {
    
	public void displayBoard(char[][] table){
    	int rows_size = 3;
    	int column_size = 3;

    	if(table[0][0] != ' ')
    	{
		    System.out.println(table[0][0] + " | " + table[0][1] + " | " + table[0][2] );
    		System.out.println("---------");
		    System.out.println(table[1][0] + " | " + table[1][1] + " | " + table[1][2] );
		    System.out.println("---------");
		    System.out.println(table[2][0] + " | " + table[2][1] + " | " + table[2][2] );
    	}
	    else
	    {
	    	System.out.println("Empty board");
	    }
    }

   	public boolean canMove(char table[][]) {
	    for (int i = 0; i < 3; i++) {
	        for (int j = 0; j < 3; j++) {
	            if (table[i][j] != 'X' && table[i][j] != 'O')
	            {
	                return true;
	            }
	        }
	    }
	    return false;
	}

    public boolean checkRowWinner(char table[][]) {
    	if((table[0][0] == 'X' || table [0][0] == 'O') && table[0][0] == table[0][1] && table[0][1] == table[0][2]) {
	        return true;	
	    }
	    else if((table[1][0] == 'X' || table[1][0] == 'O') && table[1][0] == table[1][1] && table[1][1] == table[1][2]) {
	        return true;	
	    }
	    else if((table[2][0] == 'X' || table [2][0] == 'O') && table[2][0] == table[2][1] && table[2][1] == table[2][2]) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
    }
    public boolean checkColWinner(char table[][])  {   	
    	if((table[0][0] == 'X' || table [0][0] == 'O') && table[0][0] == table[1][0] && table[1][0] == table[2][0]) {
	        return true;	
	    }
	    else if((table[0][1] == 'X' || table[0][1] == 'O') && table[0][1] == table[1][1] && table[1][1] == table[2][1]) {
	        return true;	
	    }
	    else if((table[0][2] == 'X' || table [0][2] == 'O') && table[0][2] == table[1][2] && table[1][2] == table[2][2]) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
    }
    public boolean checkDiogonalWinner(char table[][])  {   	
    	if((table[0][0] == 'X' || table [0][0] == 'O') && table[0][0] == table[1][1] && table[1][1] == table[2][2]) {
	        return true;	
	    }
	    else if((table[0][2] == 'X' || table[0][2] == 'O') && table[0][2] == table[1][1] && table[1][1] == table[2][0]) {
	        return true;	
	    }
	   	else {
	    	return false;
	    } 
    }

    public boolean isOver(char table[][])
	{
		int counter = 0;
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(table[i][j] == 'X' || table[i][j] == 'O') {
					counter++;
				}
			}
		}
		if(counter == 9){
			return true;
		}
		else {
			return false;
		}
	}


}

