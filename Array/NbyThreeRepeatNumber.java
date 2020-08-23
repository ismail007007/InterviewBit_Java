public class Solution {
    // DO NOT MODIFY THE LIST
    public int repeatedNumber(final List<Integer> a) {
        int size = a.size()/3;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        
        for(int i: a){
            hmap.put(i, hmap.getOrDefault(i,0)+1);
        }
        
        for(Map.Entry<Integer,Integer> e: hmap.entrySet())
        {
            if(e.getValue() > size)
                return e.getKey();
        }
        
        return -1;
        
    }
}
