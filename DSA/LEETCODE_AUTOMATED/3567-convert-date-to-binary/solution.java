class Solution {
    public String convertDateToBinary(String date) {
        String[] temp = date.split("-");
        StringBuilder sb = new StringBuilder();
        for(String s: temp){
            if(sb.length()>0) sb.append("-");
            sb.append(Integer.toBinaryString(Integer.parseInt(s)));
        }
        return sb.toString();
    }
}
