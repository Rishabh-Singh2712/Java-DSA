package com.leetcode;

public class GSD {

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    public static void main(String args[]) {
    	String str1 = "ABCABCABC";
    	String str2 = "ABC";

        GSD gsd = new GSD();
        String result = gsd.gcdOfStrings(str1, str2);
        System.out.println("GCD of Strings: " + result);
    }
}
