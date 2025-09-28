package com.leetcode;

public class MergeStringAlternately {

    public String mergeStringAlternately(String str1, String str2) {
        StringBuilder merge = new StringBuilder();
        int maxLength = Math.max(str1.length(), str2.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < str1.length()) {
                merge.append(str1.charAt(i));
            }
            if (i < str2.length()) {
                merge.append(str2.charAt(i));
            }
        }
        return merge.toString();
    }

    public static void main(String[] args) {
        String str1 = "rishabh";
        String str2 = "singh";

        MergeStringAlternately msa = new MergeStringAlternately();
        String result = msa.mergeStringAlternately(str1, str2);

        System.out.println("Merged String: " + result);
    }
}
