/*Assignment 3 - Exercise 9
Write a function of the form int factorial(int) that when passed a value of 1 or more, returns the factorial of n, which is n * (n-1) * (n-2) ... 1. 
Compute the result recursively by calling the factorial function itself (Do not use loops or pointers). 
	factorial(1) → 1
	factorial(2) → 2
	factorial(5) → 120
*/
#include <iostream>
using namespace std;

int factorial(int num)
{
	if(num <=1){
		return 1;
	}
	int answer = num*factorial(num-1);
	return answer;
}
