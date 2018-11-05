
#include <stdio.h>
#include <stdbool.h>
//#include <guessingGameBasic.c>
// Vasanth Rajasekaran
// CMPS 1600


/**
 *
 *The & symbol is used to get the address of a variable
 * The * symbol is used to declare that the variable is pointing towards the original declaration
 *
 */


int swap(int x, int y) {
    int temp;
    temp = x;
    x = y;
    y = temp;
    return y;
}


/*int* swap (int *x, int *y){
    int temp;
    temp = *x;

    *x = *y;
    *y = temp;

    return y;

}


int main (){
    int x = 5;
    int y = 10;


    //int* first = swap(&x,&y);
    int second = swap(x,y);

    printf("%d",second);
}*/



