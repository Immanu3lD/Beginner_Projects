#include <stdio.h>

int mario(int);

int main(int argc, char **argv) {
    
    int row;

    printf("Height: ");
    scanf("%d", &row);

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