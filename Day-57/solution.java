import java.util.HashSet;
import java.util.Set;

// User function Template for Java

class LongestUniqueSubstr {
    public int longestUniqueSubstr(String s) {
        // code here
        int n = s.length();
        int left = 0,right = 0;
        int maxLen = 0;
        Set<Character> seen = new HashSet<>();
        
        while(right<n){
            char current  = s.charAt(right);
            
            while(seen.contains(current)){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(current);
            maxLen = Math.max(maxLen,right-left+1);
            right++;
            
        }
        return maxLen;
        
    }
}