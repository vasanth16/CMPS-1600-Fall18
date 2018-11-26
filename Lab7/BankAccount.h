//
// Created by Vasanth Rajasekaran on 11/25/18.
//

#ifndef LAB7_BANKACCOUNT_H
#define LAB7_BANKACCOUNT_H

#include <iostream>
#include <string>
#include <cstdlib>
using namespace std;

class BankAccount{
public:
    string getName()const; // gets the name
    double getBalance(); // returns the balance
    double deposit(double amount); // adds to balance
    double withdraw (double amount); // subtracts from balance
    void toString(); // prints out name and balance
    BankAccount(); // default constructor
    BankAccount(string name, double balance); // constructor with name and balance
protected:
    string name; // name which is a string
    double balance; // balance of account as a double

};
#endif //LAB7_BANKACCOUNT_H
