class Solution {
    public int fib(int n) {
        int a=0,b=1;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=b;
            int c=a+b;
            a=b;
            b=c;
        }
        return sum;
    }
}