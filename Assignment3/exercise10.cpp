/*Assignment 3 - Exercise 10
We can receive strings from the command line in C/C++ as the main function can be written in the form: 
int main(int argc, char *argv[])
Write a section of code that reads in a number of strings from the command line. It should use an array to store the frequencies of occurrence of each length of string and should output details as described in the following example execution and output. Execution: 
WordLengthDistribution the final exam will be based on the one lecture you missed and the one book you didnt read
Output: 
	There are 19 strings
	The number of strings with:
	Length 1 characters: 0
	Length 2 characters: 2
	Length 3 characters: 8
	Length 4 characters: 4
	Length 5 characters: 3
	Length 6 characters: 1
	Length 7 characters: 1
	Length 8 characters: 0
	Length 9 characters: 0
Note: Q10 was on an exam paper.
*/
#include <iostream>
#include <cstring>
using namespace std;

int main(int argc, char *argv[]){
	int length[10];
	for(int i = 0; i < 10; i++){
		length[i] = 0;
	}
	for(int i = 1; i < argc; i++){
		length[strlen(argv[i])] = length[strlen(argv[i])] + 1;
	}
	cout << "There are " << argc-1 << " strings" << endl;
	cout << "Number of strings with:" << endl;
	for(int i = 0; i < 10; i++){
		cout << "Length " << i << " characters: " << length[i] << endl;
	}
}
