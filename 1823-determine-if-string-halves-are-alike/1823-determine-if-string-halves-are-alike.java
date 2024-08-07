class Solution {
    public boolean halvesAreAlike(String s) {
        int len=s.length()/2;
        String vw="aeiouAEIOU";
        int v1=0,v2=0;
        for(int i=0;i<len;i++){
            if(vw.indexOf(s.charAt(i))!=-1){
                v1++;
            }
        }
        System.out.println();
        for(int i=len;i<s.length();i++){
            
            if(vw.indexOf(s.charAt(i))!=-1){
                v2++;
            }
        }
        if(v1==v2)
            return true;
        return false;
    }
}