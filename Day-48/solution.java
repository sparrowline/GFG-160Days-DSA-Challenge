import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

class Anagrams {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        //LHM to store all preserv insertion order
        LinkedHashMap<String ,ArrayList<String>> map = new LinkedHashMap<>();
            
        for(String word :arr){
            char[] chars = word.toCharArray();
            Arrays.sort(chars); //to get base form of alphabets.
            String key = new String(chars);
            
            //checks if element is there if not it will add 
            map.computeIfAbsent(key, k->new ArrayList<>()).add(word);
        
        }
        return new ArrayList<>(map.values());
    }
}