class Solution {
    public static String caseSort(String s) {
        // Not Optimized
        // PriorityQueue<Character> upper = new PriorityQueue<>();
        // PriorityQueue<Character> lower = new PriorityQueue<>();
        // int[] flag = new int[s.length()];
        // int i=0;
        // for(char ch: s.toCharArray()){
        //     if(Character.isLowerCase(ch)){
        //         flag[i++] = 1;
        //         upper.add(ch);
        //     }else if(Character.isUpperCase(ch)){
        //         flag[i++] = -1;
        //         lower.add(ch);
        //     }
        // }
        // String res = "";
        // for (i = 0; i < s.length(); i++){
        //     if(flag[i] == 1){
        //         res += upper.poll();
        //     }else if(flag[i] == -1){
        //         res += lower.poll();
        //     }else{
        //         res += s.charAt(i);
        //     }
        // }
        // return res;
        //OPtimized
        int n = s.length(), i=0, j=0, k=0;
        StringBuilder res = new StringBuilder();
        char[] upr = new char[n];
        char[] low = new char[n];
        for(char ch: s.toCharArray()){
            if(Character.isLowerCase(ch)){
                upr[i++] = ch;
            }else if(Character.isUpperCase(ch)){
                low[j++] = ch;
            }
        }
        Arrays.sort(upr, 0, i);
        Arrays.sort(low, 0, j);
        i=0;
        j=0;
        for(char ch: s.toCharArray()){
            if(Character.isLowerCase(ch)){
                res.append(upr[i++]);
            }else if(Character.isUpperCase(ch)){
                res.append(low[j++]);
            }
        }
        return res.toString();
    }
}
