//
// Created by Vasanth Rajasekaran on 11/25/18.
//

#ifndef LAB7_SAVINGSACCOUNT_H
#define LAB7_SAVINGSACCOUNT_H

#include "BankAccount.h"
#include <iostream>
#include <string>
#include <cstdlib>


class SavingsAccount:public BankAccount{ // savings account class
public:
    void addInterest(); // adds interest
    SavingsAccount(); // default constructor
    SavingsAccount(string name, double balance, double i); // constructor with all the components

private:
    double interestRate; // interest rate which is unique to this class
};


#endif //LAB7_SAVINGSACCOUNT_H
