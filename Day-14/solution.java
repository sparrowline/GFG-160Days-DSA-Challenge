class MyAtoi {
    public int myAtoi(String s) {
        // Your code here
        
        int n = s.length();
        int index = 0;
        int sign=1;
        int i=0;
        long result = 0;
        
        if( s==null || n==0 ) return 0;
        
        //1.skip leading whitespaces
       while(i<n && s.charAt(i)==' '){
            i++;
        }
        //2.check sign 
        if(i<n && (s.charAt(i)=='-' || s.charAt(i)=='+')){
            sign = (s.charAt(i)=='+') ? 1 : -1 ;
            i++;
        }
        
        //3.convert digits to number unter nondigit found;
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';
            result = result*10 +digit;
            
        //if out of range handle it
        
        if(sign ==1 && result >Integer.MAX_VALUE  ) return Integer.MAX_VALUE;
        if(sign ==-1 && result >(long)Integer.MAX_VALUE+1  ) return Integer.MIN_VALUE;
        i++;
        }
          return (int) (result * sign );
        }
        
    }
