class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>ls=new HashMap<>();
        ls.put(0,1);
        int sum=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(ls.containsKey(sum-k)){
                c+=ls.get(sum-k);
            }
            ls.put(sum,ls.getOrDefault(sum,0)+1);
        }
        return c;
    }
}