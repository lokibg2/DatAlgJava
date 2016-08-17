package com.codingthamizha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by Appoyy on 17/08/16.
 */
public class StringPermCheck {
    static BufferedReader br;
    static StringBuilder output;
    HashMap<Character, Integer> hm;


    public StringPermCheck() {
//         Initializing the Buffered Reader & output buffer
        br = new BufferedReader(new InputStreamReader(System.in));
        output = new StringBuilder();
        hm = new HashMap<>();
    }

    public boolean solve(String str1, String str2) {
//        If Strings are of unequal Length
        if(str1.length() != str2.length()){
            return false;
        }

//        Populate characters of str1 in hashmap like <char,frequency>
        for(int i = 0; i < str1.length(); i++){
            char c = str1.charAt(i);
            if(hm.containsKey(c)){
                hm.put(c, hm.get(c) + 1);
            }else{
//                Initial Insert
                hm.put(c, 1);
            }
        }

//        Iterate str2 to check if char occurences equals that of str1
        for(int i = 0; i < str2.length(); i++){
            char c = str2.charAt(i);
            if(!hm.containsKey(c) || hm.get(c) == 0){
               return false;
            }else{
                hm.put(c, hm.get(c) - 1);
            }
        }
        return true;
    }


    public static void main(String args[]) throws IOException {
        StringPermCheck spc = new StringPermCheck();
        String inputString1 = br.readLine();
        String inputString2 = br.readLine();
        System.out.println(spc.solve(inputString1.toLowerCase(), inputString2.toLowerCase() ));
    }
}
