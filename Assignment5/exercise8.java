/*Assignment 5 - Exercise 7
Write a function in Java that returns the winning numbers in next week’s lottery draw. The function should have the form: int[] lotteryNumbers(); where the function uses the Math class random() method to return an array of 7 integers between 1 and 45. You must not allow the same number to come up multiple times.
Write a display function that uses the sort displays the resulting numbers in order (see the Arrays class in Java).
Write code to perform the lottery draw 1,000,000 times in a row to test if the draw outcomes are truly random.
*/
import java.math.*;
import java.util.*;

class Lottery{
	
	boolean contains(int[] list, int element){
		for(int i = 0; i < list.length; i++){
			if(list[i] == element){
				return true;
			}
		}
		return false;
	}
	
	int[] lotteryNumbers(){
		int[] a = new int[7];
		int numbersTaken = 0;
		while(numbersTaken != a.length){
			int rand = (int)(Math.random() * 45) + 1;
			if(!contains(a,rand)){
				a[numbersTaken] = rand;
				numbersTaken++;
			}
		}
		return a;
	}
	
	void display(int[] a){
		Arrays.sort(a);
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("");
	}

	public static void main(String[] args){
		Lottery l = new Lottery();
		for(int i = 0; i < 1000000; i++){
			int[] numbers = l.lotteryNumbers();
			l.display(numbers);
		}
	}
}
