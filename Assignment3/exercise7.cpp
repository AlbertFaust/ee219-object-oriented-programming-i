/*Assignment 3 - Exercise 7 - Revisit
Perform the creation and destruction of the object using new and delete and see what happens.
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
	Vehicle robsVehicle = Vehicle("Black", "Porsche", "911");
	Car robsCar = Car("Red", "Toyota", "Yaris", 5, 5);
	
	Vehicle *pt;
	
	pt = new Vehicle("White","Porsche","911");
	delete pt;
}

