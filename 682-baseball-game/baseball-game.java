class Solution {
    public int calPoints(String[] operations) {
         int arr[]=new int[operations.length];
        int top=-1;
        for (int i=0;i<operations.length;i++) 
        {
            String op=operations[i];
            switch(op) 
            {
                case "C":
                    top--;
                    break;

                case "D":
                    arr[++top]=2*arr[top - 1];
                    break;

                case "+":
                    arr[++top]=arr[top - 1] + arr[top - 2];
                    break;

                default:
                    arr[++top]=Integer.parseInt(op);
                    break;
            }
        }
        int sum=0;
        for (int i=0;i<=top;i++) 
        {
            sum+=arr[i];
        }
        return sum;
    }
}