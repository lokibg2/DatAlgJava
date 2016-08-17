package com.codingthamizha;

import com.sun.xml.internal.bind.v2.TODO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Appoyy on 17/08/16.
 */
public class URLify {
    static BufferedReader br;
    static StringBuilder output;



    public URLify() {
//         Initializing the Buffered Reader & output buffer
        br = new BufferedReader(new InputStreamReader(System.in));
        output = new StringBuilder();
    }

    public void solve(char[] str) {
//        TODO
    }


    public static void main(String args[]) throws IOException {
        URLify ufy = new URLify();
        String inputString = br.readLine();
        char cInput[] = new char[100];
        cInput = inputString.toLowerCase().toCharArray();
        ufy.solve(cInput);
        System.out.println(new String(cInput));
    }
}
