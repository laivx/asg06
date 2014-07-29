package oop.asg06b.Task1_6A_Interface;

public class Square implements Expression
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