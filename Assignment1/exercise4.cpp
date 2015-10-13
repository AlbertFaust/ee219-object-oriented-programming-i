/*Assignment 1 - Exercise 4
Write a function of the form:  string helloName(string s) {}  that, when given a C++ string type name, e.g.
"Bob", returns a greeting of the form "Hello Bob!". e.g. 
	helloName("Bob") → "Hello Bob!"
	helloName("Alice") → "Hello Alice!"
	helloName("X") → "Hello X!"
*/
#include <iostream>
using namespace std;

string helloName(string s){
	return "Hello " + s + "!\n"; // function returns full string so it can be used with cout below
}

int main()
{
	cout << helloName("Bob");
	cout << helloName("Alice");
	cout << helloName("X");

	return 0;
}
