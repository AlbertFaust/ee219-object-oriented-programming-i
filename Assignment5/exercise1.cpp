/*Assignment 5 - Exercise 1
Write a C++ class called Point2D that describes a 2-dimensional (x,y) point using the double type. It should have the following features:
	A constructor that accepts that accepts two double values (x,y) to create a point object.
	A default constructor of your choosing that creates a point object.
	A string toString() method that returns the point as a string in a format of your choosing.
	A void set(Point2D) method that allows you to set the point using an object of point2D
	A Point2D midPoint(Point2D) method that returns a Point2D object that contains the calculated midpoint.

HINT: The sstream header file (#include <sstream>) class ostringstream can be used to “construct” a string in C++. For example:

ostringstream message;
float f = 23.0f;
message << “The product costs: “ << f << “ Euro”;
string m = message.str();
*/
#include <iostream>
#include <sstream>
using namespace std;

class Point2D{

    private:
        double x;
        double y;

    public:
        Point2D(double, double);
        Point2D();
        virtual string toString();
        virtual void set(Point2D);
        virtual Point2D midPoint(Point2D);
};

Point2D::Point2D(double i, double j){
    x = i;
    y = j;
}
Point2D::Point2D(){}
string Point2D::toString(){
    ostringstream string;
    string << x << ", " << y << endl;
    return string.str();
}
void Point2D::set(Point2D instance){
    x = instance.x;
    y = instance.y;
}
Point2D Point2D::midPoint(Point2D instance){
    Point2D mid = Point2D(((x + instance.x)/2), ((y + instance.y)/2));
    return mid;
}
int main(){
    Point2D point = Point2D(3, 1);
    Point2D foo = Point2D(2,5);
    Point2D x = Point2D();
    //point.set(foo);
    cout << (point.midPoint(foo)).toString();
    cout << point.toString();
    return 0;
}

