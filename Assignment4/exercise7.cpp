/*Assignment 4 - Exercise 7
Given an array of length 1 or more of ints, write a function of the form int bigDiff(int[] array, int size); that returns the difference between the largest and smallest values in the array. For example:  
	bigDiff({10, 3, 5, 6},4) → 7
	bigDiff({7, 2, 10, 9},4) → 8
	bigDiff({2, 10, 7, 2},4) → 8
*/
#include <iostream>
using namespace std;
int bigDiff(int array[], int size){
    int temp = 0;
    for(int i = 0; i < size; i++){
        if (array[i] > temp){
            temp = array[i];
        }
    }
    int num = temp;
    for(int i = 0; i < size; i++){
        if (array[i] < temp){
            temp = array[i];
        }
    }
    return (num-temp);
}
int main(){
    int array[4] = {10, 3, 5, 6};
    cout << bigDiff(array, 4) << endl;
}
