/*Assignment 6 - Exercise 7
Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.

    canBalance({1, 1, 1, 2, 1}) → true
    canBalance({2, 1, 1, 2, 1}) → false
    canBalance({10, 10}) → true
*/
class balance{
    static boolean canBalance(int[] array){
        int front = array[0];
        int end = 0;
        for(int i = 0; i < array.length-1; i++){
            end = end + array[(i+1)];
        }
        for(int i = 0; i < array.length-1; i++){
            if(front == end){
                return true;
            }
            else{
                front = front + array[i+1];
                end = end - array[1+array[i+1]];
            }
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
