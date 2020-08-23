//HashMap 

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int repeatedNumber(final List<Integer> A) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        
        for(int  i =0; i< A.size() ; i++)
        {
            hmap.put(A.get(i),hmap.getOrDefault(A.get(i),0)+1);
        }
        
         Integer key= -1;
          for (Map.Entry<Integer,Integer> mapElement : hmap.entrySet()) { 
           if(mapElement.getValue() > 1)
                key = mapElement.getKey();
            
          }
          
          return key;
        
    }
}

//Using set

public class Solution {
    // DO NOT MODIFY THE LIST
    public int repeatedNumber(final List<Integer> a) {
        Set<Integer> set = new HashSet<Integer>();
        for(int num : a){
            if(set.contains(num)){
                return num;
            } else {
                set.add(num);
            }
        }
        return a.size()+1;
    }
} 