class AreRotations {
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        
        if(s1.length() != s2.length()) return false;
        
       return kmpSearch(s2,s1+s1);
        
    }
    
    private static boolean kmpSearch(String pattern , String text){
        int [] lps = computeLps(pattern);
        int i=0, j= 0;
        
        while(i<text.length()){
            if(pattern.charAt(j)==text.charAt(i)){
                i++;j++;
                if(j == pattern.length()) return true;
            }else{
                if(j!= 0) j = lps[j-1];
                else i++;
            }
        }
        return false;
    }
    private static int [] computeLps(String pattern ){
        int []lps = new int[pattern.length()];
        int len = 0,i=1;
        
        while(i<pattern.length()){
            if(pattern.charAt(i) == pattern.charAt(len)){
                lps[i++] = ++len;
            } else {
                if(len != 0 ) len = lps[len-1];
                else lps[i++] = 0;
                
            }
        }
        return lps;
    }
    
}