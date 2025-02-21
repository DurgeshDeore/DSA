class Solution {
    public double average(int[] salary) {
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE, sum=0, n=salary.length;
        for(int sal: salary){
            min=Math.min(min,sal);
            max=Math.max(max,sal);
            sum+=sal;
        }
        return (double)(sum-(min+max))/(n-2);
    }
}
