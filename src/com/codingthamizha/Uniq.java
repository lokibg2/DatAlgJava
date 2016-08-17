package com.codingthamizha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Appoyy on 17/08/16.
 */
public class Uniq {
    static BufferedReader br;
    static StringBuilder output;
    int bitVector = 0;


    public Uniq() {
//         Initializing the Buffered Reader & output buffer
        br = new BufferedReader(new InputStreamReader(System.in));
        output = new StringBuilder();
    }

    public boolean solve(String str) {
        if(str.length() == 0){
//            If String is null
            return false;
        }
        for(int i = 0; i < str.length(); i++){
//          Convert each char to a number from 0-25
            int value = str.charAt(i) - 'a';

//            Check if bit of the ith char is already set
            if((bitVector & 1 << value) > 0){
                return false;
            }

//            Set the bit for the ith char
            bitVector |= 1 << value;
        }
        return true;
    }


    public static void main(String args[]) throws IOException{
        Uniq u = new Uniq();
        String inputString = br.readLine();
        System.out.println(u.solve(inputString.toLowerCase()));
    }
}
