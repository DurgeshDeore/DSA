class Solution {
    public String[] shortestSubstrings(String[] arr) {
        // brute force
        int n = arr.length;
        String[] res = new String[n];
        Arrays.fill(res, "");

        for(int i=0; i<n; i++){
            int m = arr[i].length();
            for(int size = 1; size <= m; size++){
                for(int st=0; st+size <= m; st++){
                    boolean flag = true;
                    String sub = arr[i].substring(st, st+size);
                    for(int k=0; k<n; k++){
                        if(i == k) continue;
                        if(arr[k].contains(sub)){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        if(res[i].isEmpty() || sub.compareTo(res[i]) < 0){
                            res[i] = sub;
                        }
                    }
                }
                if(!res[i].isEmpty()) break;
            }
        }
    
        return res;
    }
}
