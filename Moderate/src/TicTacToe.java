
public class TicTacToe {
	enum Piece{ EMPTY, RED,BLUE}
	Piece hasWon(Piece[][] board)
	{
		for(int i=0; i<board.length;i++)
		{
			if (haswinner(board[i][0],board[i][1],board[i][2]))
			{
				return board[i][0];
			}
			if (haswinner(board[0][i],board[1][i],board[2][i]))
			{
				return board[0][i];
			}
		}
		if (haswinner(board[2][0],board[1][1],board[0][2]))
		{
			return board[1][1];
		}
		if (haswinner(board[0][0],board[1][1],board[2][2]))
		{
			return board[0][0];
		}
		return Piece.EMPTY;
		
	}
	boolean haswinner(Piece p1,Piece p2, Piece p3)
	{
		return (p1==p2 && p2==p3);
	}

}
