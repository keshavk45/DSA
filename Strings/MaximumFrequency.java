//finding the maximum frequency character in a string


//METHOD 1 : USING NESTED LOOPS BRUTE FORCE APPROACH
//TIME COMPLEXITY : O(N^2)
// package Strings;


// public class MaximumFrequency {
//     public static void main(String[] args) {
//         String s = "abcdeab";
//         int[] freq = new int[256];
//         int maxfreq = 0;
//         char ans = s.charAt(0);

//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             freq[ch]++;

//             if (freq[ch] > maxfreq) {
//                 maxfreq = freq[ch];
//                 ans = ch;
//             } else if (freq[ch] == maxfreq && ch > ans) {
//                 ans = ch;
//             }
//         }

//         System.out.println(ans);
//     }
// }

//METHOD 2: USING SORTING
//TIME COMPLEXITY : O(NlogN)

// package Strings;

// import java.util.*;


// public class MaximumFrequency {
//     public static void main(String[] args) {
//         String s = "character";
//         int n = s.length();
//         int maxfreq = 0;
//         char ans = s.charAt(0);
//         char[] arr = s.toCharArray();
//         Arrays.sort(arr);
//         int i = 0; 
//         int j = 0;
//         while(j<n){
//             if(arr[i]==arr[j]){
//                 j++;
//             } else {
//                 int freq = j - i;
//                 if(freq > maxfreq){
//                     maxfreq = freq;
//                     ans = arr[i];
//                 }
//                 i = j;
//             }
//         }

//         //last sequence checking
//         int freq = j - i;
//         if(freq > maxfreq){
//             maxfreq = freq;
//             ans = arr[i];
//         }

//         System.out.println(ans);
//     }
// }


//METHOD 3: USING FREQUENCY ARRAY
//TIME COMPLEXITY : O(N)
// package Strings;


// public class MaximumFrequency {
//     public static void main(String[] args) {
//         String s = "character";
//         int n = s.length();
//         int[] freq = new int[26];
//         for(int i = 0 ; i<n ; i++){
//             char ch = s.charAt(i);
//             int idx = ch-97;
//             freq[idx]++;
//         }
//         int maxfreq = 0;
//         char ans = s.charAt(0);
//         for(int i = 0 ; i<26 ; i++){
//             if(freq[i]>maxfreq){
//                 maxfreq = freq[i];
//                 ans = (char)(i + 97);

//             }
//         }
//         System.out.println(ans);
        
// }
// }

