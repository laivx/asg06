package oop.asg06a.Task1;

public class Numeral extends Expression
{
	private int value;

	public Numeral (){
		this.value = 0;
	}
	public Numeral (int value){
		this.value = value;
	}

	public String toString(){
		return "" + value;
	}

	public int evaluate(){
		return value;
	}
}