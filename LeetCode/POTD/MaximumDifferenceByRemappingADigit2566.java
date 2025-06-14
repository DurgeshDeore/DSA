class Solution {
    public int minMaxDifference(int num) {
        String s = Integer.toString(num);
        char d = '.';
        for(char ch: s.toCharArray()) {
            if(ch != '9'){
                d = ch;
                break;
            }
        }
        String s1 = s.replace(d, '9');
        char ch2 = s.charAt(0);
        String s2 = s.replace(ch2, '0');
        int min = Integer.parseInt(s2);
        int max = Integer.parseInt(s1);
        return max - min;
    }
}
