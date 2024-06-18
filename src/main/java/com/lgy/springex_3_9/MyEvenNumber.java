package com.lgy.springex_3_9;

public class MyEvenNumber {
	int num;
	EvenNumber evenNumber;
	
	public void pc() {
		evenNumber.process(num);
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public EvenNumber getEvenNumber() {
		return evenNumber;
	}
	public void setEvenNumber(EvenNumber evenNumber) {
		this.evenNumber = evenNumber;
	}
	
	
}
