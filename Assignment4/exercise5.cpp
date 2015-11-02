/*Assignment 4 - Exercise 5
Write a C++ function of the form string mirrorEnds(string), that when given a string, looks for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very beginning of the given string, and at the very end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab". 
	mirrorEnds("abXYZba") → "ab"
	mirrorEnds("abca") → "a"
	mirrorEnds("navan") → "navan"
*/
#include <iostream>
#include <string>
using namespace std;
void mirrorEnds(string s){
    int j = 0;
    for (int i = s.length()-1; i >= 0; i--){
        if (s[i] == s[j]){
            cout << s[j];
            j++;
        }
        else{
            return;
        }
    }
}
int main(){
        mirrorEnds("navan");
}
