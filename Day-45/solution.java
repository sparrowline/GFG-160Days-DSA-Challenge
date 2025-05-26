import java.util.ArrayList;
import java.util.HashSet;

class IntersectionWithDuplicates {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // code here
        
        HashSet<Integer> setA = new HashSet();
        HashSet<Integer> resultSet = new HashSet();
        
        //add all unique elements of a in setA;
        for(int num : a){
            setA.add(num);
        }
        
        //check common elements of a in b;
        
        for(int num : b){
            if(setA.contains(num)){
                resultSet.add(num);
            }
        }
        
        return new ArrayList<>(resultSet);
    }
}