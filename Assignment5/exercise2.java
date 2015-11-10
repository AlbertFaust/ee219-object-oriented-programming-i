/*Assignment 5 - Exercise 2
Write the same code as for Q1, except in Java. Test that it works.
(Rename to Point2D)
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

