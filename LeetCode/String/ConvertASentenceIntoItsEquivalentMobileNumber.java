class Solution {
    String printSequence(String S) {
        String str[] = { "2",    "22",  "222", "3",   "33", "333",
                "4",    "44",  "444", "5",   "55", "555",
                "6",    "66",  "666", "7",   "77", "777",
                "7777", "8",   "88",  "888", "9",  "99",
                "999",  "9999" };
        StringBuilder res = new StringBuilder();
        for(char ch: S.toCharArray()){
            if(ch == ' '){
                res.append("0");
            }else{
                int pos=ch-'A';
                res.append(str[pos]);
            }
        }
        return res.toString();
    }
}
