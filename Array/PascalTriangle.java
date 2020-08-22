public class Solution {
    public ArrayList<ArrayList<Integer>> solve(int numRows) {
    
         ArrayList<ArrayList<Integer>> x  = new ArrayList<>(); 

        if(numRows == 0)
            return x;
        
        x.add(new ArrayList<>());
        x.get(0).add(1);
        
        for(int i=1;i<numRows;i++)
        {
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            
            ArrayList<Integer> prevRow = x.get(i-1);
            tmp.add(1);
            for(int j=1;j<i;j++)
            {
                tmp.add(prevRow.get(j-1) + prevRow.get(j));
            }
            
            tmp.add(1);
            
            x.add(tmp);
            
   
        }

        return x;
    }
}
