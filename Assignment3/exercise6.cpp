/*Assignment 3 - Exercise 6 - Revisit
Add a destructor to the Car class and Vehicle class that displays the messages “A car has just been destroyed” and “A Vehicle has just been destroyed” respectively. Do something similar for the constructors of the two classes.
Display what happens when you create and destroy an object of the Car class – do not use pointers. In one sentence, explain why this happens.
*/
#include <iostream>
using namespace std;

class Vehicle{
	private:
		string colour;
		string make;
		string model;
		static int vehNum;
	public:
		virtual void display();
		Vehicle(string, string, string);
		~Vehicle();
};
void Vehicle::display(){

    cout << "The vehicle's colour is " << colour << endl;
    cout << "The vehicle's make is " << make << endl;
    cout << "The vehicle's model is " << model << endl;
}
Vehicle::Vehicle(string col, string makeVeh, string modelVeh){
	cout << "A Vehicle has just been created" << endl;
	colour = col;
	make = makeVeh;
	model = modelVeh;
}
Vehicle::~Vehicle(void){cout << "A Vehicle has just been destroyed" << endl;}

class Car : public Vehicle{
	private:
		int seats;
		int doors;
	public:
		Car(string col, string makeCar, string modelCar, int seatsCar, int doorsCar):Vehicle(col, makeCar, modelCar){
			cout << "A Vehicle has just been created" << endl;
			seats = seatsCar;
			doors = doorsCar;
		}
		~Car();
};
Car::~Car(void){cout << "A Car has just been destroyed" << endl;}

int main()
{
	Car robsCar = Car("Red", "Toyota", "Yaris", 5, 5);
}

//when i create a vehicle it says created, destroyed. however when i create a car it says vehicle created twice, then car is destroyed, then vehicle is destroyed.
