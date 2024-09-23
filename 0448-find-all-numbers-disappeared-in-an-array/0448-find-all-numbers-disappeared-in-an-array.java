class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] res=new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            res[nums[i]-1]=true;
        }
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!res[i]){
                ls.add(i+1);
            }
        }
        return ls;
    }
}