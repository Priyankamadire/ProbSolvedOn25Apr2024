/*
Code
Testcase
Testcase
Test Result
14. Longest Common Prefix
Solved
Easy
Topics
Companies
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consistsofOnlylowercaseEnglishletters.*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
       String a = strs[0];
       String b = strs[strs.length-1];
       int i=0;
       while(i<a.length() && i<b.length()){
        if(a.charAt(i)==b.charAt(i)){
            i++;
        }
        else{
            break;
        }
       }   
       return a.substring(0,i);
    }
}
