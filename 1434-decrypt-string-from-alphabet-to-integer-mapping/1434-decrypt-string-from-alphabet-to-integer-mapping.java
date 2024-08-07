class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            int k=0;
            if(s.charAt(i)=='#'){
                k=Integer.parseInt(s.substring(i-2,i));
                i-=2;
            }
            else{
                int n=s.charAt(i)-'0';
                k=n;
            }
            int res=96+k;
            sb.append((char)res);
        }
        sb=sb.reverse();
        String res=sb.toString();
        return res;
    }
}