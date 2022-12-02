/* A Basic Calculator */
/* In this project, you will use classes, methods, and objects to create a simple arithmetic calculator. The calculator will be able to:

*/
/* 
    Add two integers
    Subtract two integers
    Multiply two integers
    Divide two integers
    Apply the modulo operator on two integers
*/

public class Calculator{
    //constructor method
    public Calculator(){

    }

    //add method
    public int add(int a, int b){
        int sum = a + b;
        return sum;
    }
    //subtract method
    public int sub(int a, int b){
        int sub = a - b;
        return sub;
    }
    //multiply method
    public int multiply(int a, int b){
        int mul = a * b;
        return mul;
    }
    //division method
    public int divide(int a , int b){
        int div = a / b;
        return div;
    }
    //modulo method
    public int modulo(int a, int b){
        int mod = a % b;
        return mod;
    }
    //main method
    public static void main(String[] args){
        //creating object called myCalculator
        Calculator myCalculator = new Calculator();

        //adding
        int add = myCalculator.add(5,7);
        System.out.println("Adding 5 + 7 = "+add);

        //substraction
        int sub = myCalculator.sub(45, 11);
        System.out.println("Subtracting 45 - 11 = "+sub);

        //div
        int div = myCalculator.divide(10, 2);
        System.out.println("Dividing 10 / 2 = "+ div);

        //mod
        int mod = myCalculator.modulo(11, 3);
        System.out.println("Modding 11 % 3 = "+mod);


    }
}