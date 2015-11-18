/*Assignment 6 - Exercise 2
Write methods for your Student Java class in Q1 that returns the lowest and highest scoring modules of all of that student’s modules. The methods should have the form: Module getLowest(); and Module getHighest(); 
You should then add code to a main() function to efficiently display something like:

Student: Derek Molloy
ID Number: 31415926
Year: 3
Programme: Electronic Engineering
Lowest: EE301 Complexities -- Complex Complexities 21%
Highest: EE302 Niceties -- Nice Niceties 93%
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
	public float getResult(){
	    return result;
	}
	public String getTitle(){
	    return title;
	}
	public String getCode(){
	    return code;
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
	Module getHighest(){
	    Module temp = new Module("x", "y", 0);
	    for(int i = 0; i < modules.length; i++){
	        if(modules[i].getResult() > temp.result){
	            temp.result = modules[i].getResult();
	            temp.code = modules[i].getCode();
	            temp.title = modules[i].getTitle();
	        }
	    }
	    return temp;
	}
	Module getLowest(){
	   Module temp = getHighest();
	    for(int i = 0; i < modules.length; i++){
	        if(modules[i].getResult() < temp.result){
	            temp.result = modules[i].getResult();
	            temp.code = modules[i].getCode();
	            temp.title = modules[i].getTitle();
	        }
	    }
	    return temp;
	}
	void display(){
	    System.out.println("Student name: " + name);
	    System.out.println("Student ID: " + id);	
	    System.out.println("Year: " + year);	
	    System.out.println("Programme: " + programme);	
	    for(int i = 0; i < modules.length; i++){
	        modules[i].display();
	    }
	    System.out.println("Lowest result is: ");
	    getLowest().display();
	    System.out.println("Highest result is: ");
	    getHighest().display();
	}	
	public static void main(String[] args){
	    Module robertee224 = new Module("EE224", "Data Communications and Networks I", 76);
		Module robertee219 = new Module("EE219", "Object-Oriented Programming", 100);
		Module robertem201 = new Module("EM201", "Engineering Mathematics III", 92);
		Module array[] = {robertee224, robertee219, robertem201};
		Student robert = new Student("Robert McConnell", 12345678, 2, "ECE", array);
	    robert.display();
	}
}
