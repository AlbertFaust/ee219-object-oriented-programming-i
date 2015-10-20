/*Assignment 2 - Exercise 3 - Revisit
 Write a function of the form bool sum28(int[], int) that when given an array of ints and the array size, returns true if the sum of all the 2's in the array is exactly 8.
	sum28({2, 3, 2, 2, 4, 2},6) → true
	sum28({2, 3, 2, 2, 4, 2, 2},7) → false
	sum28({1, 2, 3, 4},4) → false
*/
#include <iostream>
using namespace std;

bool sum28(int nums[], int size)
{
    int count = 0;
    for(int i = 0; i < size; i++)
        {
            if(nums[i] == 2)
                {
                    count += 2;
                }
        }
    if(count == 8)
    {
        return true;
    }
    else
        return false;
}

int main()
{
   // int numss[6] = {2, 3, 2, 2, 4, 2};
   // int size = 6;
   // cout << boolalpha << sum28(nums, size) << endl;
    
    int nums[7] = {2, 3, 2, 2, 4, 2, 2};
    int size = 7;
    cout << boolalpha << sum28(nums, size) << endl;    
    
   // int nums[4] = {1, 2, 3, 4};
   // int size = 4;
   // cout << boolalpha << sum28(nums, size) << endl;    
}
