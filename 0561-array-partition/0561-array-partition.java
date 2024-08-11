class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int s1=0;
        int s2=0;
        for(int i=0;i<nums.length;i+=2){
            s1+=nums[i];
        }
        for(int i=1;i<nums.length;i+=2){
            s2+=nums[i];
        }
        return s1>s2?s2:s1;
    }
}