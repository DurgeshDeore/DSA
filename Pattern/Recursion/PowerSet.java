//print all subsequece
class Solution { 
    List<String> list = new ArrayList<>();
    public void helper(String s, String sub, int i){
        if(i >= s.length()){
            list.add(sub);
            return;
        }
        // list.add(sub);
        helper(s, sub+s.charAt(i), i+1);
        helper(s, sub, i+1);
    }
    public List<String> AllPossibleStrings(String s) {
        String sub = "";
        helper(s, sub, 0);
        Collections.sort(list);
        return list;
    }
}
