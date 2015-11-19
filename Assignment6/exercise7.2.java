/*Assignment 6 - Exercise 7 Part 2
Write your code to be as computationally efficient as possible.
*/
class Recursion{
    static boolean canBalance(int[] array){
        int[] newArray = new int[array.length];
        newArray[0] = array[0];

        for(int i = 1; i < array.length; i++){
            newArray[i] = newArray[i-1]+array[i];
        }
        
        boolean found = false;
        
        int i = 0;
        
        while(!found && i < array.length){
            if((newArray[i]==(newArray[array.length-1]/2)) && (newArray[array.length-1]%2==0)){
                return true;
            }
            i++;
        }
        return false;
    }
    public static void main(String[] args){
        int[] arrayA = {1, 1, 1, 2, 1};
        System.out.println(canBalance(arrayA));
        int[] arrayB = {2, 1, 1, 2, 1};
        System.out.println(canBalance(arrayB));
        int[] arrayC = {10, 10};
        System.out.println(canBalance(arrayC));
    }
}

