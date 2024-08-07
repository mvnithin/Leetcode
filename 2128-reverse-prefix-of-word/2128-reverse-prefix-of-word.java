class Solution {
    public String reversePrefix(String word, char ch) {
        int e=word.indexOf(ch);
        String r="";
        for(int i=e;i>=0;i--){
            r+=word.charAt(i);
        }
        for(int i=e+1;i<word.length();i++){
            r+=word.charAt(i);
        }
        return r;
    }
}