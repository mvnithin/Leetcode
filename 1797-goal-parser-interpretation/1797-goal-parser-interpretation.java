class Solution {
    public String interpret(String command) {
        String r="";
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                r+='G';
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                r+='o';
                i++;
            }
            else{
                r+='a';
                r+='l';
                i+=3;
            }
            System.out.println(r);
        }
        System.out.print(r);
        return r;
    }
}