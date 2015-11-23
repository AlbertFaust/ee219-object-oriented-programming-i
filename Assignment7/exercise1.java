/*Assignment 7 - Exercise 1
Given a String, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count.

    notReplace("is test") → "is not test"
    notReplace("is-is") → "is not-is not"
    notReplace("This is right") → "This is not right"

*/
class Question1{ 
 
    static String notReplace(String words){ 
 
 words = words.replaceAll("\\b" + "is" + "\\b", "is not"); 
 
 return words; 
    } 
    public static void main(String[] args){ 
 
 System.out.println(notReplace("is test")); 
 
 System.out.println(notReplace("is­is")); 
 
 System.out.println(notReplace("This is right")); 
    } 
} 
