class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        int n2=part.length();
        for(int i=0;i<n;i++){
            sb.append(s.charAt(i));
            if(s.charAt(i)==part.charAt(n2-1)){
                int l1=sb.length()-1;
                int l2=n2-1;
                while((l1>=0 && l2>=0)&&(sb.charAt(l1)==part.charAt(l2))){
                    l1--;
                    l2--;
                }
                if(l2==-1){
                    sb.delete(sb.length()-n2,sb.length());
                }
            }
        }
        return sb.toString();
    }
}