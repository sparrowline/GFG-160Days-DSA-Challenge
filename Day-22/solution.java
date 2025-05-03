import java.util.Arrays;

class HIndex {
    // Function to find hIndex
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n =citations.length;
        int h = 0;
        
        for(int i = 0;i< n ; i++){
            int papersWithAtleastCitation = n-i;
            if(citations[i]>= papersWithAtleastCitation){
                h = papersWithAtleastCitation;
                break;
            }
        }
        
        return h;
    }
}