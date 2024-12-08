//method = nested loop 
//brute force 
//T (n^2)  S O(1)
public class ContInvertion {
    public static int cntInv(int arr[]){
        int cnt=0;
        for(int i=0;i< arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    cnt++;
                }
            }
        }
        return cnt;
    }   
    public static void main(String[] args) {
        int arr[] = {10,5,4,3,2};
        System.out.println(cntInv(arr));
    }
}
//note if all elements are in reveres form then the o/p will be n*n(n-1)/2
