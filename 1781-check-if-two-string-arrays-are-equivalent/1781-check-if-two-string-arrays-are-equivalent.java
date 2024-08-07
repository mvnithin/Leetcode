class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(String i:word1){
            sb.append(i);
        }
        for(String i:word2){
            sb2.append(i);
        }
        return sb.toString().equals(sb2.toString());
    }
}