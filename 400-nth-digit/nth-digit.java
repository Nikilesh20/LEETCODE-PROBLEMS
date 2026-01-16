class Solution {
    public int findNthDigit(int n) {
        long length = 1;    
        long count = 9;     
        long start = 1;     
        while (n > length * count) 
        {
            n -= length * count; 
            length++;             
            count *= 10;          
            start *= 10;        
        }
        long num = start + (n - 1) / length; 
        String numStr = Long.toString(num); 
        int index = (int)((n - 1) % length); 
        return numStr.charAt(index) - '0'; 
    }
}