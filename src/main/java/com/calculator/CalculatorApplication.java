package com.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication
{
	public static void main (String[] args) {
		CalculatorApplication calculator = new CalculatorApplication();
		System.out.println(calculator.add(5,6));
		System.out.println(calculator.subtraction(5,6));
	}


	int a;
	int b;

	public double add(double a, double b){
		return a+b;
	}


	public double subtraction(double a, double b){
		return a-b;
	}

}
