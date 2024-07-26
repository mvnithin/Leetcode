class Solution {
    public int majorityElement(int[] nums) {
        int m=0,s=0;
        for(int i:nums){
            if(s==0){
                m=i;
                s++;
            }else if(m==i){
                s++;
            }else if(m!=i){
                s--;
            }
        }
        return m;
    }
}