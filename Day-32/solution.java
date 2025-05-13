class KthElement {
    public int kthElement(int a[], int b[], int k) {
        // code here
        // Two pointer approach;
        int i = 0;
        int j = 0;
        int count = 0;
        int ans = 0;
        
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                ans = a[i];
                i++;
            }else{
                ans = b[j];
                j++;
            }
            count++;
            if(count==k) return ans;
        }
        
        //incase elements left in a[]
        
        while(i<a.length){
            ans = a[i];
            i++;
            count++;
            if(count==k) return ans;
        }
        
        //incase elements left in b[];
        
        while(j<b.length){
            ans = b[j];
            j++;
            count++;
            if(count == k) return ans;
        }
        
        return -1; // incase k is out of bound;
    }
}