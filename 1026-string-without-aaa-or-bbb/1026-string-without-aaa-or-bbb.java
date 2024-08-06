class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuffer r=new StringBuffer();
        while(a>0 && b>0){
            if(a>b){
                r.append("a");
                r.append("a");
                r.append("b");
                a-=2;
                b--;
            }
            else{
                if(a==b && a==1){
                    r.append("a");
                    r.append("b");
                    a--;
                    b--;
                    continue;
                }
                else{
                    r.append("a");
                    r.append("b");
                    r.append("b");
                    b-=2;
                    a--;
                }
            }
        }
        while(a>0){
            r.append("a");
            a--;
        }
        while(b>0){
            r.insert(0,"b");
            b--;
        }
        return r.toString();
    }
}