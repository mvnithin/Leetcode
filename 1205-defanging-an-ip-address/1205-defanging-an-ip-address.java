class Solution {
    public String defangIPaddr(String address) {
        String r="";
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                r+="[.]";
            }
            else{
            r+=address.charAt(i);}
        }
        return r;
    }
}