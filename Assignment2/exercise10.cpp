/*Assignment 2 - Exercise 10 - Revisit
Create a DCUStudent pointer in main(), point it at a DCUStudent object and call the display() function. 
Point the same DCUStudent pointer at a DCUUndergraduate Student object and describe what happens when you call display() again.
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
        ~DCUStudent();
        virtual void display();

};

DCUStudent::DCUStudent(int studID){
    id = studID;
    name = "Undefined";
    course = "Undefined";
    age = 0;
}
DCUStudent::~DCUStudent(void){cout << "DCUStudent is being deleted" << endl;}

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
    cout << " " << endl;
}

class DCUUndergraduate : public DCUStudent{

    private:
        string *modules[10];
        string name;

    public:
        DCUUndergraduate(int studID, string studName, string studCourse, int studAge, string studModule[]):DCUStudent(studID, studName, studCourse, studAge)
	{
		name = studName;
		*modules = studModule;
	}
		~DCUUndergraduate();
        virtual void display(); 
};

void DCUUndergraduate::display(){
        
        DCUStudent::display();
        cout << name <<"'s modules are " << endl;
        for(int i = 0; i < 10; i++){
            cout << i+1 << ". " << *(modules[0]+i) << endl;
        }
        cout << " " << endl;
}
DCUUndergraduate::~DCUUndergraduate(void){cout << "DCUUndergraduate is being deleted" << endl;}
int main(int argc, char *argv[])
{//DCUStudent objects
    DCUStudent robert = DCUStudent(10, "Robert", "ECE2", 20);
    DCUStudent james = DCUStudent(20, "James", "CASE1");
    DCUStudent sarah = DCUStudent(30, "Sarah");
    DCUStudent jose = DCUStudent(40);
    robert.display();
    james.display();
    sarah.display();
    jose.display();
//DCUUndergraduate object 
    string modules[10] = {"EE100", "EE101", "EE102", "EE103", "EE104", "EE105", "EE106", "EE107", "EE108", "EE109"};
    DCUUndergraduate paul = DCUUndergraduate(50, "Paul", "CE1", 19, modules);
    paul.display();
//Pointer question
    DCUStudent *pointerTest = &robert;
    pointerTest->display();
    
    pointerTest = &paul;
    pointerTest->display();
    
    return 0;
}
