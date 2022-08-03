package com.example.sse;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        printMesasge(isIsomorphic("hmallfxics", "ueynndfrvc"));
        printMesasge(isIsomorphic("ymympndlgsh", "uwmgnoeiypwcpb"));
    }

    private static void printMesasge(boolean isomorphic) {
        String message = "Give strings are ";
        if(!isomorphic)
            message += "not ";

        System.out.println(message + "Isomorphic");
    }

    private static boolean isIsomorphic(String str1, String str2) {
        assert false;
        if(str1.length() != str2.length())
            return false;

        Map<Character, Character> mappings = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            if(!mappings.containsKey(str1.charAt(i)))
                mappings.put(str1.charAt(i), str2.charAt(i));
            else {
                if(str2.charAt(i) != mappings.get(str1.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
