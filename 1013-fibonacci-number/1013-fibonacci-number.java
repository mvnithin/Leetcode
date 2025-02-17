class Solution {
    public int fib(int n) {
        int a=0,b=1;
        if(n<=1){
            return n;
        }
        for(int i=2;i<=n;i++){
            int sum=a+b;
            a=b;
            b=sum;
        }
        return b;
    }
}