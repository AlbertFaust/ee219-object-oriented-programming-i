/*Assignment 4 - Exercise 10
 Write a **Java** class that uses an array of names e.g. {“Teresa Green”, “Rick O’Shea”, “Robin Banks”, “Barry Cade”, “Sam Pull”} and prints out a Hello message to each of the names on an individual line. 
There can be any number of names in the array. In this case:
	Hello Teresa Green
	Hello Rick O’Shea
	Etc.
*/
public class exercise10 {
    public static void main(String[] args){
        String[] names = {"Teresa Green", "Rick O’Shea", "Robin Banks", "Barry Cade", "Sam Pull"};
        for(int i = 0; i < names.length; i++){
            System.out.println("Hello " + names[i]);
        }
    }
}
