// O(nlogn) Time and O(1) Space

public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        Collections.sort(A);
        int f  = 0;
        int i;
        for(i = A.size()-1; i >= 0; i--)
            {
                if(A.get(i) <= 0 )
                       break;
            }
      
        for(int j = i+1; j < A.size(); j++)
        {
            if(A.get(j) != ++f)
                  return f;
                  
        }

        return ++f;
    }
}


// O(n) Time approach

public class Solution {
    public int firstMissingPositive(ArrayList<Integer> nums) {
         for(int i = 0; i < nums.size();i++){
            if(nums.get(i) < 1)
                nums.set(i,  nums.size()+1);
        }
        
      
        for (int i = 0; i < nums.size(); i++) {
            int val = Math.abs(nums.get(i));  //for repeating number -3-1 index -4 outofbound
            if (val <=  nums.size()) {  
                if (nums.get(val - 1) > 0)
                   nums.set(val - 1, - nums.get(val - 1)) ;
            }
        }
        
        
        for(int i = 0; i < nums.size();i++){
            if(nums.get(i) > 0 )
                return i+1;
        }
        
        return  nums.size()+1;
               
    }
}