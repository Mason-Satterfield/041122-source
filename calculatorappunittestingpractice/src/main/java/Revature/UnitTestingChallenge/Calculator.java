package Revature.UnitTestingChallenge;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Calculator implements Calculate{

	private String input;
	private static final Logger logger= LogManager.getLogger(App.class);
	
	public Integer calculateOnce(String input) {
		Integer firstNumber = null;
		Integer secondNumber = null;
		String operation = "";
		Calculator calc = new Calculator();

		Integer result = null;
		char[] characters = input.toCharArray();
		String numberAsString = "";
		try {

			for (int i = 0; i < characters.length; i++) {
				char c = characters[i];

				String st = String.valueOf(c);
				if (st == " ") {
					continue;
				} else if (st.equals("+") || st.equals("-") || st.equals("*") || st.equals("/") || st.equals("%")
						|| st.equals("x") || st.equals("\\")) {

					operation = st;
					firstNumber = Integer.valueOf(numberAsString);
					numberAsString = "";
				} else {
					numberAsString += st;
				}

			}
		} catch (NumberFormatException e) {
			logger.warn("Invalid operation!");
			return null;
		}
		try {
		secondNumber = Integer.valueOf(numberAsString);
		}catch(NumberFormatException e) {
			logger.warn("Invalid operation!");
			return null;
		}
		switch (operation) {

		case "+":
			result = calc.add(firstNumber, secondNumber);
			break;
		case "-":
			result = calc.subtract(firstNumber, secondNumber);
			break;
		case "*":
		case "x":
			result = calc.multiply(firstNumber, secondNumber);
			break;
		case "/":
		case "\\":
			result = calc.divide(firstNumber, secondNumber);
			break;
		case "%":
			result = calc.remainder(firstNumber, secondNumber);
			break;
		default:

			break;
		}
		return result;

	}

	public void calculate(String input) {

		Integer firstNumber = null;
		Integer secondNumber = null;
		String operation = "";
		Calculator calc = new Calculator();

		Integer result = null;
		char[] characters = input.toCharArray();
		String numberAsString = "";
		try {

			for (int i = 0; i < characters.length; i++) {
				char c = characters[i];

				String st = String.valueOf(c);
				if (st == " ") {
					continue;
				} else if (st.equals("+") || st.equals("-") || st.equals("*") || st.equals("/") || st.equals("%")
						|| st.equals("x") || st.equals("\\")) {

					operation = st;
					firstNumber = Integer.valueOf(numberAsString);
					numberAsString = "";
				} else {
					numberAsString += st;
				}

			}
		} catch (NumberFormatException e) {
			logger.warn("Invalid operation!");
			this.turnOn();
		}
		try {
			secondNumber = Integer.valueOf(numberAsString);
			}catch(NumberFormatException e) {
				logger.warn("Invalid operation!");
				this.turnOn();
			}
		switch (operation) {

		case "+":
			result = calc.add(firstNumber, secondNumber);
			break;
		case "-":
			result = calc.subtract(firstNumber, secondNumber);
			break;
		case "*":
		case "x":
			result = calc.multiply(firstNumber, secondNumber);
			break;
		case "/":
		case "\\":
			result = calc.divide(firstNumber, secondNumber);
			break;
		case "%":
			result = calc.remainder(firstNumber, secondNumber);
			break;
		default:

			break;
		}
		System.out.println(result);

		firstNumber = null;
		secondNumber = null;
		operation = null;
		turnOn();
	}

	public int add(int x, int y) {

		return x + y;
	}

	public int subtract(int x, int y) {
		return x - y;
	}

	public int multiply(int x, int y) {
		return x * y;
	}

	public int divide(int x, int y) {
		return x / y;
	}

	public int remainder(int x, int y) {
		return x % y;
	}

	public void turnOn() {
		System.out.println("Type query (only integers):");
		Scanner sc = new Scanner(System.in);

		input = sc.nextLine();
		new Calculator().calculate(input);

	}
}
