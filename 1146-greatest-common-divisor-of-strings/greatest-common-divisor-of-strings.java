class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!str1.startsWith(str2) && !str2.startsWith(str1)) 
        {
            return "";
        }
        String gcdStr = str1.substring(0, gcd(str1.length(), str2.length()));
        return str1.replace(gcdStr, "").isEmpty() && str2.replace(gcdStr, "").isEmpty() ? gcdStr : "";
    }
    private int gcd(int a, int b) 
    {
        while (b != 0) 
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}