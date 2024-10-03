class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans=0;
        for(int i=0;i<words.length;i++){
            String s=words[i];
            int check=0;
            for(int j=0;j<s.length();j++){
                char ch=s.charAt(j);
                if(allowed.indexOf(ch)!=-1){
                    check=1;
                }
                else{
                    check=0;
                    break;
                }
            }
            if(check==1){
                ans++;
            }
        }
        return ans;
    }
}