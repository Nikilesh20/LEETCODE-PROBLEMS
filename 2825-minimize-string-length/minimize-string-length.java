class Solution {
    public int minimizedStringLength(String s) {
        int n=s.length();
        String small="";
        for(int i=0;i<n;i++)
        {
            if (small.indexOf(s.charAt(i)) == -1)
                small += s.charAt(i);
            else
                continue;
        }
        int len=small.length();
        return len;
    }
}