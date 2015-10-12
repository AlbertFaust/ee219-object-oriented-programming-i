/*Assignment 1 - Exercise 2
Write a program that displays the sequence 1, 2, 4, 8, 16, 32, 64 etc. to the maximum signed integer range possible – please try to determine this automatically. (Hint: the maximum on my machine is 1073741824 – think about why) 
*/
#include <iostream>
using namespace std;

int main()
{
	int i = 1;
	while(i > 0)
	{
		cout << i;
		i = i*2;
		if(i > 0)
		{
			cout << ", ";
		}
	}
	cout << endl;
}
/*Following the sequence 1,2,4,8,16 etc. the maximum signed integer possible on my machine was 1073741824. 
This is because the range of a 32 bit signed integer is -2^31 to 2^31-1 so the highest positive value the int can have is 2147483647(2^31-1). 
This means that the highest power of 2 I can get is 1073741824 (2^30) as 2^31 is greater than 2147483647 by 1 and will give a negative result.*/
