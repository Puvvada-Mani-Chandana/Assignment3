package com.assignment3.questions;
import com.assignment3.question2.Payable;
	
	abstract class Employee implements Payable{
		
		private int rate;
		
		public Employee() {
			
		}
		
		public abstract int getSalary();

		public int getRate() {
			return rate;
		}

		public void setRate(int rate) {
			this.rate = rate;
		}
		
	}

