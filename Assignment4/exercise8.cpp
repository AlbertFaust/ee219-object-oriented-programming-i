/*Assignment 4 - Exercise 8
Write a C++ class called ArrayMath that has an array of floats and the number of floats in the array as states of the class. Add a suitable constructor and display methods. Some notes:
	- Please declare your float array state so that it can hold a maximum of 100 elements
	- In the constructor you will have to copy the elements that you pass into your float array state.
*/
#include <iostream>
#include <string>
using namespace std;

class ArrayMath{

    private:
        float *array[100];
        int num;

    public:
        ArrayMath(float[], int);
        virtual void display();
 
};
ArrayMath::ArrayMath(float a[], int n){
    *array = a;
    num = n;
}

void ArrayMath::display(){
    for(int i = 0; i < num; i++){
        cout << *array[0]+i;
    }
}

int main()
{
    float a[] = {1, 2, 3, 4, 5};
    ArrayMath math(a, 5);
    math.display();
}
