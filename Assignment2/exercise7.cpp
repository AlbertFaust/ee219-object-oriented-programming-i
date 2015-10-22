/*Assignment 2 - Exercise 7
Create a child class of DCUStudent called DCUUndergraduate, which has the additional property of an array of modules 
(use an array of strings – with a maximum of 10 modules permitted).
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

class DCUUndergraduate : public DCUStudent{

    private:
        string *modules[10];

    public:
        DCUUndergraduate(int studID, string studName, string studCourse, int studAge, string studModule[]):DCUStudent(studID, studName, studCourse, studAge)
	{
		*modules = studModule;
	}
};

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
    string modules[10] = {"EE100", "EE101", "EE102", "EE103", "EE104", "EE105", "EE106", "EE107", "EE108", "EE109"};
    DCUUndergraduate paul = DCUUndergraduate(123456, "Paul", "CE1", 19, modules);
    paul.display();
    return 0;
}
