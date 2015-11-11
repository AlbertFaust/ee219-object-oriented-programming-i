/*Assignment 5 - Exercise 3
Demonstrate that when you pass an object of your 2DPoint class in Q2 to the midpoint() method function in Java that it “appears” to be passed by reference, not by value.
*/
class Point2D{
	private double x, y;
	
	public Point2D(double i, double j){
		x = i;
		y = j;
	}
	public Point2D(){}
	public String toString(){
		return(x + ", " + y);
	}
	public void set(Point2D instance){
		x = instance.x;
		y = instance.y;
	}
	public Point2D midPoint(Point2D instance){
		double midx = (x + instance.x)/2;
		double midy = (y + instance.y)/2;
		Point2D mid = new Point2D(midx, midy);
		return mid;
	}
	public static void main(String[] args){
		Point2D point = new Point2D(3,1);
		Point2D foo = new Point2D(2,5);
		Point2D x = new Point2D();
		System.out.println(point.midPoint(foo).toString());
		System.out.println(point.toString());
	}
}


/*
It is passed by value but the value is the reference to the array.

Real passing by reference involves passing the address of a variable so that the variable can be updated. This is NOT what happens when you pass an array in Java. In Java only pass by value is possible. 

Even though it appears like the function is changing the content, it is not.*/
