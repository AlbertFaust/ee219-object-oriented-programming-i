/*Assignment 4 - Exercise 1
Write a C++ class of your own choosing (it cannot relate to bank accounts, monkeys or any other class that we discussed in lectures) that demonstrates the following OOP concepts:
	- Inheritance
	- Over-riding
*/
#include <iostream>
#include <string>
using namespace std;

class Pet{

    private:
        string type;
        string name;
        int age;
        int weight;
        bool gender;

    public:
        Pet(string, string, int, int, bool);
        virtual void display();
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
        int feed;

    public:
        Dog(string petType, string dogBreed, string petName, int petAge, int petWeight, bool petGender, bool dogShed, bool dogRescue, int dogFeed) : Pet(petType, petName, petAge, petWeight, petGender)
    {
        breed = dogBreed;
        shed = dogShed;
        rescue = dogRescue;
        feed = dogFeed;
    }
    virtual void display();
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
    cout << "This dog needs to be fed " << feed << " times a day" << endl;
}

int main()
{
    Dog husky = Dog("Dog", "Siberian Husky", "Boreas", 25, 30, 1, 1, 0, 3);
    husky.display();
    return 0;
}
