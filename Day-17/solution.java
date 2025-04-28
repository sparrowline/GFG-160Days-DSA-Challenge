import java.util.LinkedHashMap;
import java.util.Map;

class NonRepeatingChar {
    static char nonRepeatingChar(String s) {
        // code here
        LinkedHashMap<Character,Integer> freq = new LinkedHashMap();
        
        for(char ch : s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        
        for(Map.Entry<Character,Integer> entry : freq.entrySet()){
                  if (entry.getValue()==1){
                      return entry.getKey();
                      } 
            }
            return '$';
        }
    }
