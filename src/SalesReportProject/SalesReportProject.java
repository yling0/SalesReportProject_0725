package SalesReportProject;

import java.util.Scanner;

public class SalesReportProject {
	public static void main (String[] args) {
		String customerno = null;
		System.out.println("Customer number");
		Scanner number = new Scanner (System.in);
		customerno = number.nextLine();
		
		String customername = null;
		System.out.println("Customer name");
		Scanner name = new Scanner (System.in);
		customername = name.nextLine();
		
		int salesamount = 0;
		System.out.println("Sales amount");
		Scanner samount = new Scanner (System.in);
		salesamount = samount.nextInt();
		
		int code = 0;
		System.out.println("Tax code");
		Scanner tcode = new Scanner (System.in);
		code = tcode.nextInt();
		
		double taxamount = 0; double totalamount = 0;
				
		if (code==0){
					taxamount=0;
					totalamount = salesamount;
		}
					if (code==1){
						taxamount= salesamount*0.03;
						totalamount = salesamount+taxamount;
					}
						if (code==2){
							taxamount=salesamount*0.05;
							totalamount=salesamount+taxamount;
						}		
		
		System.out.println("Sales Report");
		System.out.println("Customer number: " + customerno);
		System.out.println("Customer name: " + customername);
		System.out.println("Sales amount: " + salesamount);
		System.out.println("Sales tax: " + taxamount);
		System.out.println("Total amount: " + totalamount);	
	}
}
