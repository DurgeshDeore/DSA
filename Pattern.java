public class Pattern{
    public static void rectangle(int n,int m){
        System.out.println("\n\nRectagle");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.printf("*\t");
            }
            System.out.println();
        }
    }
    public static void hollowRectangle(int n,int m){
        System.out.println("\n\nHollow Rectagle");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || i==n-1 || j==0 || j==m-1){
                    System.out.printf("*\t");
                }else{
                    System.out.printf("\t");
                }
            }
            System.out.println();
        }
    }
    public static void tringle(int n){
        System.out.println("\n\nTringle");
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.printf("*\t");
            }
            System.out.println();
        }
    }
    public static void invertedTringle(int n){
        System.out.println("\n\nInverted Tringle");
        for(int i=n;i>=0;i--){
            for(int j=0;j<i+1;j++){
                System.out.printf("*\t");
            }
            System.out.println();
        }
    }
    public static void rotatedTringle(int n){
        System.out.println("\n\nRotated Tringle");
        for(int i=0;i<n;i++){                         //print space
            for(int j=0;j<n-i;j++){
                System.out.printf("\t");
            }
            for(int k=0;k<i+1;k++){                    //print star
                System.out.printf("*\t");
            }
            System.out.println();
        }
    }
    public static void pascalTringle(int n){
        System.out.println("Pascal Tringle");
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                int no;
                if(j==0 || j==i){
                    no=1;
                    System.out.printf("%d\t",no);
                }else{
                    no=i-1;
                    System.out.printf("%d\t",no);
                }
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
         rectangle(5,6);
         hollowRectangle(5,6); //actual parmeter /arguments
         tringle(7);
         invertedTringle(7);
         rotatedTringle(7);
         pascalTringle(5);
    }
}
