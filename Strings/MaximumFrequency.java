//finding the maximum frequency character in a string


//METHOD 1 : USING NESTED LOOPS BRUTE FORCE APPROACH
//TIME COMPLEXITY : O(N^2)
package Strings;


public class MaximumFrequency {
    public static void main(String[] args) {
        String s = "abcdeab";
        int[] freq = new int[256];
        int maxfreq = 0;
        char ans = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;

            if (freq[ch] > maxfreq) {
                maxfreq = freq[ch];
                ans = ch;
            } else if (freq[ch] == maxfreq && ch > ans) {
                ans = ch;
            }
        }

        System.out.println(ans);
    }
}
