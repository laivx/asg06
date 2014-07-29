package oop.asg06a.Task2;

public class ExpressionTest
{
	public static void main(String args[]){
		// ( (6^2 - 4) / 8 * 5 + 10 * 4 ) / 3
			
		Numeral n3 =  new Numeral (3);
		Numeral n4 =  new Numeral (4);
		Numeral n5 =  new Numeral (5);
		Numeral n6 =  new Numeral (6);
		Numeral n8 =  new Numeral (8);
		Numeral n10 =  new Numeral (10);

		Expression e1 = new Square (n6);
		Expression e2 = new Subtraction(e1, n4);
		Expression e3 = new Division (e2, n8);
		Expression e4 = new Multiplication(e3, n5);
		Expression e5 = new Multiplication(n10, n4);
		Expression e6 = new Addition (e4,e5);
		Expression result = new Division (e6, n3);


		System.out.println(result.toString());
		System.out.println(result.evaluate());

	}
}