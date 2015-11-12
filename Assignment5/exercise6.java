/*Assignment 5 - Exercise 6
Given a string, compute recursively (no loops) in Java the number of lowercase characters in the string. The string may only contain uppercase and lowercase characters 
(Note: you can use a static function that you call from main()). You can assume that the string that is passed to the function is at least 1 letter long.
	countLower("xxXXxx") → 4
	countLower("aABbABa") → 3
	countLower("H") → 0
*/
class count{
	
	static int countLower(String s){
		if (s.length() < 1)
			return 0;
		else if(Character.isLowerCase(s.charAt(0)))
			return 1+countLower(s.substring(1));
		else
			return countLower(s.substring(1));
	}

	public static void main(String[] args){
		System.out.println(countLower("A"));
	}
}
