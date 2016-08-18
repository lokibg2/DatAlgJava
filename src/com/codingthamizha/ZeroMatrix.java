package com.codingthamizha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by Appoyy on 18/08/16.
 */
public class ZeroMatrix {
    final static int N = 5;
    int[][] matrix;
    boolean isRowZero, isColZero;

    public ZeroMatrix() {
        matrix = new int[N][N];
        isRowZero = isColZero = false;
        Random rn = new Random();


//        Populate Matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = Math.abs(rn.nextInt() % 5);
            }
        }
    }

    public static void main(String args[]) throws IOException {
        ZeroMatrix zm = new ZeroMatrix();
        zm.printMatrix();
        zm.solve();

        System.out.println("Result : ");
        zm.printMatrix();

    }

    private void printMatrix() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void solve() {
//        Check if first row has a zero
        for (int i = 0; i < N; i++) {
            if (matrix[0][i] == 0) {
                isRowZero = true;
                break;
            }
        }

//        Check if first column has a zero
        for (int i = 0; i < N; i++) {
            if (matrix[i][0] == 0) {
                isColZero = true;
                break;
            }
        }

//        Check for zeroes in remaining rows and columns
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

//        Recheck first row to null a column
        for (int i = 1; i < N; i++) {
            if (matrix[0][i] == 0) {
                makeColZero(i);
            }
        }

//        Recheck first column to null a row
        for (int i = 1; i < N; i++) {
            if (matrix[i][0] == 0) {
                makeRowZero(i);
            }
        }


        if (isColZero) {
            makeColZero(0);
        }
        if (isRowZero) {
            makeRowZero(0);
        }
    }

    private void makeRowZero(int i) {
        for (int j = 0; j < N; j++) {
            matrix[i][j] = 0;
        }
    }

    private void makeColZero(int i) {
        for (int j = 0; j < N; j++) {
            matrix[j][i] = 0;
        }
    }
}
