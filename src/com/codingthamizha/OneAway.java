package com.codingthamizha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Appoyy on 18/08/16.
 */
public class OneAway {
    static BufferedReader br;
    static StringBuilder output;

    public OneAway() {
//         Initializing the Buffered Reader & output buffer
        br = new BufferedReader(new InputStreamReader(System.in));
        output = new StringBuilder();
    }

    public static void main(String args[]) throws IOException {
        OneAway oa = new OneAway();
        String inputString1 = br.readLine();
        String inputString2 = br.readLine();
        System.out.println(oa.solve(inputString1.toLowerCase(), inputString2.toLowerCase()));
    }

    public boolean solve(String str1, String str2) {
        if (str1.length() == str2.length()) {
            return checkReplace(str1, str2);
        } else if (str1.length() - str2.length() == 1) {
            return checkInsDel(str1, str2);
        } else if (str1.length() - str2.length() == -1) {
            return checkInsDel(str2, str1);
        }
        return false;
    }

    private boolean checkReplace(String str1, String str2) {
        boolean flag = false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (flag) {
                    return false;
                }
                flag = true;
            }
        }
        return true;
    }

    private boolean checkInsDel(String str1, String str2) {
        for (int i = 0, j = 0; i < str1.length() && j < str2.length(); ) {
            if (str1.charAt(i) != str2.charAt(j)) {
                if (i != j) {
                    return false;
                }
                j++;
            } else {
                i++;
                j++;
            }
        }
        return true;
    }
}
