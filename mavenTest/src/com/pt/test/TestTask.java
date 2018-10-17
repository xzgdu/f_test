package com.pt.test;

import org.junit.Test;

public class TestTask {

	@Test
	public void test(){
		//Stage 1
		for (int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0){
				System.out.println("FizzBuzz");
			}else if (i % 3 == 0) {
				System.out.println("Fizz");
			}else if (i % 5 == 0) {
				System.out.println("Buzz");
			}else{
				System.out.println(i);
			}
		}
		//Stage2
		for (int i = 1; i <= 100; i++) {
			if(i % 3 == 0 || i % 5 == 0 
					|| String.valueOf(i).indexOf("3")>0 
					|| String.valueOf(i).indexOf("5")>0){
				System.out.println("FizzBuzz");
			}else if (i % 3 == 0 || String.valueOf(i).indexOf("3")>0) {//Do not run
				System.out.println("Fizz");
			}else if (i % 5 == 0 || String.valueOf(i).indexOf("5")>0) {//Do not run
				System.out.println("Buzz");
			}else{
				System.out.println(i);
			}
		}
	}
}
