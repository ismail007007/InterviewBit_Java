package com.DSA.array;

import java.util.ArrayList;

public class pascal {
    public static void main(String[] args){
        int A = 10;
        ArrayList<ArrayList<Integer>> pascal = new ArrayList<>();
//        if(A == 0)
//            return new ArrayList<Integer>(){{add(1);}};
        pascal.add(new ArrayList<Integer>(){{add(1);}});
        pascal.add(new ArrayList<Integer>(){{add(1); add(1);}});


        for(int i = 3; i<= A+1; i++){
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j =1; j<i-1;j++){
                row.add(pascal.get(i-1).get(j-1) + pascal.get(i-1).get(j)   );
            }
            row.add(1);
            pascal.add(row);

        }

        for(ArrayList<Integer> ss:pascal)
            System.out.println(ss);
    }
}
