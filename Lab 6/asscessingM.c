//
// Created by Vasanth Rajasekaran on 11/4/18.
//


#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <math.h>


struct distance{

    float feet;
    float inches;
    double total;



};

struct distance* addDistance(struct distance *one, struct distance *two){
    float newFeetOne = one->feet * 12;
    float newFeetTwo = two->feet * 12;

    float answer = (newFeetOne + one->inches) + (newFeetTwo + two->inches);

    float feetOnly = floorf(answer/12);

    float extraInches =fmodf(answer,12);

    struct distance* ans;
    ans->feet = feetOnly;
    ans->inches = extraInches;

    return ans;

}

/*
int main (){

    struct distance * first = malloc(sizeof(struct distance));
    struct distance * second = malloc(sizeof(struct distance));

    printf("First distance\n ");
    printf("Enter Feet: ");
    scanf("%f",&first->feet);
    printf("Enter inches: ");
    scanf("%f", &first->inches);

    printf("Second distance\n ");
    printf("Enter Feet: ");
    scanf("%f",&second->feet);
    printf("Enter inches: ");
    scanf("%f", &second->inches);



    struct distance* total = addDistance(first,second);

    printf("Sum of distances: %f' - %f\"", total->feet, total->inches);



}*/