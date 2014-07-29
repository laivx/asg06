package oop.asg06a.Task1;

public class ExpressionTest
{
	public static void main(String args[]){
		//(3^2+1)^2
		Numeral n1 = new Numeral (1);
		Numeral n3 = new Numeral (3);
		Expression e1 = new Square (n3);
		Expression e2 = new Addition (e1, n1);
		Expression e3 = new Square (e2);
		System.out.println(e3.toString());
		System.out.println(e3.evaluate());

	}
}