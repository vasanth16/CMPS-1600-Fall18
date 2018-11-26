//
// Created by Vasanth Rajasekaran on 11/25/18.
//

#include <iostream>
#include <string>
#include "BankAccount.h"
#include <cstdlib>

using namespace std;
string BankAccount:: getName()const{
    return name;
}
double BankAccount:: getBalance() {
    return balance;
}

double BankAccount::deposit(double amount){
    balance += amount;
}

double BankAccount::withdraw (double amount){
    balance -= amount;
}

void BankAccount::toString(){
    cout << "Account " << getName() << "'s balance is: " << getBalance() << endl;
}

BankAccount::BankAccount():name(""),balance(0){}

BankAccount::BankAccount(string  n, double balance):name(n),balance(balance){}
