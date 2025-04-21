package day3;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter The First Number");
		double num1 = scanner.nextDouble();
//		System.out.println(num1);
		System.out.println("Please Enter The Second Number");
		double num2 = scanner.nextDouble();
		//Inputting the operator
		System.out.println("Choose an operation");
		System.out.println("1, Addition");
		System.out.println("2, Subtraction");
		System.out.println("3, Multiplication");
		System.out.println("4, Division");
		
		int choice = scanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Result: " + (num1 + num2));
			break;
		case 2:
			System.out.println("Result: " + (num1 - num2));
			break;
		case 3:
			System.out.println("Result: " + (num1 * num2));
			break;
		case 4:
			if(num2 != 0) {
				System.out.println("Result: " + (num1 / num2));
			}else {
				System.out.println("Error: Division by zero is not allowed");
			}
			break;
		default:
			System.out.println("Invalid Choice ");
		
		}
		scanner.close();
		

	}

}
