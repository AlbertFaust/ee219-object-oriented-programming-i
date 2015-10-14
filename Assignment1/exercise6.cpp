/*Assignment 1 - Exercise 6
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. 
Return true if we are in trouble. e.g.
	monkeyTrouble(true, true) → true
	monkeyTrouble(false, false) → true
	monkeyTrouble(true, false) → false
You do not need to use classes for this question.
*/
#include <iostream>
using namespace std;

bool monkeyTrouble(bool aSmile, bool bSmile){
	if (aSmile == bSmile)
	{
		return true;
	}
	else
	{
		return false;
	}
}
int main()
{
// std::boolalpha displays booleans as true or false, removing '<< boolalpha' will print the answers as 1 for true and 0 for false.
	cout << boolalpha << monkeyTrouble(true, true) << endl;	
	cout << boolalpha << monkeyTrouble(false, false) << endl;
	cout << boolalpha << monkeyTrouble(true, false) << endl;

	return 0;
}
