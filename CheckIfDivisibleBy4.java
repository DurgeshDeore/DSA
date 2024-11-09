class Sol
{
    int divisibleBy4 (String N)
    {
        int len = N.length();
        int num=0;
        // if the number is greater then use only two digits for calculation
        if(len > 2){
            String subStr = N.substring(len-2,len);
            num = Integer.parseInt(subStr);
            return (num%4) == 0? 1: 0;
        }
        // for two digit number
        num = Integer.parseInt(N);
        return (num%4) == 0? 1: 0;
    }
}
