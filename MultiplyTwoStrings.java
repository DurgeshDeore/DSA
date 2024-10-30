class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        BigInteger n1 = new BigInteger(s1); //big int for handling large amount of int values
        BigInteger n2 = new BigInteger(s2);
        BigInteger ans = n1.multiply(n2); //use inbluit method insted of * operator
        return String.valueOf(ans); //type cast into string 
    }
}
