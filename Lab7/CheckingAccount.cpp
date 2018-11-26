//
// Created by Vasanth Rajasekaran on 11/25/18.
//

#include"CheckingAccount.h"
#include "BankAccount.h" // imports bank account and checking account definitions

void CheckingAccount::withdraw(double amount){
    BankAccount::withdraw(amount); // calls the super class withdraw
    transactionCount++; // adds to transaction count
}
void CheckingAccount::deposit(double amount){
    BankAccount::deposit(amount); // calls super deposit
    transactionCount++; // adds to transaction count
}
void CheckingAccount::deductFees (){
    double temp = getBalance() - (transactionCount * TRANSACTION_FEE); // gets the balance
    balance = temp; // sets it equal to balance
    transactionCount = 0; //sets transactions zero
}

CheckingAccount::CheckingAccount(string n, double b){ // constructor with name and balance passed in
    name = n;
    balance = b;
}
CheckingAccount::CheckingAccount() { // default constructor
    name = "";
    balance = 0;
};