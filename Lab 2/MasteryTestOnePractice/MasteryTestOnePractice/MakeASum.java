/** Mastery Test 1 Practice, Section 2, Q3 */

public class MakeASum {

   public static void main(String[] args) {
      /* make three integer variables and assign
      the values 4, 5 and 6 to them.*/
      
      /* construct an expression using only those 
      variables and what ever operators you want 
      that evaluates to 74.*/
      
      /* Assign the result of your expression to an 
      integer variable named result.*/
      
      /* Add a statement to print out the expression 
      and the result. NB: Printing a fixed expression 
      as text isn't good design, because if the value 
      of a variable changes, the expression is out of 
      date. Better to output the expression based on 
      the values of the variables. FixMe is an example 
      of the right approach.*/
      
      /* Output example if the target number was 52:
      
      (6 + 4) * 5 + 6 - 4 = 52
      */
   int val1 = 4;
   int val2 = 5;
   int val3 = 6;
   
   int result = (((val3*val2*val1)/val2)+(val2*val3)+(val1*val2));
   System.out.println("(("+ val3+"*"+ val2+"*"+ val1+")/"+ val2+")+("+ val2+"*"+ val3+")+("+ val1+"*"+ val2+")) = " + result);
   
   }

}