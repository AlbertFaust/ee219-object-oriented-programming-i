/*Assignment 4 - Exercise 9
Modify Q8 to add methods that calculate and return the average, minimum and maximum of the array. 
Write the code in main() to test your methods.
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
        virtual float average();
        virtual float max();
        virtual float min();
 
};
ArrayMath::ArrayMath(float a[], int n){
    *array = a;
    num = n;
}
float ArrayMath::average(){
    float sum;
    for(int i = 0; i < num; i++){
        sum = sum + *array[0]+i;
    }
    return sum/num;
}
float ArrayMath::max(){
    int maxNum = 0;
    for(int i = 0; i < num; i++){
        if (*array[0]+i > maxNum){
            maxNum = *array[0]+i;
        }
    }
    return maxNum;
}
float ArrayMath::min(){
    int minNum = ArrayMath::max();
    for(int i = 0; i < num; i++){
        if (*array[0]+i < minNum){
            minNum = *array[0]+i;
        }
    }
    return minNum;
}
void ArrayMath::display(){
    for(int i = 0; i < num; i++){
        cout << *array[0]+i;
    }
    cout << endl;
}

int main()
{
    float a[] = {1, 2, 3, 4, 5};
    ArrayMath math(a, 5);
    math.display();
    cout << math.average() << endl;
    cout << math.max() << endl;
    cout << math.min() << endl;
}
