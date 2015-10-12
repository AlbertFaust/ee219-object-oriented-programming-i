/*Assignment 1 - Exercise 1
Write a program that displays "Hello World!" exactly 9 times, each time on a new line that is numbered with the current line number. Your code should be as concise as possible. The output  should be:
1. Hello World!
2. Hello World! ...
*/
#include <iostream>

int main()
{
	for(int i = 1; i < 10; i++)
	{
		std::cout << i << ". Hello World!\n";
	}
	return 0;
}

