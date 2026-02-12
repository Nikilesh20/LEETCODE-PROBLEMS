class Solution {
    public void reverseString(char[] s) {
        int left=0,right=s.length-1;
        while (left<right) 
        {
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
        // String str=new String(s);
        // String st="";
        // for (int i=str.length()-1;i>=0;i--) 
        // {
        //     st+=str.charAt(i);
        // }
        // for(int i=0;i<s.length;i++) 
        // {
        //     s[i]=st.charAt(i);
        // }
    }
}