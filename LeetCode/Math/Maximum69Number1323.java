class Solution {
    public int maximum69Number (int num) {
        int i=-1;
        char[] chars = String.valueOf(num).toCharArray();
        for(int j=0; j<chars.length; j++){
            if(chars[j]=='6'){
                chars[j]='9';
                num = Integer.parseInt(new String(chars));
                return num;
            }
        }
        return num;
    }
}
