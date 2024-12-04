class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i=0,j=0;
        if(str2.length()>str1.length()){
            return false;
        }
        while(i<str1.length() && j<str2.length()){
            char nxt=(char)(str1.charAt(i)+1);
            if((str1.charAt(i)==str2.charAt(j))||(nxt==str2.charAt(j))||(str1.charAt(i)=='z' && str2.charAt(j)=='a')){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return str2.length()==j;
    }
}