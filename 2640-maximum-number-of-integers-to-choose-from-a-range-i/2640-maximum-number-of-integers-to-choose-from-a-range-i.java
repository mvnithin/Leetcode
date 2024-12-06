class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer>ls=new HashSet<>();
        for(int i:banned){
            ls.add(i);
        }
        int sum=0,count=0;
        for(int i=1;i<=n;i++){
            if(ls.contains(i)){
                continue;
            }
            if((sum+i)<=maxSum){
                 sum+=i;
                count++;
            }
            else{
                break;
             }
        }
        return count;
    }
}