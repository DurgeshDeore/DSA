class Solution {
    static String revStr(String s) {
        StringBuffer result = new StringBuffer(""); //for reduce space complexity
        for(int i=s.length()-1; i>=0; i--){ // add elements in reverse order
            result.append(s.charAt(i));
        }
        return result.toString(); //convert it into string
    }
}
