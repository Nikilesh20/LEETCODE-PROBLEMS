class Solution {
    public String addStrings(String num1, String num2) {
        return new java.math.BigInteger(num1).add(new java.math.BigInteger(num2)).toString();

    }
}