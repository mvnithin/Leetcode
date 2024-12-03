class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder r=new StringBuilder();
        int f=0;
        int index=0;
        //int pt2=spaces[index];
        while(f<s.length()){
            
            if(index<spaces.length && f==spaces[index]){
                r.append(' ');
                r.append(s.charAt(f));
                f++;
                index++;
            }
            else{
                r.append(s.charAt(f));
                f++;
            }
        }
        return r.toString();
    }
}