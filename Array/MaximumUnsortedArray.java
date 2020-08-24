// using O(n) space

public class Solution {
    public ArrayList<Integer> subUnsort(ArrayList<Integer> nums) {
        
                
    ArrayList<Integer> tmp = new ArrayList<>();
    for(Integer i:nums)
        tmp.add(i);
	Collections.sort(tmp);
	int n = nums.size();
	int low = 0;
	int high = n - 1;
	while (low < n && nums.get(low) == tmp.get(low)) {
		low++;
	}
	
	while (high >= low &&  nums.get(high) == tmp.get(high)) {
		high--;
	}
	
	ArrayList<Integer> ans = new ArrayList<>();
	
	if(high - low >= 0 ){
	    ans.add(low);
	    ans.add(high);
	    return ans;
	}else
	{
	    ans.add(-1);
	    return ans;
	}


        
    }
}


//O(1) space

public class Solution {
    public ArrayList<Integer> subUnsort(ArrayList<Integer> nums) {
        
                
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        boolean flag = false;
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < nums.get(i - 1))
                flag = true;
            if (flag)
                min = Math.min(min, nums.get(i));
        }
        flag = false;
        for (int i = nums.size() - 2; i >= 0; i--) {
            if (nums.get(i) > nums.get(i + 1))
                flag = true;
            if (flag)
                max = Math.max(max, nums.get(i));
        }
        int l, r;
        for (l = 0; l < nums.size(); l++) {
            if (min < nums.get(l))
                break;
        }
        for (r = nums.size() - 1; r >= 0; r--) {
            if (max > nums.get(r))
                break;
        }
   
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(r - l >= 0 ){
            ans.add(l);
            ans.add(r);
        }else
        {
            ans.add(-1);
        }

        return ans;
        
    }
}
