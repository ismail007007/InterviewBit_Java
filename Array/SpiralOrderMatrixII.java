public class Solution {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i=0;i<A;i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>(Collections.nCopies(A, 0));
            ans.add(temp);
        }
    int T,B,L,R,dir;
    T=0;
    B=A-1;
    L=0;
    R=A-1;
    dir=0;
    int i, f = 1;
    
    while(T<=B && L<=R)
    {
        if(dir==0)
        {   
            ArrayList<Integer> tmp =  new ArrayList<>();
            for(i=L;i<=R;i++)
                ans.get(T).set(i,f++);/// = f++;
            T++;
            
        }
        else if(dir==1)
        {
            ArrayList<Integer> tmp =  new ArrayList<>();

            for(i=T;i<=B;i++)
                ans.get(i).set(R,f++);/// = f++;
            R--;
        }
        else if(dir==2)
        {
            ArrayList<Integer> tmp =  new ArrayList<>();

            for(i=R;i>=L;i--)
                ans.get(B).set(i,f++);/// = f++;
            B--;
            
        }
        else if(dir==3)
        {
            ArrayList<Integer> tmp =  new ArrayList<>();

            for(i=B;i>=T;i--)
                ans.get(i).set(L,f++);/// = f++;
            L++;
            
        }
        dir=(dir+1)%4;
    }
    return ans;
        
        
    }
}
