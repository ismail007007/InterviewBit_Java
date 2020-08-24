// o(n) space
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findPerm(final String s, int B) {
        
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> permu = new ArrayList<>();
        
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'I')
            {
                stack.add(i+1);
                while(!stack.isEmpty())
                    permu.add(stack.pop());
            }
            else
                stack.add(i+1);
        }
        
        stack.add(s.length()+1);
        
        while(!stack.isEmpty())
            permu.add(stack.pop());
        
        return permu;
        
    }
}


// o(1) space

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    ArrayList<Integer> permu = new ArrayList<>();
    public void reverse(int i, int j){
        while(i<j){
            int temp = permu.get(i);
            permu.set(i, permu.get(j));
            permu.set(j, temp);
            i++;
            j--;
        }
    } 
    
    public ArrayList<Integer> findPerm(final String s, int B) {
        
        
        for(int i = 0; i<= s.length(); i++){
            permu.add(i+1);
        }
        
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == 'D')
            {
                
                for(int j = i+1; j<=s.length(); j++)
                {
                    if(j == s.length())
                    {
                        reverse(i, j);
                        i = s.length();
                        break;
                    }
                    if(s.charAt(j) == 'I')
                    {
                        reverse(i, j);
                        i= j+1;
                    }
                }
            }
        }
        
        return permu;
        
    }
}
