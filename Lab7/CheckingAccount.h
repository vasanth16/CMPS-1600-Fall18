//
// Created by Vasanth Rajasekaran on 11/25/18.
//

#ifndef LAB7_CHECKINGACCOUNT_H
#define LAB7_CHECKINGACCOUNT_H

#include "BankAccount.h"
#include <iostream>
#include <string>
#include <cstdlib>

class CheckingAccount:public BankAccount{
public:
    void withdraw(double amount);
    void deposit(double amount);
    void deductFees ();
    CheckingAccount();
    CheckingAccount(string n, double b);


private:
    int transactionCount = 0;
    static const int TRANSACTION_FEE = 3;

};

#endif //LAB7_CHECKINGACCOUNT_H
