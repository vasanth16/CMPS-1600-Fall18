//
// Created by Vasanth Rajasekaran on 11/25/18.
//

#include "SavingsAccount.h"
#include "BankAccount.h"

void SavingsAccount::addInterest(){
    double interest = BankAccount::getBalance() * (interestRate/100);
    double temp = BankAccount::getBalance() + interest;
    balance = temp;
}

SavingsAccount::SavingsAccount(){
    name = "";
    balance=0;
    interestRate = 0;
};
SavingsAccount::SavingsAccount(string n, double b, double i){
    name = n;
    balance = b;
    interestRate = i;
};
