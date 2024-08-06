class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>ls=new HashMap<>();
        for(int i:nums){
            if(ls.containsKey(i)){
                int v=ls.get(i)+1;
                ls.put(i,v);
            }
            else{
                ls.put(i,1);
            }
        }
        for(int i:nums){
            if(ls.get(i)==1){
                return i;
            }
        }
        return -1;
    }
}