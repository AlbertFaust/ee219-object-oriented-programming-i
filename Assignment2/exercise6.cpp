/*Assignment 2 - Exercise 6
 Add multiple constructors to your class and test them from your main() function.
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
        DCUStudent(int);
        DCUStudent(int, string);
        DCUStudent(int, string, string);
        DCUStudent(int, string, string, int);
        virtual void display();

};

DCUStudent::DCUStudent(int studID){
    id = studID;
    name = "Undefined";
    course = "Undefined";
    age = 0;
}

DCUStudent::DCUStudent(int studID, string studName){
    id = studID;
    name = studName;
    course = "Undefined";
    age = 0;
}

DCUStudent::DCUStudent(int studID, string studName, string studCourse){
    id = studID;
    name = studName;
    course = studCourse;
    age = 0;
}

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
    DCUStudent james = DCUStudent(12346, "James", "CASE1");
    DCUStudent sarah = DCUStudent(12347, "Sarah");
    DCUStudent jose = DCUStudent(12348);
    robert.display();
    james.display();
    sarah.display();
    jose.display();
    return 0;
}
