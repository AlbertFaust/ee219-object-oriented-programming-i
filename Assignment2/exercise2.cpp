/*Assignment 2 - Exercise 2
Write a function of the form int countOdds(int[], int) that returns the number of odd numbered ints in a given array, when passed the array and the number of elements in the array. 
Remember the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
	countOdds({2, 1, 2, 3, 4},5) → 2
	countOdds({2, 2, 0},3) → 0
	countOdds({1, 3, 5},3) → 3
Please note: the example code is pseudo code and is illustrative - you should not pass values in this way.
*/
#include <iostream>
using namespace std;

int countOdds(int nums[], int size)
{
    int oddNums;
    for(int i = 0; i < size; i++)
    {
        if(nums[i] % 2 == 1)
        {
            oddNums++;
        }
    }
    return oddNums;
}

int main()
{
    int nums[5] = {1, 2, 3, 4, 5};
    int size = 5;
    cout <<  countOdds(nums, size) << endl;
}
