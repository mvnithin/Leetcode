class Solution {
    public String[] findWords(String[] words) {
       String f="qwertyuiop";
        String s="asdfghjkl";
        String t="zxcvbnm";
        ArrayList<String>ls=new ArrayList<>();
        for(int i=0;i< words.length;i++){
            int fn=0,sn=0,tn=0;
            System.out.println(words[i]);
            String temp=words[i];
            words[i]=words[i].toLowerCase();
            for (int j = 0; j < words[i].length(); j++) {
                if(f.indexOf(words[i].charAt(j))!=-1){
                    //System.out.println("f"+" "+words[i].charAt(j));
                    fn++;
                }
                else if(s.indexOf(words[i].charAt(j))!=-1){
                    //System.out.println("s"+" "+words[i].charAt(j));
                    sn++;
                }
                else if(t.indexOf(words[i].charAt(j))!=-1){
                    //System.out.println("t"+" "+words[i].charAt(j));
                    tn++;
                }
            }
            //System.out.println(fn);
            //System.out.println(sn);
            //System.out.println(tn);
            if(fn==words[i].length()){
                ls.add(temp);
            }
            else if(sn==words[i].length()){
                ls.add(temp);
            }
            else if(tn==words[i].length()){
                ls.add(temp);
            }
        }
        String[] result=new String[ls.size()];
        int index=0;
        for(String s1:ls){
            result[index]=s1;
            index++;
        }
        return result;
    }
}