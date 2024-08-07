class Solution {
    public String toLowerCase(String s) {
    char[] r=new char[s.length()];
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)>=65 && s.charAt(i)<=90){
            r[i]=Character.toLowerCase(s.charAt(i));
        }
        else{
            r[i]=s.charAt(i);
        }
      }
      //System.out.print(Arrays.toString(r));
      String res="";
      for(char c:r){
        res+=c;
      }
      System.out.print(res);
      return res;
    }
}