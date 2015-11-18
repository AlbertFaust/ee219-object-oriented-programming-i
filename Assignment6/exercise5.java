/*Assignment 6 - Exercise 5
Write a Java application that takes two int values from the command prompt and a mathematical operation (plus, minus, times, divided, modulo) and gives the correct result back. So for example:

    java MathApp 1 plus 2    → The answer is 3
    java MathApp 10 divided 3   → The answer is 3.333   
    java MathApp abc divided efg   → Invalid usage: use MathApp int operation int   

Your code should give the correct usage if it is called incorrectly or if invalid values are sent to the application. The format of the factional result is not important.
*/
class MathApp{
    public static void main(String[] args) {
        
        if(args.length != 3){
            System.out.println("Not enough parameters");
            return;
        }
        float num1,num2 = 0;
        String opp = "";
        try{num1 = Float.parseFloat(args[0]);}
        catch(Exception e){
            System.out.println("Please enter two numbers");
            return;
        }
        
        try{opp = (args[1]);}
        catch(Exception e){
            System.out.println("Please enter a String");
            return;
        }
        
        try{num2 = Float.parseFloat(args[2]);}
        catch(Exception e){
            System.out.println("Please enter two numbers");
            return;
        }
        float answer = 0;
        if(opp.equals("plus")){
            answer = num1+num2;
            }
        else if(opp.equals("minus")){
            answer = num1-num2;
            }
        else if(opp.equals("times")){
            answer = num1*num2;
            }
        else if(opp.equals("divided")){
            answer = num1/num2;
            }
        else if(opp.equals("modulo")){
            answer = num1%num2;
            }
        else{    
            System.out.println("Please enter an opperand in the format: plus, minus, times, divided or modulo");
            return;
        }
        System.out.println("The answer is " + answer);
    }
}
