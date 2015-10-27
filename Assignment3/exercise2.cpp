/*Assignment 3 - Exercise 2
Write a function of the form bool hasOne(int) that when given a positive int, returns true if it contains a 1 digit. 
Note: use % to get the rightmost digit, and / to discard the rightmost digit. 
	hasOne(10) → true
	hasOne(22) → false
	hasOne(220) → false
*/
#include <iostream>
using namespace std;

bool hasOne(int num)
{
	while (num > -1){
		if (num == 0)
		{
			return false;
		}
		else if (num % 10 == 1)
		{
			return true;
		}
		else
		{
			cout << num;
			num = num / 10;
			hasOne(num); 
		}
	}
}
