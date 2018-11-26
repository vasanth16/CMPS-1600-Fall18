//
// Created by Vasanth Rajasekaran on 11/25/18.
//

#include <iostream>
#include <string>
#include "BankAccount.h" // imports the class definitions
#include <cstdlib>

using namespace std; // Makes things easier

string BankAccount:: getName()const{ // returns the string name
    return name;
}
double BankAccount:: getBalance() { // returns the current balance as a number
    return balance;
}

double BankAccount::deposit(double amount){ // adds the amount to balance
    balance += amount;
}

double BankAccount::withdraw (double amount){ // subtracts the amount from the balance
    balance -= amount;
}

void BankAccount::toString(){ // Prints out the account name and the balance
    cout << "Account " << getName() << "'s balance is: " << getBalance() << endl;
}

BankAccount::BankAccount():name(""),balance(0){} // if there are no parameters passed in

BankAccount::BankAccount(string  n, double balance):name(n),balance(balance){} // if name and balance are passed in to the object
