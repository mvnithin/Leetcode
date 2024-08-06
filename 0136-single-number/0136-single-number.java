class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);//[1,1,2,2,4]
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans^=nums[i];
            System.out.println(ans);
        }
        return ans;
    }
}