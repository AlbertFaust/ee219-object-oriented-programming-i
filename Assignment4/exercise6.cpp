/*Assignment 4 - Exercise 6
Write a C++ function of the form int wordsCount(string[], int, int), where the first int is the size of the string array and the second int is the length (in characters) of the strings we wish to count. 
So, given an array of strings, return the count of the number of strings with the given length.
	wordsCount({"a", "bb", "b", "ccc"}, 4, 1) → 2
	wordsCount({"a", "bb", "b", "ccc"}, 4, 3) → 1
	wordsCount({"a", "bb", "b", "ccc"}, 4, 4) → 0
*/
#include <iostream>
using namespace std;
int wordsCount(string array[], int size, int length){
    int cnt = 0;
    for(int i = 0; i < size; i++){
        if (array[i].length() == length){
            cnt++;
        }
    }
    return cnt;
}
int main(){
    string array[4] = {"a", "bb", "b", "ccc"};
    cout << wordsCount(array, 4, 1) << endl;
}
