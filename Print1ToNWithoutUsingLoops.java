//method =  recursion
class Solution{
    static void printTillN(int N){
        if(N == 1){
            System.out.print("1 ");
            return;
        }
        printTillN(N-1);
        System.out.print(N+" ");
    }
}
