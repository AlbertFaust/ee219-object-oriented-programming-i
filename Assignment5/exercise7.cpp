/*Assignment 5 - Exercise 7
Write a C++ program that reads an int  using cin and prints the set of its positive divisors and the total number of divisors if the integer read is nonnegative. Otherwise it  prints the message “No negative numbers!” For example:
	Enter a number: 12
	1 is a divisor!
	2 is a divisor!
	3 is a divisor!
	4 is a divisor!
	6 is a divisor!
	12 is a divisor!
	There are 6 divisors in total.
*/
#include <iostream>
using namespace std;

int main(){
	int a = 0;	
	cin >> a;
	
	int temp = 1;
	if(a < 1){
		cout << "No negative numbers" << endl;
	}
	while(temp <= a){
		if (a%temp == 0) {
			cout << temp << " is a divisor!" << endl;
		}
		temp++;
	}
}
