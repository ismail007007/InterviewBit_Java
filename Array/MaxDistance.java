// TIme limit exceed

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maximumGap(final List<Integer> A) {
        
        
        int max = 0;
        for(int i = 0; i < A.size();i++)
        {
            int j =A.size()-1;
            
            while(i<j){
            if(A.get(i) <= A.get(j))
            {   
                if(j-i > max)
                    max = j -i;
                break;
            }   
                j--;
                
            }
            
        }
        
        return max;
    }
}

// appraoch 2

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maximumGap(final List<Integer> A) {
      
        int n = A.size();
        int rightMax[] = new int[n];
        rightMax[n-1] = A.get(n-1);
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], A.get(i));
        }
        int i=0, j=0, max=0;
        while(i < n && j < n) {
            if(A.get(i) <= rightMax[j]) {
                max = Math.max(max, j-i);
                j++;
            }
            else {
                i++;
            }
        }
        return max;
    }
}
