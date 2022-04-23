package stringprocessing;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String s1 = "throw", s2 = "worth";
        int[] f1 = new int[26], f2 = new int[26];
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        for (char ch : chars1) {
            int index = ch - 'a';
            f1[index]++;
        }
        for (char ch : chars2) {
            int index = ch - 'a';
            f2[index]++;
        }

         System.out.println(Arrays.toString(f1));
         System.out.println(Arrays.toString(f2));
        //for (int i = 0; i <= 25; i++) {
            //if (f1[i] != f2[i]) {
             //   System.out.println("Not anagram");
              //  return;
           // }
       // }
       // System.out.println("Anagram");

    }
}
