/*Assignment 2 - Exercise 5 - Revisit
Design a class called DCUStudent that describes a DCU Student. The class should have states for a name, id number, programme (e.g. EE2) and one other state of your choosing. 
Add a suitable constructor and display() method.
*/
#include <iostream>
#include <string>
using namespace std;

class DCUStudent{

    private:
        int id;
        string name;
        string course;
        int age;

    public:
        DCUStudent(int, string, string, int);
        virtual void display();

};

DCUStudent::DCUStudent(int studID, string studName, string studCourse, int studAge){
    id = studID;
    name = studName;
    course = studCourse;
    age = studAge;
}
void DCUStudent::display(){

    cout << "The student's name is " << name << endl;
    cout << "The student's id is " << id << endl;
    cout << "The student's course is " << course << endl;
    cout << "The student's age is " << age << endl;
}

int main()
{
    DCUStudent robert = DCUStudent(12345, "Robert", "ECE2", 20);
    robert.display();
    return 0;
}
