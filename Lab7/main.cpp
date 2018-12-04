#include <iostream>
#include <string>
#include <cstdlib>
using namespace std;


// Imports the class definitions
#include"CheckingAccount.h"
#include "SavingsAccount.h"
#include "BankAccount.h"

int main(){
    // the first main function
    BankAccount starter("Starter",0);
    BankAccount advanced("Advanced",500);

    starter.deposit(1000);
    advanced.withdraw(500);


    starter.withdraw(200);
    advanced.deposit(200);

    starter.toString();

    advanced.toString();
// the second main function
    SavingsAccount savings("Savings", 0,1);
    CheckingAccount checking("Checking",500);

    savings.deposit(1000);

    checking.withdraw(100);

    savings.withdraw(200);
    checking.deposit(200);

    savings.toString();
    checking.toString();

    savings.addInterest();
    checking.deductFees();

    savings.toString();
    checking.toString();
}