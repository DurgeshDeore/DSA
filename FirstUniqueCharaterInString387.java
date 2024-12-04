//method = use in buit ds
//better apprroach
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        if(s.length()==0){
            return 0;
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1); //cnt occuracne
        }
        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i)) == 1){ //find unique one 
                return i; //return i
            }
        }
        return -1; //otherwise -1
    }
}
