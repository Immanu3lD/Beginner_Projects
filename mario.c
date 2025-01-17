#include <stdio.h>

int mario(int);

int main() {
    
    int row;

    do{
    printf("Height: ");
    scanf("%d", &row);
    }while(row < 0);

    mario(row);

    return 0;
}

int mario(int n){

    for(int i=n; i>=1; i--){
        for(int j=1; j<i; j++){
            printf(" "); 
        }
        for(int k=i; k<=n; k++){
            printf("#");
        }
        printf("\n");
    }

    return 0;
}
