public class Solution {
    public ArrayList<Integer> getRow(int numRows) {
       
    
        ArrayList<ArrayList<Integer>> x  = new ArrayList<>(); 
        x.add(new ArrayList<>());
        x.get(0).add(1);
        
        if(numRows == 0)
            return x.get(0);
        
        
        
        for(int i=1;i<numRows+1;i++)
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

        return x.get(numRows);


    }
}
