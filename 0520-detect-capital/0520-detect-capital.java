class Solution {
    public boolean detectCapitalUse(String word) {
        int c1=0,c2=0;
        
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>=65 && word.charAt(i)<=90){
                c1++;
            }
            else if(word.charAt(i)>=97 && word.charAt(i)<=122){
                c2++;
            }
        }
        if(word.length()==c1 || word.length()==c2){
            return true;
        }
        else if(c1==1 && word.charAt(0)>='A'&&word.charAt(0)<='Z' ){
            return true;
        }
        return false;
    }
}