class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0)
        {
            return false;
        }
        else
        {
            for(int i=1;i<=27;i++)
            {
                if(n%3!=0)
                {
                    break;
                }
                n/=3;
            }
            return n==1;
        }
    }
}