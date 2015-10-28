/*Assignment 3 - Exercise 5 - Revisit
Add an additional property to the Vehicle class (Q3, Q4) of a Vehicle Number. Use a static value (which starts at 1000) so that every vehicle has a unique vehicle number that it receives when the Vehicle is created. 
The Vehicle class is an abstract class so this will only happen through inheritance.
*/
#include <iostream>
using namespace std;

class Vehicle{
	private:
		string colour;
		string make;
		string model;
		static const int vehNum = 1000;
	public:
		virtual void display();
		Vehicle(string, string, string);
};
void Vehicle::display(){

    cout << "The vehicle's colour is " << colour << endl;
    cout << "The vehicle's make is " << make << endl;
    cout << "The vehicle's model is " << model << endl;
    cout << vehNum << endl;
}
Vehicle::Vehicle(string col, string makeVeh, string modelVeh){
	vehNum = vehNum+1;
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
	Vehicle v = Vehicle("t","a","1");
	v.display();
}
