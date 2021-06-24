package tictactoe;

public class Matchfield {

	String[] field = {"1","2","3","4","5","6","7","8","9"};
	boolean turn = true;
	int turns = 8;
	
	public void printMatchfield() {
		
		System.out.println("Tic Tac Toe");
		System.out.println("-----------------------");
		turn();
		System.out.println("-----------------------");		
		System.out.println("----------------------");
		System.out.print("   |  "+ field[0] + "  |");
		System.out.print("  "+ field[1] + "  |");
		System.out.println("  "+ field[2] + "  |");
		System.out.println("----------------------");
		System.out.print("   |  "+ field[3] + "  |");
		System.out.print("  "+ field[4] + "  |");
		System.out.println("  "+ field[5] + "  |");
		System.out.println("----------------------");
		System.out.print("   |  "+ field[6] + "  |");
		System.out.print("  "+ field[7] + "  |");
		System.out.println("  "+ field[8] + "  |");
		System.out.println("----------------------");
		

	}
	
	public void setVal(int fieldnumber) {
		
		if(turn== true) {
			field[fieldnumber] = "X";
			System.out.println("Player 2 its your turn");
			turn = false;
		}
		else {
			field[fieldnumber] = "O";
			System.out.println("Player 1 its yout turn");
			turn = true;
		}
		printMatchfield();
		turns--;
	}
	
	public void turn() {
		if(turn) {
			System.out.println("Player 1 its your turn");
			turn = false;
		}
		else {
			System.out.println("Player 2 its yout turn");
			turn = true;
		}
	}
		
}
