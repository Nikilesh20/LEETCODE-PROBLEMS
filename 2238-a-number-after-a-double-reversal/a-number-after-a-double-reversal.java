class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=num;
        int rev=0;
        for(int i=0;i<2;i++)
        {
            rev=0;
            while(temp!=0)
            {
                rev=rev*10+(temp%10);
                temp/=10;
            }
            temp=rev;
        }
        if(temp==num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}