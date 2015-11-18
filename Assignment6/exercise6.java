/*Assignment 6 - Exercise 6
Given a non-negative int n, return the sum of its digits recursively (no loops).

    sumDigits(126) → 9
    sumDigits(49) → 13
    sumDigits(12) → 3
*/
class Recursion{
    static int sumDigits(int n){
        if (n <= 0)
            return 0;
        else
            return(n%10 + sumDigits(n/10));
    }
    public static void main(String[] args){
        System.out.println(sumDigits(126));
        System.out.println(sumDigits(49));
        System.out.println(sumDigits(12));
    }
}
