public class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String r="";
        String f=strs[0];
        String l=strs[strs.length-1];
        for(int i=0;i<f.length();i++){
            if(f.charAt(i)==l.charAt(i))
                r+=f.charAt(i);
            else
                break;
        }
        return r;
    }
}