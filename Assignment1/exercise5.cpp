/*Assignment 1 - Exercise 5
Modify the function in Q4 to use pass-by-reference to pass a string that will be modified by the function of the form: void helloName(string s){} to the same form as in Q4 
(i.e. if the string contains “Derek”, it will contain “Hello Derek!” after the function call)
*/
#include <iostream>
using namespace std;

void helloName(string &s){
	s = "Hello " + s + "!\n";
}

int main()
{
	string s = "Derek";
	helloName(s);
	cout << s;

	return 0;
}
