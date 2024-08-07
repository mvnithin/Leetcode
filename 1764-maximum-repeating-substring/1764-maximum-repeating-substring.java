class Solution {
    public int maxRepeating(String sequence, String word) {
        StringBuilder sb=new StringBuilder();
        sb.append(word);
        int c=0;
        while(sequence.contains(sb)){
            c++;
            sb.append(word);
        }
        return c;
    }
}