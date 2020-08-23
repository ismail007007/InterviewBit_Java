// Approach 1

public class Solution {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> AllAntiDiagonals = new ArrayList<>();
        int n = A.size();
        for(int i = 0; i<= 2*(n-1); i++)
        {
            ArrayList<Integer> AntiDiagonal = new ArrayList<Integer>();
            for(int j = 0; j <= i; j++ ){
                int diff = i - j;
                
                if(j>=n || diff>=n)
                    continue;
                    
                AntiDiagonal.add(A.get(j).get(diff));
            }
            
            AllAntiDiagonals.add(AntiDiagonal);
        }
        
        return AllAntiDiagonals;
        
    }
}

//Approach 2 Simpler

ArrayList<ArrayList<Integer>> AntiDiagonals = new ArrayList<ArrayList<Integer>>();
	    for(int i = 0; i < a.size()*2-1; i++)
	        AntiDiagonals.add(new ArrayList<Integer>());
	        
	    for(int i = 0; i < a.size(); i++){
	        for(int j = 0; j < a.get(0).size(); j++){
	            AntiDiagonals.get(i+j).add(a.get(i).get(j));
	        }
	    }
	    
	    return AntiDiagonals;
	