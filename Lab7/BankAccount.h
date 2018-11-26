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
    string getName()const;
    double getBalance();
    double deposit(double amount);
    double withdraw (double amount);
    void toString();
    BankAccount();
    BankAccount(string name, double balance);
protected:
    string name;
    double balance;

};
#endif //LAB7_BANKACCOUNT_H
