package com.lgy.springex_3_9;

public class EvenNumber {
	public void process(int num) {
		int two = 0;
		for (int i = 0; i <= num; i++) {
			if (i%2==0) {
				two=two+i;
			}
		}
		System.out.println(num+"까지의 짝수들의 합계는"+two);
	}
}
/* int sum=0;
 * for(int i=0; i<=num; i+=2){
 * 	sum+=i;
 * 	}
 */
