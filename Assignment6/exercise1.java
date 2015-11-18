/*Assignment 6 - Exercise 1
Write a Java class called Module that has a module code, title, and a result (e.g., EE219 object-oriented programming 57.2%). 
Write a Student class that has a name, id number, year, programme and an array of Modules. 
Add any methods that are necessary. Test that your class is working by creating a suitable display() mechanism, which displays a student’s full record for their current year.

NOTE: For simplicity, if the student is in second year, then there should be no record for first year.
*/
class Module{
	String code;
	String title;
	float result;
	Module(String code, String title, float result){
		this.code = code;
		this.title = title;
		this.result = result;
	}
	void display(){
	    System.out.println("Module code: " + code);
	    System.out.println("Name of module: " + title);
	    System.out.println("Result: " + result + "%");
	}
}
class Student{
	String name;
	int id;
	int year;
	String programme;
	Module[] modules;
	Student(String name, int id, int year, String programme, Module[] modules){
		this.name = name;
		this.id = id;
		this.year = year;
		this.programme = programme;
		this.modules = modules; 
	}
	void display(){
	    System.out.println("Student name: " + name);
	    System.out.println("Student ID: " + id);	
	    System.out.println("Year: " + year);	
	    System.out.println("Programme: " + programme);	
	    for(int i = 0; i < modules.length; i++){
	        modules[i].display();
	    }
	}	
	public static void main(String[] args){
		Module robertee219 = new Module("EE219", "Object-Oriented Programming", 100);
		Module robertem201 = new Module("EM201", "Engineering Mathematics III", 92);
		Module array[] = {robertee219, robertem201};
		Student robert = new Student("Robert McConnell", 12345678, 2, "ECE", array);
		robert.display();
	}
}
