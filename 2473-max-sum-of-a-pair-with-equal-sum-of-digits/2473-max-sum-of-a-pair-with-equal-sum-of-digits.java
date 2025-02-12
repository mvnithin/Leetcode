class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer>ls=new HashMap<>();
        int res=-1;
        for(int i:nums){
            int k=digitsum(i);
            if(ls.containsKey(k)){
                res=Math.max(res,ls.get(k)+i);
                ls.put(k,Math.max(ls.get(k),i));
            }
            else{
                ls.put(k,i);
            }
        }
        return res;
    }
    public int digitsum(int n){
        int s=0;
        while(n>0){
            s+=n%10;
            n=n/10;
        }
        return s;
    }
}