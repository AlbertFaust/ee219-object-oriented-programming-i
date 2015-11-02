/*Assignment 4 - Exercise 4
Using recursion only, write a C++ function of the form int count7s(int);that when passed a non-negative int n, returns the number of occurrences of the 7 digit; so, for example 717 yields 2. (no loops!).
	count7s(717)→2
	count7s(7)→1
	count7s(123) → 0
*/
#include <iostream>
using namespace std;
int count7s(int n){
    int cnt;
    if (n <= 0)
        return 0;
    else {
        if (n % 10 == 7)
            {
                return(1+count7s(n/10));
            }
        else{
            return(count7s(n/10));
        }
    }
}
int main(){
    cout << count7s(123) << endl;
}
