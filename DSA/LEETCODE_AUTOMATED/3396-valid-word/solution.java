class Solution {
    public boolean isValid(String word) {
        int n = word.length();
        if(n < 3) return false;
        boolean isDigit=false, isVowel=false, isCons=false;
        for(char ch: word.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                isVowel = true;
            }else if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z')){
                isCons = true;
            }else if(ch>='0' && ch<='9'){
                isDigit =true;
            }else{
                return false;
            }
        }
        return (isVowel && isCons);
    }
}
