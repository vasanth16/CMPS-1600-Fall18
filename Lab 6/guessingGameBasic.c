//
// Created by Vasanth Rajasekaran on 11/3/18.
//

#include <stdio.h>
#include <stdbool.h>

int ask_in_range (int min , int max){
    int num = 0;
    bool inRange = false;
    printf("Please guess a number: ");
    scanf("%d", &num);



    while ( inRange == false){
        if (num >= min && num <= max){
            inRange = true;
        }
        else{
            printf( "Your number is outside of the [%d,%d]  Please enter a number: ", min,max);
            scanf("%d", &num);
        }
    }

    //printf("Your name is in the range, Thank you!");

    return num;

}


int guessingGame (int num, int rangemin, int rangemax){

    int counter = 1;
    bool equal = false;
    printf("Hello and welcome the game\n");
    printf("You need to guess a number between %d and %d \n", rangemin, rangemax);

    int check;


    while (equal == false){
        int check = ask_in_range(rangemin, rangemax);
        if (num == check){
            equal = true;
            printf("Good job! You took %d guesses", counter);
        }else if (num > check){
            printf("Too low \n");
        } else{
            printf("Too high\n");
        }

        counter += 1;
    }

    return num;

}

/*int main() {
    int min = 0;
    int max = 100;
    int num = 56;

    guessingGame(num, min, max);

    return 0;
}*/