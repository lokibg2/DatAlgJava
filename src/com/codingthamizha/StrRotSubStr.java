package com.codingthamizha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Appoyy on 18/08/16.
 */
public class StrRotSubStr {
    static BufferedReader br;
    static StringBuilder output;


    public StrRotSubStr() {
//         Initializing the Buffered Reader & output buffer
        br = new BufferedReader(new InputStreamReader(System.in));
        output = new StringBuilder();
    }

    public static void main(String args[]) throws IOException {
        StrRotSubStr srss = new StrRotSubStr();
        String inputString1 = br.readLine();
        String inputString2 = br.readLine();
        System.out.println(srss.solve(inputString1.toLowerCase(), inputString2.toLowerCase()));
    }

    public boolean solve(String str1, String str2) {
        if (str1.length() != str2.length() || str1.length() == 0) {
//            If Strings are of different length or null
            return false;
        }
        str1 += str1;
        return str1.indexOf(str2) != -1;
    }
}
