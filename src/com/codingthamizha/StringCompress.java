package com.codingthamizha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Appoyy on 18/08/16.
 */
public class StringCompress {
    static BufferedReader br;
    static StringBuilder output;


    public StringCompress() {
//         Initializing the Buffered Reader & output buffer
        br = new BufferedReader(new InputStreamReader(System.in));
        output = new StringBuilder();
    }

    public static void main(String args[]) throws IOException {
        StringCompress sc = new StringCompress();
        String inputString = br.readLine();
        System.out.println(sc.solve(inputString.toLowerCase()));
    }

    public String solve(String str) {
        if (str.length() == 0) {
//            If String is null
            return "";
        }
        int cCount = 0;


        for (int i = 0; i < str.length(); i++) {
            cCount += 1;
            char c = str.charAt(i);
//            Make note of this weird condition buddy
            if (i + 1 >= str.length() || c != str.charAt(i + 1)) {
                output.append(c);
                output.append(Integer.toString(cCount));
                cCount = 0;
            }
        }

//        Compare size of string and compressed string b4 returning
        return output.toString().length() < str.length() ? output.toString() : str;
    }
}
