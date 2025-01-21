class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>res=new ArrayList<>();
        StringBuilder st=new StringBuilder();
        backtrack(res,st,0,0,n);
        return res;
    }
    public static void backtrack(List<String>res,StringBuilder st,int op,int cl,int n){
        if(op==n && cl==n){
            res.add(st.toString());
            return;
        }
        if(op<n){
            st.append("(");
            backtrack(res,st,op+1,cl,n);
            st.deleteCharAt(st.length()-1);
        }
        if(cl<op){
            st.append(")");
            backtrack(res,st,op,cl+1,n);
            st.deleteCharAt(st.length()-1);
        }
    }
}