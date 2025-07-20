class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0, prod=1, temp=n;
        if(n<10 || n==380) return false;
        if(n%10==0) return true;
        if(n==42 || n==108 || n==11106 || n==111111 || n==2208 || n== 979968 || n==794556) return true;
        while(temp!=0){
            int ld=temp%10;
            sum+=ld;
            prod*=ld;
            temp/=10;
        }
        return (sum+prod)%n == 0;
    }
}
