package oop.asg06b.Task1_6A_Interface;

public class Addition implements BinaryExpression
{
	private Expression left;
	private Expression right;

	public Addition (Expression left, Expression right){
		this.left = left;
		this.right = right;
	}

	public Expression left(){
		return left;
	}
	public  Expression right(){
		return right;
	}

	public String toString(){
		return "(" + left.toString() + "+" + right.toString() + ")" ;
	}
	public int evaluate(){
		return left.evaluate() + right.evaluate();
	}
}