/*Assignment 6 - Exercise 4
 Create a new Java class called Programme that has a title and an array of students. Write suitable methods to:

    Display all students in the programme
    Return the best performing student in the programme for each year
    Return the worst performing student in the programme for each year
    Return the average result of all students in the programme
    Display all students in the programme in order of merit using their average mark
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
class Programme{
    String title;
    Student[] students;
    boolean check;
    Programme(String title, Student[] students){
		this.title = title;
		this.students = students;
	}
	
    void display(){
        System.out.println("Title: " + title);	
        for(int i = 0; i < students.length; i++){
            students[i].display();
        }
    }
    
    void merit(){
        Module x = new Module("null", "null", 100);
	    Module[] y = {x}; 
        Student temp = new Student("null", 0, 0, "null", y);
        for(int i = 0; i < students.length; i++){
            for(int j = 1; j < students.length; j++){
                if(students[j].getAverage() > students[j-1].getAverage()){
                    temp = students[j-1];
                    students[j-1] = students[j];
                    students[j] = temp;
                }
            }
        }
        for(int i = 0; i < students.length; i++){
            students[i].display();
        }
    }
    
    void display(Student[] array){
        String bestWorst;
        if (check == true){
            bestWorst = "Best";
        }
        else{
            bestWorst = "Worst";
        }
        for(int i = 0; i < array.length; i++){
            System.out.println(bestWorst + " student in Year " + (i+1) + ":");
            if (array[i].getName() == "null")
                System.out.println("No " + bestWorst + " student");
            else
                array[i].display();
        }	
    }       	
	
	Student[] bestStudent(){
	    check = true;
	    Module x = new Module("null", "null", 0);
	    Module[] y = {x};
	    int courseYears = 4;
	    Student[] studArr = new Student[courseYears];
	    
        for(int j = 0; j < studArr.length; j++){
       	    Student stud = new Student("null", 0, 0, "null", y);
            for(int i = 0; i < students.length; i++){
                if ((students[i].getYear() == j+1) && (students[i].getAverage() > stud.getAverage())){
                        stud.setName(students[i].getName());
                        stud.setId(students[i].getId());
                        stud.setYear(students[i].getYear());
                        stud.setProgramme(students[i].getProgramme());
                        stud.setModules(students[i].getModules());
                }
            }
            studArr[j] = stud;
        }
        return studArr;
    }
   
	Student[] worstStudent(){
	    check = false;
	    Module x = new Module("null", "null", 100);
	    Module[] y = {x};
	    int courseYears = 4;
	    Student[] studArr = new Student[courseYears];
	    
        for(int j = 0; j < studArr.length; j++){
       	    Student stud = new Student("null", 0, 0, "null", y);
            for(int i = 0; i < students.length; i++){
                if ((students[i].getYear() == j+1) && (students[i].getAverage() < stud.getAverage())){
                        stud.setName(students[i].getName());
                        stud.setId(students[i].getId());
                        stud.setYear(students[i].getYear());
                        stud.setProgramme(students[i].getProgramme());
                        stud.setModules(students[i].getModules());
                }
            }
            studArr[j] = stud;
        }
        return studArr;
    }
    
    double totalAverage(){
	    double Total = 0;
	    for(int i = 0; i < students.length; i++){
	        Total = Total + students[i].getAverage();
	    }
	    return Total / students.length;
	}
	
	
}
class Student{
	String name;
	int id;
	int year;
	String programme;
	Module[] modules;
	public String getName(){
	    return name;
	}
	public int getId(){
	    return id;
	}
	public int getYear(){
	    return year;
	}
	public String getProgramme(){
	    return programme;
	}
	public Module[] getModules(){
	    return modules;
	}
	public void setName(String name) {
       this.name = name;
    }
    public void setId(int id) {
       this.id = id;
    }
    public void setYear(int year) {
       this.year = year;
    }
    public void setProgramme(String programme) {
       this.programme = programme;
    }
    public void setModules(Module[] modules) {
       this.modules = modules;
    }
	Student(String name, int id, int year, String programme, Module[] modules){
		this.name = name;
		this.id = id;
		this.year = year;
		this.programme = programme;
		this.modules = modules; 
	}
	Student(){
	}
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
	Module getHighest(){
	    Module temp = new Module("x", "y", 0);
	    for(int i = 0; i < modules.length; i++){
	        if(modules[i].getResult() > temp.result){
	            temp.result = modules[i].getResult();
	            temp.code = modules[i].getCode();
	            temp.title = modules[i].getTitle();
	        }
	    }
	    System.out.println("Highest result is: ");
	    return temp;
	}
	Module getLowest(){
	   Module temp = new Module("x", "y", 100);
	    for(int i = 0; i < modules.length; i++){
	        if(modules[i].getResult() < temp.result){
	            temp.result = modules[i].getResult();
	            temp.code = modules[i].getCode();
	            temp.title = modules[i].getTitle();
	        }
	    }
	    System.out.println("Lowest result is: ");
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
	}	
	public static void main(String[] args){
	
	    //robert year 2
	    //robert's modules
	    Module robertee224 = new Module("EE224", "Data Communications and Networks I", 76);
		Module robertee219 = new Module("EE219", "Object-Oriented Programming", 100);
		Module robertem201 = new Module("EM201", "Engineering Mathematics III", 92);
		//array of robert's modules
		Module rarray[] = {robertee224, robertee219, robertem201};
		//student robert
		Student robert = new Student("Robert McConnell", 12345678, 2, "ECE", rarray);
	    
	    //john year 3
	    //john's modules
	    Module johnee324 = new Module("EE324", "Data Communications and Networks III", 22);
		Module johnee319 = new Module("EE319", "Object-Oriented Programming II", 62);
		Module johnem301 = new Module("EM301", "Engineering Mathematics V", 79);
		//array of john's modules
		Module jarray[] = {johnee324, johnee319, johnem301};
		//student john
		Student john = new Student("John Doe", 87654321, 3, "ECE", jarray);
		
		//ciara year 3
	    //ciara's modules
	    Module ciaraee324 = new Module("EE324", "Data Communications and Networks III", 82);
		Module ciaraee319 = new Module("EE319", "Object-Oriented Programming II", 72);
		Module ciaraem301 = new Module("EM301", "Engineering Mathematics V", 69);
		//array of ciara's modules
		Module carray[] = {ciaraee324, ciaraee319, ciaraem301};
		//student ciara
		Student ciara = new Student("Ciara Egg", 24681012, 3, "ECE", carray);
		
		//array of students
		Student rjc[] = {robert, john, ciara};
	    //ece
	    Programme ece = new Programme("ECE", rjc);
	    
	    //methods
	    //display student robert
	    robert.display();
	    System.out.println("");
	    
	    //john's highest result
		john.getLowest().display();
		System.out.println("");
		
		//ciara's lowest result
		ciara.getHighest().display();
		System.out.println("");
		
		//robert's average result
		System.out.printf("Average result is: %.2f \n", robert.getAverage());
		System.out.println("");
		
		//john's median result
		System.out.printf("Median result is: %.2f \n", john.getMedian());
		System.out.println("");
		
		//ciara's ee324 grade
		System.out.println(getGrade(ciaraee324.getResult()));
		System.out.println("");
		
		//display all ece students
	    ece.display();
	    System.out.println("");
	    
	    //best performing student for each year
	    ece.display(ece.bestStudent());
	    System.out.println("");
	    
	    //worst performing student for each year
	    ece.display(ece.worstStudent());
	    System.out.println("");
	    
	    //ece total average result
		System.out.printf("Average result is: %.2f \n", ece.totalAverage());
		System.out.println("");
	    
	    //displays students according merit
	    ece.merit();
	}
}
