class Solution {
    public int minAddToMakeValid(String s) {
        int op=0;
        int imb=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                op++;
            }
            else if(op>0 && c==')'){
                op--;
            }
            else{
                imb++;
            }
        }
        return imb+op;
    }
}