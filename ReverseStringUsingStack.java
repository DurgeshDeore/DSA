class Solution {
    
    public String reverse(String S){
        if(S.length() == 1){ //for string having only one element
            return S;
        }
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder(""); //string buffer for reduce space complexity
        for(int i=0; i< S.length(); i++){
            st.push(S.charAt(i)); //push elements one by one
        }
        while(! st.isEmpty()){
            result.append(st.pop()); //append elemnets in results
        }
        return result.toString(); //typecast for string buffer to string
    }

}
