//method = freq[] arr
class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length() != s2.length()){ //if length are differrent the return false
            return false;
        }
        int n = s1.length();
        int a1[] = new int[26];
        int a2[] = new int[26];
        int indx1 = 0,indx2 = 0;
        for(int i=0; i<n;i++){ //for loop for counting elements & their frequency
            indx1 = s1.charAt(i)-97;
            indx2 = s2.charAt(i)-97;
            a1[indx1] += 1;
            a2[indx2] += 1;
        }
        for(int i=0; i<26  ;i++){ //for loop to check both array contains same elements or not
            if(a1[i] != a2[i]){
                return false; //return false if both contains defferent elements
            }
        }
        return true; 
    }
}
