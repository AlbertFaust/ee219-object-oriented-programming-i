/*Assignment 2 - Exercise 1 - Revisit
Write a function of the form void square(float &), where the float value that is passed by reference to the function is squared. Demonstrate that the function works correctly.
*/
#include <iostream>
using namespace std;

void square(float &num){
    num = num*num;
}

int main()
{
    float num = 5.5;
    square(num);
    cout << num << endl;

    return 0;
}
