class Solution {
    public String restoreString(String s, int[] indices) {
        char[] r=new char[s.length()];
        for(int i=0;i<indices.length;i++){
            r[indices[i]]=s.charAt(i);
        }
        System.out.print(Arrays.toString(r));
        String result=new String(r);
        return result;
    }
}