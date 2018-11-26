//
// Created by Vasanth Rajasekaran on 11/25/18.
//

#ifndef LAB7_SAVINGSACCOUNT_H
#define LAB7_SAVINGSACCOUNT_H

#include "BankAccount.h"
#include <iostream>
#include <string>
#include <cstdlib>


class SavingsAccount:public BankAccount{
public:
    void addInterest();
    SavingsAccount();
    SavingsAccount(string name, double balance, double i);

private:
    double interestRate;
};


#endif //LAB7_SAVINGSACCOUNT_H
