class AddBinary {
    public String addBinary(String s1, String s2) {
        // code here
        StringBuilder result = new StringBuilder();
        
        int i = s1.length()-1;
        int j = s2.length()-1;
        int carry =0;
        
        //loop through both the string from last
        while(i>=0 || j>=0 || carry >0){ // as you need to append the carry if its 1; 
            int bit1 = (i>=0) ? s1.charAt(i)-'0' : 0; //implementing java trich to convert char to digit
            int bit2 = (j>=0) ? s2.charAt(j)-'0' : 0;
            
            //sum it up
            int sum = bit1+bit2+carry;
            result.append(sum%2); // append the bit (0,1);
            carry = sum/2; // update the carry (0,1);
            
            i--; //move the bit from right to left
            j--;
          
        }
        
    //remove leading zeros if any;
        while(result.length()>1 && result.charAt(result.length()-1)=='0'){
            result.deleteCharAt(result.length()-1);
        }
        
        return result.reverse().toString();
    }
}