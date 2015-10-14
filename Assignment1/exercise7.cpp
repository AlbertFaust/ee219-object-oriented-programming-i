/*Assignment 1 - Exercise 7
Take the quote by Martin Golding, which gives invaluable advice for new programmers: 

  “Always code as if the guy who ends up maintaining your code will be a violent psychopath who knows where you live.”

Use the C++ string functionality (see the table in my notes) to find and display the location of the occurrence of the word “you”.
Use the same set of functionality to replace the word “you” with “YOU” (note, be careful not to change the “your” in the quote).
*/
#include <iostream>
#include <cstring>
using namespace std;

int main()
{
	const char *ptr;
	char quote[] = "Always code as if the guy who ends up maintaining your code will be a violent psychopath who knows where you live.";

	ptr = strtok(quote, " ");

	while (ptr != NULL)
	{
		if(strcmp(ptr, "you") == 0)
		{
			ptr = "YOU";
		}
		cout << ptr << " ";
		ptr = strtok(NULL, " ");
	}
	cout << endl;

	return 0;
}
