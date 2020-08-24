/*
Given [1, 2, 3, 4]

One possible answer : [2, 1, 4, 3]
Another possible answer : [4, 1, 3, 2]
 NOTE : If there are multiple answers possible, return the one thats lexicographically smallest.
So, in example case, you will return [2, 1, 4, 3] 
*/
//This approach gives [4,1,3,2]
public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        Collections.sort(A, (a,b)->  b-a);
        
        for(int i = 1 ; i < A.size();i++){
            Collections.reverse(A.subList(i, A.size()));
        }
        
        return A;
    }
}

//[2, 1, 4, 3] 
public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        Collections.sort(A);
        
        for(int i = 0 ; i < A.size();i+=2){
            
            if(i+1 != A.size()){
            int temp = A.get(i);
            A.set(i, A.get(i+1));
            A.set(i+1, temp);
            }
        }
        
        return A;
    }
}