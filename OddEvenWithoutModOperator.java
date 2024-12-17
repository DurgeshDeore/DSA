//method = filp the answer
//package extra;

public class OddEven {
    public static boolean isEvenOrOdd(int n){
        boolean ans = true;
        for(int i=0;i<=n; i++){ //T O(n)
            ans = (!ans);
        }
        return ans;
    }
    public static void main(String[] args) {
        if(isEvenOrOdd(2)){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
}
