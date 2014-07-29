package oop.asg06b.Task1_6A_Interface;

public class Numeral implements Expression
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