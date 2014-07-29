package oop.asg06a.Task2;

public class Square extends Expression
{
	private Expression e;

	public Square (Expression a){
		this.e = a;
	}

	public String toString(){
		return e.toString() + "^" + "2";
	}
	public int evaluate (){
		return e.evaluate()* e.evaluate();
	}
}