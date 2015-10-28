/*Assignment 3 - Exercise 4 - Revisit
Write a Car class that is a child of Vehicle (in Q3), which has the additional properties of a number of seats and number of doors.
Add a suitable constructor and do everything necessary to allow you to create an object of the Car class.
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

class Car : public Vehicle{
	private:
		int seats;
		int doors;
	public:
		Car(string col, string makeCar, string modelCar, int seatsCar, int doorsCar):Vehicle(col, makeCar, modelCar){
			seats = seatsCar;
			doors = doorsCar;
		}
};

int main()
{
	Car robsCar = Car("Red", "Toyota", "Yaris", 5, 5);
}
