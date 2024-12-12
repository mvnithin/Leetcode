class Solution {
    public long pickGifts(int[] gifts, int k) {
        while(k>0){
            Arrays.sort(gifts);
            int max=gifts[gifts.length-1];
            gifts[gifts.length-1]=(int) Math.sqrt(max);
            //System.out.println(Arrays.toString(gifts));
            k--;
        }
        long ans=0;
        for(int i:gifts){
            ans+=i;
        }
        return ans;
    }
}