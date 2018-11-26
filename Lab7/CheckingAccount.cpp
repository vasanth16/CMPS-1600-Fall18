//
// Created by Vasanth Rajasekaran on 11/25/18.
//

#include"CheckingAccount.h"
#include "BankAccount.h"

void CheckingAccount::withdraw(double amount){
    BankAccount::withdraw(amount);
    transactionCount++;
}
void CheckingAccount::deposit(double amount){
    BankAccount::deposit(amount);
    transactionCount++;
}
void CheckingAccount::deductFees (){
    double temp = getBalance() - (transactionCount * TRANSACTION_FEE);
    balance = temp;
    transactionCount = 0;
}

CheckingAccount::CheckingAccount(string n, double b){
    name = n;
    balance = b;
}
CheckingAccount::CheckingAccount() {
    name = "";
    balance = 0;
};