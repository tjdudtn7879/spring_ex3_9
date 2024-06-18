package com.lgy.springex_3_9;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEvenNumber {
	public static void main(String[] args) {
		String configLoc="classpath:evenNumberCTX.xml";
		AbstractApplicationContext ctx= new GenericXmlApplicationContext(configLoc);
		MyEvenNumber myEvenNumber=ctx.getBean("myEvenNumber",MyEvenNumber.class);
		
		myEvenNumber.pc();
	}
}
