

public class App {

	public static void main(String[] args) throws Exception {
		System.out.println("Grid Games");
		// Prints the updated game
		printBoard(gameBoard());
		System.out.println();

		System.out.println(theeCOW());

	}

	// This is the game
	public static char[][] gameBoard() {
		// The current state of game
		char[][] game;

		// the writeBlock will update the game
		// this is the first and only one that clarifies gameBoard, the rest will update
		// with game

		// Game Code:
		game = writeBlock(SetGameBoard(9,9), 1, 0, 't');

		game = writeBlock(game, 0, 1, 't');

		game = writeBlockBoolean(game, 1, 1, 'd', true);

		game = reverseRow(game, 0);

		// Code ends here:
		return game;

	}

	// Create the game board
	public static char[][] SetGameBoard(int height, int length) {
		// uses height and width in * units
		char[][] gameboard = new char[length][height];
		// Nested for loop to create 2d grid
		for (int ii = 0; ii < gameboard.length; ii++) {
			for (int jj = 0; jj < gameboard[ii].length; jj++) {
				gameboard[ii][jj] = '*';
			}
		}
		return gameboard;
	}

	// prints value of board on console
	public static void printBoard(char arr[][]) {
		int nums = 0;
		for (int ii = 0; ii < arr.length; ii++) {
			for (int jj = 0; jj < arr[ii].length; jj++) {
				if (nums == arr[ii].length) {
					System.out.println();
					nums = 0;
				}
				System.out.print(" ");
				System.out.print(arr[ii][jj]);
				nums++;

			}
		}
	}

	// Changes a detail on the game and updates it
	public static char[][] writeBlock(char arr[][], int row, int col, char unit) {
		arr[row][col] = unit;

		return arr;
	}

	// Changes a detail on the game and updates it only if marked true by input
	public static char[][] writeBlockBoolean(char arr[][], int row, int col, char unit, boolean answer) {
		if (answer = true) {
			arr[row][col] = unit;
		}
		return arr;
	}

	// FIX!! Does not reverse char
	public static char[][] reverseRow(char arr[][], int row) {
		int nums = 0;
		final char[][] mems = arr;
		for (int i = 0; i < arr.length; i++) {
			nums++;
			arr[row][i] = mems[row][mems.length - nums];
		}
		return arr;
	}

	public static char[] theeCOW() {
		char cow[] = {'a','b','c','d','e','f'};
		char temp;
		int nums =0;
		//final char[] mems = cow;

		for (int i = 0; i < cow.length; i++) {
			temp = cow[i];
			nums++;
			//cow[i] = mems[mems.length - i-1];
			for(int j =0;i<cow.length;j++){
				cow[cow.length - nums] = temp;
			}
		}
		System.out.println(cow.length);
		return cow;
		
	
	
	}

}
