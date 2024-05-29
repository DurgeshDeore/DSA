#include<stdio.h>
int i,j,k;
void hollowRectagle(int n,int m){ //hollow square
    printf("\n\nhollow square or rectangle\n");
    for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            if( i==0 || j==0 || i==n-1 || j==m-1){ //for boundry
                printf("* ");
            }else{
                printf("  ");
            }
        }
        printf("\n");
    }
}
void flipedPyramid(int n){ //filped or inverted 7 roatated hlaf-pyramid
    int space=n-1;
    printf("\n\nfilped or inverted 7 roatated hlaf-pyramid\n");
    for(i=0;i<n;i++){
        for(j=0;j<n-i;j++){//for space
            printf(" \t");
        }
        for(k=0;k<i+1;k++){
            printf("*\t");
        }
        printf("\n");
    }
}
void invertedPyramid(int n){
    printf("\n\nInverted Pyramid\n");
    for(i=0;i<n;i++){
        for(j=0;j<n-i;j++){
            printf("*\t");
        }
        printf("\n");
    }
}
void reverseInverted(int n){
    printf("\n\nfliped inverted or Reverese and Inveted tringle\n");
    for(i=0;i<n;i++){
        for(j=0;j<i+1;j++){
            printf("\t");
        }
        for(k=0;k<n-i;k++){
            printf("*\t");
        }
        printf("\n");
    }
}
void triangle(int n){
    printf("\n\nTringle\n");
    for(i=0;i<n;i++){
        for(j=0;j<(n-i)/2;j++){
            printf("\t");
        }
        for(k=0;k<i+1;k++){
            printf("*\t");
        }
        printf("\n");
    }
}
void invertedTringle(int n){
    printf("\n\nInverted Tringle\n");
    for(i=0;i<n;i++){
        for(k=0;k<i+1;k++){
            printf("\t");
        }
        for(j=0;j<2*(n-i)-1;j++){
            printf("*\t");
        }
        printf("\n");
    }
}
void floydTringle(int n){
    int cnt=1;
    printf("\n\nFloyd's Tringle\n");
    for(i=0;i<n;i++){
        for(j=0;j<i+1;j++){
            printf("%d\t",cnt); 
            cnt++;
        }
        printf("\n");
    }
}
void zeroOneTringle(int n){
    printf("\n\nZero One Tringle\n");
    for(i=0;i<n;i++){
        for(j=0;j<i+1;j++){
            if((i+j)%2==0){
                printf("1 ");
            }else{
                printf("0 ");
            }
        }
        printf("\n");
    }
}
void rhombus(int n){
    printf("\n\nRhombus Pattern\n");
    for(i=0;i<n;i++){
        for(j=0;j<n-i;j++){
            printf("\t");
        }
        for(k=0;k<n;k++){
            printf("*\t");
        }
        printf("\n");
    }
}
void hollowRhombus(int n){
    printf("\n\nHollow rhombus\n");
    for(i=0;i<n;i++){
        for(j=0;j<n-i;j++){
            printf("\t");
        }
        for(k=0;k<n;k++){
            if(i==0 || k==0 || i==n-1 || k==n-1){
                printf("*\t");
            }else{
                printf("\t");
            }
        }
        printf("\n");
    }
}
void halfDiamond(int n){
    printf("\n\nHalf Diamond pattern\n");
    for(i=0;i<(n/2)+1;i++){
        for(j=0;j<i+1;j++){
            printf("*\t");
        }
        printf("\n");
    }
    for(i=(n/2)-1;i<n;i++){
        for(j=0;j<n-i;j++){
            printf("*\t");
        }
        printf("\n");
    }
}
void diamond(int n){
    printf("\n\nDiamond\n");
    for(i=0;i<n;i++){
        for(k=0;k<(n-i);k++){
            printf("\t");
        }
        for(j=0;j<(i*2)-1;j++){
            printf("*\t");
        }
        printf("\n");
    }
    for(i=n;i>0;i--){
        for(k=0;k<(n-i);k++){
            printf("\t");
        }
        for(j=0;j<(i*2)-1;j++){
            printf("*\t");
        }
        printf("\n");
    }
}  
void butterfly(int n){
    printf("\n\nButter fly \n");
    for(i=0;i<n;i++){
        for(j=0;j<=i;j++){
            printf("*\t");
        }
        for(k=1;k<n-i-2;k++){
            printf("\t");
        }
        for(j=0;j<=i;j++){
            printf("*\t");
        }
        printf("\n");
    }
    /*for(i=1;i<n;i++){
        for(j=0;j<n-i;j++){
            printf("*\t");
        }
        for(k=0;k<i+1;k++){
            printf(" space ");
        }
        printf("\n");
    }*/
} 
void main(){
    hollowRectagle(4,5);
    flipedPyramid(5);
    invertedPyramid(6);
    reverseInverted(5);
    triangle(6);
    invertedTringle(5);
    floydTringle(6);
    zeroOneTringle(5);
    rhombus(5);
    hollowRhombus(4);
    halfDiamond(9);
    diamond(6);
    butterfly(10);
}