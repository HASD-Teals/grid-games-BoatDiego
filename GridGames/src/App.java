
import java.awt.event.KeyListener;
import java.util.Scanner;
import java.util.Random;

public class App {

	public static void main(String[] args) throws Exception {
		System.out.println("Squid Game");
		// Prints the updated game
		printBoard(gameBoard());
		System.out.println();

	}

	// This is the game
	public static char[][] gameBoard() {
		// The current state of game
		char[][] game;

		// the writeBlock will update the game
		// this is the first and only one that clarifies gameBoard, the rest will update
		// with game

		// Game Code:
		game = writeBlock(SetGameBoard(9, 9, '*'), 1, 0, 't');

		game = writeBlock(game, 0, 1, 't');

		game = writeBlockBoolean(game, 1, 1, 'd', true);

		// char rows[] = tempp( 0, game);
		game = reverseRow(game, 0);
		game  = reverseCol(game, 0);

		// Code ends here:
		return game;

	}

	// Create the game board
	public static char[][] SetGameBoard(int height, int length, char symbol) {
		// uses height and width in * units
		char[][] gameboard = new char[length][height];
		// Nested for loop to create 2d grid
		for (int ii = 0; ii < gameboard.length; ii++) {
			for (int jj = 0; jj < gameboard[ii].length; jj++) {
				gameboard[ii][jj] = symbol;
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

	// this is a tempory method to store a value of the original game before any
	// changes, but this only uses rows
	public static char[] tempBeforeRow(int row, char arr[][]) {
		char[] rows = new char[arr.length];
		for (int jj = 0; jj < arr.length; jj++) {
			rows[jj] = arr[jj][row];

		}
		return rows;
	}
	public static char[] tempBeforeCol(int col, char arr[][]){
		char[] cols = new char [arr.length];
		for (int i = 0; i <arr.length;i++){
			cols[i] = arr[col][i];

		}
		return cols;

	}
	
	public static char[][] reverseRow(char arr[][], int row) {
		char rows[] = tempBeforeRow(0, arr);
		int nums = 0;
		for (int i = 0; i < arr.length; i++) {
			nums++;
			arr[row][i] = rows[rows.length - nums];
		}
		return arr;
	}

	public static char[][] reverseCol(char arr[][], int col){
		char cols[] = tempBeforeCol(0, arr);
		int nums = 0;
		for (int i = 0; i < arr.length; i++) {
			nums++;
			arr[i][col] = cols[cols.length - nums];
		}
		return arr;
	}


	}

