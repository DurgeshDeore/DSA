class Solution {
    public String capitalizeTitle(String title) {
        int n=title.length();
        StringBuilder res = new StringBuilder();
        String[] titles = title.split(" ");
        for(int i=0; i<titles.length; i++){
            StringBuilder t = new StringBuilder(titles[i].toLowerCase());
            if(t.length() > 2) t.setCharAt(0, Character.toUpperCase(t.charAt(0)));
            res.append(t);
            if(i != titles.length-1) res.append(" ");
        }
        return res.toString();
    }
}
