#include <stdio.h>
#include <stdbool.h>

// Vasanth Rajasekaran
// CMPS 1600


int ask_in_range ( int min, int  max){
    int num;
    bool inRange = false;
    printf("Please enter a number: ");
    scanf(num);



    while ( inRange == false){
        if (num >= min && num <= max){
            inRange = true;
        }
        else{
            printf("Please enter a number: ");
            scanf(num);
        }
    }


    printf("Thank you!");

    return num;



}


int main() {
    int min = 1;
    int max = 10;
    printf(ask_in_range(min, max));
    return 0;
}