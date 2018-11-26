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
    void withdraw(double amount); // defines the withdraw and deposit again since transactions need to be added
    void deposit(double amount);
    void deductFees (); // substracts fees based on transactionCount and the fee number
    CheckingAccount(); // default and component constructors
    CheckingAccount(string n, double b);


private:
    int transactionCount = 0; // number of withdraws and deposits
    static const int TRANSACTION_FEE = 3; // the fee for each transaction which

};

#endif //LAB7_CHECKINGACCOUNT_H
