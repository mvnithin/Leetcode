class Solution {
    public boolean wordPattern(String b, String a) {
        HashMap<Character,String>ls=new HashMap<>();
        String[] s=a.split(" ");
        if(b.length()!=s.length){
            return false;
        }
        for(int i=0;i<b.length();i++){
            if(!ls.containsKey(b.charAt(i))){
                if(ls.containsValue(s[i])){
                    return false;
                }
                ls.put(b.charAt(i),s[i]);
            }
            else if(!ls.get(b.charAt(i)).equals(s[i])){
                return false;
            }
        }
        return true;
    }
}