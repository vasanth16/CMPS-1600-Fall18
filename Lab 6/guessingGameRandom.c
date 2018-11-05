//
// Created by Vasanth Rajasekaran on 11/3/18.
//



#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <time.h>
#include <ranlib.h>


int get_random(int rangemin, int rangemax){

    time_t t;
    // This generates a pseudo random number from

    int num;

    srand((unsigned) time(&t));

    if (rangemin < 0) {
        num = (rand() % (rangemax - rangemin)) + rangemin;
    }else{
        num = (rand() % (rangemax + rangemin)) - rangemin;
    }
    return num;

}



int rangeAsker (int min , int max){
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


int guessingGameRandom (int rangemin, int rangemax){

    char name[10];
    char presentscore[255];

    int counter = 1;
    int check;
    int num = get_random(rangemin, rangemax);
    bool equal = false;
    printf("Hello and welcome the game. Please enter your name: \n");
    scanf("%s",name);
    FILE *file = fopen("scores.txt","r");

    if (file == NULL){
        printf("Couldnt open file");
        return 0;
    }
    while (fgets(presentscore,255,file) != NULL){
        printf("%s", presentscore);
    }
    fclose(file);
    printf("You need to guess a number between %d and %d \n", rangemin, rangemax);

    while (equal == false){
        check = rangeAsker(rangemin, rangemax);
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

    file = fopen("scores.txt","w");
    fprintf(file, "%s guessed the correct number in %d tries \n", name, counter);
    fclose(file);

    return num;

}

int main (){
    int min = -500;
    int max = 500;
    guessingGameRandom(min, max);
}
