/*Assignment 6 - Exercise 3
Modify your Student class code in Q1/Q2 to create:

	a double getAverage(); method that returns the average result of all of a student’s grades in their modules.
    a double getMedian(); method that returns the median result of all of a student’s grades in their modules (The median is the centre value after sorting an array. However, if there is an even number of elements then it is the average of the pair of values at the centre).
    And, modify your Student class code in Q2/Q3 to create a static String getGrade(double); method that converts a result percentage into a grade. For example, <40% is "Fail", >=40% is "H3", >=50% is "H2:2", >=60% is "H2:1", >=70% is "H1".
*/
import java.util.*;
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
	static String getGrade(double grade){
	    if (grade >= 70)
	        return "H1";
	    else if (grade >= 60)
	        return "H2.1";
	    else if (grade >= 50)
	        return "H2.2";
	    else if (grade >= 40)
	        return "H3";
	    else return "Fail";
	}
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
	double getAverage(){
	    double TotalGrade = 0;
	    for(int i = 0; i < modules.length; i++){
	        TotalGrade = TotalGrade + modules[i].getResult();
	    }
	    return TotalGrade / modules.length;
	}
	double getMedian(){
	    ArrayList mods = new ArrayList();
	    for(int i = 0; i < modules.length; i++){
	        mods.add(modules[i].getResult());
	    }
	    Collections.sort(mods);
	    int middle = modules.length/2;
	    if(modules.length%2 == 1){
	        return (float) mods.get(middle);
	    }
	    else
	        return ((float)mods.get(middle-1) + (float)mods.get(middle)) / 2;
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
	    System.out.printf("Average result is: %.2f \n", getAverage());
	    System.out.printf("Median result is: %.2f \n", getMedian());
	    System.out.println(getGrade(46));
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
