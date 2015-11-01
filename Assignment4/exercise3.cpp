/*Assignment 4 - Exercise 3
Demonstrate how you can pass an object of your class in Q1/Q2 to a function using pass-by-value and a separate function that expects the object to be passed-by-reference. 
Demonstrate that each form works correctly.
*/
#include <iostream>
#include <string>
using namespace std;

class Pet{

    private:
        string type;
        string name;
        int age;
        bool gender;

    public:
        Pet(string, string, int, int, bool);
        virtual void display();
        virtual int getWeight(){return weight;};

    protected:
        int weight;
};

Pet::Pet(string petType, string petName, int petAge, int petWeight, bool petGender){
    type = petType;
    name = petName;
    age = petAge;
    weight = petWeight;
    gender = petGender;
}

void Pet::display(){
    cout << "The type of pet is a " << type << endl;
    cout << "The name of the " << type << " is " << name << endl;
    cout << name << " is " << age << " months old" << endl;
    cout << "They weigh " << weight << "kg" << endl;
    if (gender == 1)
        cout << name << " is a male" << endl;
    else
        cout << name << " is a female" << endl;
}
class Dog : public Pet{
    
    private:
        string breed;
        bool shed;
        bool rescue;

    public:
        Dog(string petType, string dogBreed, string petName, int petAge, int petWeight, bool petGender, bool dogShed, bool dogRescue) : Pet(petType, petName, petAge, petWeight, petGender)
    {
        breed = dogBreed;
        shed = dogShed;
        rescue = dogRescue;
    }
    virtual void display();
    virtual void feed();
    virtual void feed(int feed);
    void giveFood(Dog instance);
    void takeFood(Dog instance);
};

void Dog::display(){
    
    Pet::display();
    cout << "The breed of dog is a " << breed << endl; 
    if (shed == 1)
        cout << "This dog may shed hair" << endl;
    else
        cout << "It is unlikely that this dog will shed hair" << endl;
    if (rescue == 1)
        cout << "This is a rescue dog" << endl;
    else
        cout << "This is not a rescue dog" << endl;
}
void Dog::feed(){
    
    if (weight >= 50)
        cout << "This dog needs to be fed 3 times a day" << endl;
    else
        cout << "This dog needs to be fed 2 times a day" << endl;
}
void Dog::feed(int food){
    cout << "This dog needs to be fed " << food << " times a day" << endl;
}
void Dog::takeFood(Dog instance){
    instance.feed();
}
void Dog::giveFood(Dog &instance){
    instance.feed();
}
int main()
{
    Dog husky = Dog("Dog", "Siberian Husky", "Boreas", 25, 30, 1, 1, 0);
    husky.takeFood(husky);
    husky.giveFood(husky);
    husky.display();
    husky.feed(3);
    husky.display();
    return 0;
}
