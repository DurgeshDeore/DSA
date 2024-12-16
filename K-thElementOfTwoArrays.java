//method = two pointers
//better approach
//for optimized use binary search
class Solution {
    public int kthElement(int a[], int b[], int k) {
        int i = 0, j = 0, cnt = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                cnt++;
                if (cnt == k) {
                    return a[i];
                }
                i++;
            } else {
                cnt++;
                if (cnt == k) {
                    return b[j];
                }
                j++;
            }
        }
        while (i < a.length) {
            cnt++;
            if (cnt == k) {
                return a[i];
            }
            i++;
        }
        while (j < b.length) {
            cnt++;
            if (cnt == k) {
                return b[j];
            }
            j++;
        }
        return -1;
    }
}
