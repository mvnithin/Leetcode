class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(i, j,nums);
                j++;
            }
        }
    }
    public static void swap(int a,int b,int[] nums){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}