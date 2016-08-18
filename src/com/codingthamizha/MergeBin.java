package com.codingthamizha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Appoyy on 18/08/16.
 */
public class MergeBin {
    static BufferedReader br;
    static StringBuilder output;


    public MergeBin() {
//         Initializing the Buffered Reader & output buffer
        br = new BufferedReader(new InputStreamReader(System.in));
        output = new StringBuilder();
    }

    public static void main(String args[]) throws IOException {
        MergeBin srss = new MergeBin();
        String[] input = br.readLine().split(" ");

        System.out.println(srss.solve(Integer.parseInt(input[0]),
                Integer.parseInt(input[1]),
                Integer.parseInt(input[2]),
                Integer.parseInt(input[3])));


    }

    public int solve(int n, int m, int i, int j) {
        m = m << i;
        return n ^ m;
    }
}




