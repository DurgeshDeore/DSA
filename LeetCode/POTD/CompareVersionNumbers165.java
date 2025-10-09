class Solution {
    public int compareVersion(String version1, String version2) {
        String v1[] = version1.split("\\.");
        String v2[] = version2.split("\\.");
        int len = Math.max(v1.length, v2.length), min = Math.min(v1.length, v2.length), i=0;
        while(i<len && i<min){
            int ver1 = Integer.parseInt(v1[i]), ver2 = Integer.parseInt(v2[i]);
            if(ver1 < ver2)
                return -1;
            else if(ver1 > ver2)
                return 1;
            i++;
        }
        while(i<len){
            if(i<v1.length){
                int ver1 = Integer.parseInt(v1[i]);
                if(ver1 != 0)
                    return 1;
            }else if(i<v2.length){
                int ver2 = Integer.parseInt(v2[i]);
                if(ver2 != 0)
                    return -1;
            }
            i++;
        }
        return 0;
    }
}
