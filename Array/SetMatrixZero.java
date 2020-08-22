// Approach one TIme limit exceed

public class Solution {
    public void setZeroes(ArrayList<ArrayList<Integer>> matrix) {
 
         // save index of elements which are zero  
        List<List<Integer>> index = new ArrayList<>();

        for(int i = 0; i < matrix.size(); i++ ){

            for(int j = 0; j < matrix.get(0).size(); j++)
            {
                if(matrix.get(i).get(j) == 0)
                {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(i);
                    tmp.add(j);
                    index.add(tmp);
                }

            }

        }

        for(List<Integer> x: index){
            for(Integer i = 0; i < matrix.size();i++)
            {
                matrix.get(i).set(x.get(1),0) ;
            }

            for(Integer j = 0; j < matrix.get(0).size();j++)
            {
                matrix.get(x.get(0)).set(j,0);
            }
        }
 
    }
}

// Approach 2

public class Solution {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
 
        int rows = a.size();
		int cols = a.get(0).size();
		boolean rowvisited[] = new boolean[a.size()];
		boolean colvisited[] = new boolean[a.get(0).size()];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (a.get(i).get(j) == 0) {
					rowvisited[i] = true;
					colvisited[j] = true;
				}
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (rowvisited[i] || colvisited[j]) a.get(i).set(j, 0);
			}
		}
 
    }
}
