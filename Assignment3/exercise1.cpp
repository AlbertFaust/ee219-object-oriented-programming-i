/*Assignment 3 - Exercise 1 - Revisit
Write a function of the form: bool scoresDecreasing(int[], int) that when given an array of scores and the size of the array, returns true if each score is equal or less than the one before. The array will be length 2 or more. 
	scoresDecreasing({6, 5, 4, 3, 0}, 5) → true
	scoresDecreasing({1, 3, 2}, 3) → false
	scoresDecreasing({1, 1, 0}, 3) → true
*/
#include <iostream>
using namespace std;

bool scoresDecreasing(int scores[], int size){
	
	for (int i = 0; i < size; i++){
		if (scores[i] >= scores[i+1]){
			return true;
		}
		else
			return false;
	}
}
