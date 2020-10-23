package com.assignment3.question2;

import com.assignment3.questions.ComissionEmployee;
import com.assignment3.questions.HourlyEmployee;
import com.assignment3.questions.SalariedEmployee;

public class Tester {
	public static void main(String[] args) {
		
		Invoice invoice  = new Invoice("1", "Bag", 2, 300.0);
		System.out.println("Total payment is: " + invoice.getPayment());
		
		SalariedEmployee salariedEmp = new SalariedEmployee(1000);
		System.out.println("Total payment of Saliried employee is: " + salariedEmp.getPayment());
		
		ComissionEmployee comissionEmp = new ComissionEmployee(50, 500);
		System.out.println("Total payment of Comission employee is: " + comissionEmp.getPayment());
		
		HourlyEmployee hourlyEmp = new HourlyEmployee(2, 1000);
		System.out.println("Total payment of Saliried employee is: " + hourlyEmp.getPayment());
		
	}
}