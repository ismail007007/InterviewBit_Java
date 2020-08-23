public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public String largestNumber(final List<Integer> nums) {
        
        String[] arr = new String[nums.size()];
        
        for(int i= 0; i< nums.size(); i++)
            arr[i] = String.valueOf(nums.get(i));
            
        Arrays.sort(arr, new Comparator<String>(){public int compare(String a, String b){return (b+a).compareTo(a+b);}});
        
        StringBuilder sb = new StringBuilder();
        
        for(String s:arr)
            sb.append(s);
            
        
        return sb.charAt(0) == '0'? "0":sb.toString();
            
        
    }
}
