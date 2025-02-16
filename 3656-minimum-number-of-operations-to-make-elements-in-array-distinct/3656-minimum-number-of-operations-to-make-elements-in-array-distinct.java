class Solution {
    public int minimumOperations(int[] nums) {
        HashMap<Integer,Integer>ls=new HashMap<>();
        int j=0;
        for(int i=nums.length-1;i>=0;i--){
            if(ls.containsKey(nums[i])){
                j=i+1;
                break;
            }
            ls.put(nums[i],i);
        }
        if(j%3==0)
            return j/3;
        return (j/3)+1;
    }
}