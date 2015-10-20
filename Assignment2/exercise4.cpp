/*Assignment 2 - Exercise 4 - Revisit
We can receive strings from the command line in C/C++ as the main function can be written in the form (ask me about this in Tuesday's lecture if I forget to mention it):

int main(int argc, char *argv[])

Use this ability to read in an array of strings from the command line and then print them out in reverse order – 
e.g. stringReverse The reverse side also has a reverse side should output: “side reverse a has also side reverse The”
*/
#include <iostream>
using namespace std;

int main(int argc, char *argv[]) {
	string sentence="";
	for (int i=1; i<argc;i++)
	{
		sentence.append(string(argv[i]).append(" "));
		
	}
	cout << sentence << endl;
	
    int len = 0;

    for (int i = 0; sentence[i] != '\0'; i++) {
        len++;
    }
    cout << len << endl;

    char reverse[len];
    int k = 0;

    for (int j = len - 1; j >= 0; j--) {
        reverse[k] = sentence[j];
        k++;
    }

    cout << reverse << endl;

    int words = 0;
    char str[len];


    for (int l = 0, last_l = 0; ; l++) {
        if (reverse[l] == ' ' || reverse[l] == '\0')
        {
            for (int m = l - 1; m >= last_l; m--) { 
                str[words] = reverse[m];            
                words++;                      
            }
            last_l = l + 1;                        
            str[words] = reverse[l];
            words++;
        }
        if (reverse[l] == '\0')
            break;
    }

    cout << str << endl;

    return 0;
}
