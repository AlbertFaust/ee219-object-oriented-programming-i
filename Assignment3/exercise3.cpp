/*Assignment 3 - Exercise 3 - Revisit
Write a class Vehicle that has the properties of a colour, make and model. 
Add a constructor for your class and add an abstract display() method. 
*/
#include <iostream>
using namespace std;

class Vehicle{
	private:
		string colour;
		string make;
		string model;
	public:
		virtual void display();
		Vehicle(string, string, string);
};
void Vehicle::display(){

    cout << "The vehicle's colour is " << colour << endl;
    cout << "The vehicle's make is " << make << endl;
    cout << "The vehicle's model is " << model << endl;
}
Vehicle::Vehicle(string col, string makeVeh, string modelVeh){
	colour = col;
	make = makeVeh;
	model = modelVeh;
}
