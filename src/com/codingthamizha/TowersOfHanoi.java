package com.codingthamizha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Appoyy on 17/08/16.
 */
public class TowersOfHanoi {
    BufferedReader br;
    static StringBuffer output;
    static int movesCount = 0;
    //     Standard disk numbers
    final static int a = 1, b = 2, c = 3;

    public TowersOfHanoi() {
//         Initializing the Buffered Reader & output buffer
        br = new BufferedReader(new InputStreamReader(System.in));
        output = new StringBuffer();
    }

    public void Solve(int n, int x, int y, int z) {
        if (n > 1) {
//            Solve the problem of moving n-1 disks from x to z using y
            Solve(n - 1, x, z, y);
//            Move disks from x to y
            makeMove(x, y);
//             Solve the problem of moving n-1 disks from z to y using x
            Solve(n - 1, z, y, x);
        } else if (n == 1) {
            makeMove(x, y);
        }
    }

    private void makeMove(int x, int y) {
        movesCount += 1;
        output.append("Move a disk from stand ");
        output.append(x);
        output.append(" to stand ");
        output.append(y);
        output.append("\n");
    }

    public int readInt() throws IOException {
//         Reads an Integer
        return Integer.parseInt(br.readLine());
    }

    public static void main(String ar[]) {
        TowersOfHanoi toh = new TowersOfHanoi();
        int numberOfDisks = 0;
        try {
//          Read the value of the number of disks
            numberOfDisks = toh.readInt();
        } catch (IOException ioe) {
            System.out.println("Invalid Input!");
        }
//         Solve the problem of moving n-1 disks from x to y using z
        toh.Solve(numberOfDisks, a, b, c);
        System.out.println(output.toString());
        System.out.println("Total Moves : " + movesCount);

    }
}
