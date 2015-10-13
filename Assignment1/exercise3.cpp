/*Assignment 1 - Exercise 3
Given two int values, return their product. Unless the two values are the same, then return twice their product. e.g.
	productDouble(1, 2) → 2
	productDouble(3, 2) → 6
	productDouble(2, 2) → 8
*/
#include <iostream>
using namespace std;

int productDouble(int firstNum, int secondNum)
{
	int product = firstNum*secondNum;
	if (firstNum != secondNum)
	{
		return product;
	}
	else
	{
		return product*2;
	}
}

int main()
{
	cout << productDouble(1,2) << endl;
	cout << productDouble(3,2) << endl;
	cout << productDouble(2,2) << endl;

	return 0;
}
