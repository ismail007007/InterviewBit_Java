public class Solution {
    public ArrayList<Integer> nextPermutation(ArrayList<Integer> a) {
        
         
        int n = a.size();
	    int k = -1;
	    int l = 0;
	    // Initial Check
	    for (int i=0; i<n-1; i++) {
	        if (a.get(i) < a.get(i+1)) {
	            k = i;
	        }
	    }
	    
	    if (k == -1) {
	        Collections.sort(a);
	        return a;
	    }
	    
	    // Finding next permutation
	    for (int i=a.size()-1; i>k;i--) {
	        if (a.get(i) > a.get(k)) {
	            l = i;
	            break;
	        }
	    }
	    
	    // Swapping
	    int temp = a.get(l);
        a.set(l, a.get(k));
        a.set(k, temp);
        
        // Reverse the right part
        int j = k + 1;
        int last = n-1;
        while(j <= last){
            temp = a.get(j);
            a.set(j, a.get(last));
            a.set(last, temp);
            j++;
            last--;
        }
        
        return a;
    }
}
