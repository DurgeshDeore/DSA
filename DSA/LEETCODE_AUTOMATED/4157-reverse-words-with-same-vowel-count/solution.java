class Solution {
    public int cntVWls(String s){
        int cnt =0;
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for(char c: s.toCharArray())
            if(set.contains(c)) cnt++;
        return cnt;   
    }
    public String rvrsStr(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        int prevCnt = cntVWls(arr[0]);
        for(int i=1; i<arr.length; i++){
            int curCnt = cntVWls(arr[i]);
            if(curCnt == prevCnt)
                arr[i] = rvrsStr(arr[i]);
            // prevCnt = curCnt;
        }
        return String.join(" ",arr);
    }
}
