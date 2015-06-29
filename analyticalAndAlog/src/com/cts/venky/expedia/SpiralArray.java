package com.cts.venky.expedia;

import java.util.Random;

public class SpiralArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stubfor
		/*
		 * call for Generating desired size of matrix you can change this code
		 * according to your need
		 */

		int matrixArray[][] = SpiralArray.desiredMatrix(8,8);
		System.out
				.println("*********************************output******************************************");
		printSpiral(matrixArray);

	}

	private static int[][] desiredMatrix( int row,int col) {

		int matrixArray[][] = new int[row][col];
		int x = 5;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrixArray[i][j] = x;
				x = x + 5;
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("  " + matrixArray[i][j]);
			}
			System.out.println();
		}
		return matrixArray;
	}

	private static void printSpiral(int[][] matrix) {
		if (matrix == null && matrix.length == 0)
			return;
		int rows = matrix.length;
		int cols = matrix[0].length;
		int TR = 0, BR = rows - 1, FC = 0, LC = cols - 1;
		/*
		 * TR--> Top Row Pointer
		 * BR--> BOttem Row Pointer
		 * FC--> First column Pointer 
		 * LC--> Last Coumn Poner
		 * 
		 * These variable helps to find out sub matrix each iteraion 
		 */
		String currDirection = Directions.LEFT;
		/*
		 * above Flag will keep track for  the direction in matrix  where  to navigate
		 */
		int myCounter = 1;
		while (myCounter <= rows * cols) {
			myCounter++;
			if (currDirection.equals(Directions.LEFT)) {
				for (int i = FC; i <= LC; i++) {
					System.out.print(matrix[TR][i] + " , ");
				}
				TR++;
				currDirection = Directions.DOWN;

			} else if (currDirection.equals(Directions.DOWN)) {

				for (int i = TR; i <= BR; i++) {
					System.out.print(matrix[i][LC] + " , ");
				}
				LC--;
				currDirection = Directions.RIGHT;

			} else if (currDirection.equals(Directions.RIGHT)) {
				for (int i = LC; i >= FC; i--) {
					System.out.print(matrix[BR][i] + " , ");
				}
				BR--;
				currDirection = Directions.UP;
			}

			else if (currDirection.equals(Directions.UP)) {

				for (int i = BR; i >= TR; i--) {
					System.out.print(matrix[i][FC] + " , ");
				}
				FC++;
				currDirection = Directions.LEFT;

			}
		}

	}
}

class Directions {
	public static final String LEFT = "LEFT";
	public static final String DOWN = "DOWN";
	public static final String RIGHT = "RIGHT";
	public static final String UP = "UP";

}
