#include <stdio.h>

int pyramid(int);

int main(){

    int row;

    do{
        printf("Height: ");
        scanf("%d", &row);
    }while(row < 1 || row > 8);

    pyramid(row);

    return 0;
}

int pyramid(int n){

    for(int i=n; i>0; i--){
        for(int j=1; j<i; j++){
            printf(" ");
        }

        for(int k=i; k<=n; k++){
            printf("#");
        }

        for(int a=0; a<1; a++){
            printf(" ");
        }

        for(int x=i; x<=n; x++){
            printf("#");
        }

        printf("\n");
    }

    return 0;
}
