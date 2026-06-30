class Solution {
    public List<String> generateValidStrings(int n, int k) {
        List<String> res = new ArrayList<>();
        int limit = 1<<n;
        for(int indx=0; indx<limit; indx++){
            boolean flag = true;
            int cost = 0;
            String num = String.format("%" + n + "s",
                    Integer.toBinaryString(indx)).replace(' ', '0');
            for(int i=1; i<num.length(); i++){
                if(num.charAt(i) == '1') cost+=i;
                if(num.charAt(i) == '1' && (num.charAt(i) == num.charAt(i-1))){
                    flag = false;
                    break;
                } 
            }
            if(flag && cost <= k) res.add(num);
        }
        return res;
    }
}
