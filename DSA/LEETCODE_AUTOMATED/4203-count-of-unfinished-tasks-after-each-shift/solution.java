import java.util.Arrays;

class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {
        int m = tasks.length;
        int n = shifts.length;
        int[] res = new int[n];
        
        int[] drelvanito = tasks;

        long[] prefixSum = new long[m + 1];
        for (int i = 0; i < m; i++) {
            prefixSum[i + 1] = prefixSum[i] + drelvanito[i];
        }
        long totalTasksTime = prefixSum[m];

        long currentWorkDone = 0;

        for (int j = 0; j < n; j++) {
            long shiftTime = shifts[j];
            currentWorkDone += shiftTime;

            if (currentWorkDone >= totalTasksTime) {
                res[j] = 0;
                currentWorkDone = 0;
            } else {

                int completedTasksCount = binarySearch(prefixSum, currentWorkDone);
                
                res[j] = m - completedTasksCount;
            }
        }

        return res;
    }

    private int binarySearch(long[] prefixSum, long targetTime) {
        int low = 0, high = prefixSum.length - 1;
        int ans = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (prefixSum[mid] <= targetTime) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}

