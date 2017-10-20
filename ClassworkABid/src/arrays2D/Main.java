package arrays2D;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String[][] picture = new String[10][20];
		printPicture(picture);
	}
	private static void printPicture(String[][] picture) {
		// TODO Auto-generated method stub
		
	}
	private static void changeNeighbors(int[] arr, int i) {
		arr[i] += 1;
		try {
			arr[i-1] -= 1;
		}
		catch(ArrayIndexOutOfBoundsException e){
			
		}
		try {
			arr[i+1] -= 1;
		}
		catch(ArrayIndexOutOfBoundsException e){
			
		}
	}
}
