package Tasks;

public class OperatorClass {
    public static void main(String[] args) {
        /* Arithemetic Operators */
        int a = 10, b = 10;
        int sum = a + b;// here the"+" is an arithmetic operator
        System.out.println("Addition for a+b is" + sum);
        System.out.println("Difference for a-b is" + (a - b));
        System.out.println("Multiplication for axb is" + (a * b));
        System.out.println("Divison for a/b is" + (a / b));
        System.out.println("Modulo for a and b is" + (a % 2));

        /* Assignment Operators */
        int aNumber1;
        aNumber1 = 10;
        /* or declare and assign */
        int aNumber2 = 20;
        /* assign with another variable */
        int aNumber3 = aNumber1;
        System.out.println("Assignment with +=" + (aNumber1 += 10));
        aNumber2 -= 30;// same as aNumber2 = aNumber - 30;
        System.out.println("Assignment with -=" + aNumber2);

        /* Relational(comparison) Operators */
        int rNumber1 = 10, rNumber2 = 20;
        System.out.println("rNumber1 equals rNumber2 ?" + (rNumber1 == rNumber2));
        System.out.println("rNumber1 greater than r Number2?" + (rNumber1 > rNumber2));
        System.out.println("rNumber1 is less than or equals to rNumber2?" + (rNumber1 <= rNumber2));
        System.out.println("rNumber1 not equals to rNumber2?" + (rNumber1 != rNumber2));

        /* Logical Operator */
        int lNumber1 = 10, lNumber2 = 12;
        boolean lExpression1 = lNumber1 == lNumber2;
        boolean lExpression2 = lNumber1 <= lNumber2;
        System.out.println("And operator uses &&" + (lExpression1 && lExpression2));
        System.out.println("OR operator uses ||" + (lExpression1 || lExpression2));
        System.out.println("Not operator uses " + !lExpression1);

        /* Unary Operator */
        int uNumber = 10;
        uNumber++; // meaning uNumber1 = uNUmber +1;
        System.out.println("Unary  for increament is ++" + uNumber);
        uNumber--;
        System.out.println("Unary for decrement is -- " + uNumber);

        /* Ternary Operator */
        int tNumber1 = 10, tNumber2 = 10;
        boolean tExpression = tNumber1 == tNumber2;
        /*
         * One line if sles, see the given example if else
         * String output;
         * if(tExpression == true){
         * output = "True Statement";
         * }else{
         * output = "False Statement"
         * }
         */
        String output = tExpression ? "True Statement" : "False Statement";
        /*
         * Here we can assign a string out with one expression
         * if expression is true it will return the value after the ?
         * if the expression is false it will return the value after the ":"
         */
        int numberOutput = tNumber1 < tNumber2 ? 10 : 20;
        System.out.println(output);
        System.out.println(numberOutput);

        /*
         * Task 1
         * WAP to print weather a variable is greater than or equal to 18
         * 
         */
        int var = 20;

        System.out.println("The variable is greater than 18?" + (var > 18));

        /*
         * 
         * Task2
         * WAP to print simple interest from variables
         * MAke 3 variable for amount, time and rate and save the calculation into a
         * variable
         * formula
         * si= amount * rate* time/100;
         */

        int amount = 2000;
        float rate = 2.3f;
        int time = 3;
        float si = (amount * rate * time) / 100;
        System.out.println("The simple interest is" + si);

        /*
         * Task 3
         * Wap to print the area and perimeter of rectangle
         * a = l*b;
         * p = 2(l+b)
         */
        int lenght = 5;
        int breadth = 8;
        a = lenght * breadth;
        int p = 2 * (lenght + breadth);
        System.out.println("The area of rectangle is" + a);
        System.out.println("The perimeter of rectangle is" + p);

        /*
         * Task 4
         * Complete the task1 using ternary operator
         */
        int var1 = 16;
        boolean testExpression = (var1 > 18);
        String result = testExpression ? "True" : "False";
        System.out.println(result);

    }

}