class Solution {
    public void rotate(int[] nums, int k) {
        if(k>nums.length){
            k=k%nums.length;
        }
        int n=nums.length;
        reverse(0,n-1,nums); //7654321
        reverse(0,k-1,nums); //5674321
        reverse(k,n-1,nums);//5671234
    }
    public  static void reverse(int s,int e,int[] nums){
        while(s<e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
}