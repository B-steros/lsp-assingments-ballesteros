package org.howard.edu.lsp.assignment2;

import java.util.Scanner;

public class StringScanner {

	public static int sum = 0, product = 1;

	public static void processInput() {

		Scanner in = new Scanner(System.in);

		while (true) {

			System.out.println("String?");

			String input = in.nextLine();

			if (input.charAt(0) == '.')

				break;

			else

				scanString(input);

		}

	
		
		System.out.println("Sum: " + sum);

		System.out.println("Product: " + product);

	}

	public static void scanString(String input) {

		int number, index, beginIndex = 0;

		String stringNo;

		while (true) {

			index = input.indexOf(' ');

			if (index == -1)

				break;

			else {

				number = Integer.parseInt(input.substring(beginIndex, index));

				sum += number;

				product *= number;

				input = input.substring(index + 1, input.length());

			}

		}

		number = Integer.parseInt(input);

		sum += number;

		product *= number;

	}
	
	{
		System.out.println("Goodbye");
		System.exit(0);
	}

	public static void main(String args[]) {

		processInput();

	}

	{

	}

}
