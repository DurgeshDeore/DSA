//98.15%
class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";

        int n=num1.length(), m=num2.length();
        int[] res = new int[n+m];
        StringBuilder ans = new StringBuilder();

        for(int i=n-1; i>=0; i--){
            for(int j=m-1; j>=0; j--){
                int mul = (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
                int sum = mul + res[i+j+1];

                res[i+j] += sum/10;
                res[i+j+1] = sum%10;
            }
        }

        for(int num: res){
            if(!(ans.length()==0 && num==0)){
                ans.append(num);
            }
        }

        return ans.toString();
    }
}
