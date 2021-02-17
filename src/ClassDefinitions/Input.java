package ClassDefinitions;

/**
 * 1. Definiere zwei Variablen für die Operatoren<br>
 * 2. Definiere den Eingabevorgang<br>
 * 3. Definiere die Berechnung mit switch<br>
 *
 *
 * 16.02.2021
 */

public class Input {

	public static void main(String[] args) {
		Input mein = new Input();
		mein.giveInNumber();
		mein.giveOperator();
		mein.giveInNumber2();
		mein.calcResult();
		mein.giveResult();

	}

	// 1.
	double firstOperand, secondOperand, result;
	char operator;

	public void giveInNumber() {
		System.out.println("Bitte gib eine Zahl ein");
		firstOperand = new java.util.Scanner(System.in).nextDouble();
		System.out.printf("Eingabe = %.2f%n", firstOperand);
	}

	public void giveInNumber2() {
		System.out.println("Bitte gib eine Zahl ein");
		secondOperand = new java.util.Scanner(System.in).nextDouble();
		System.out.printf("Eingabe = %.2f%n", secondOperand);
	}

	public void giveOperator() {
		System.out.println("Gib den Operator ein");
		operator = new java.util.Scanner(System.in).next().charAt(0);
		System.out.printf("Eingegebener Operator => %s%n", operator);
	}

	// 3.
	public void calcResult() {
		switch (operator) {
		case '+': {
			result = (firstOperand + secondOperand);
			break;
		}
		case '-': {
			result = firstOperand - secondOperand;
			break;
		}
		case '*': {
			result = firstOperand * secondOperand;
			break;
		}
		case '/': {
			result = firstOperand / secondOperand;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + operator);
		}
	}

	public void giveResult() {
		System.out.printf("Das Ergebnis Deiner Berechnung ist => %.2f%n", result);
	}

}
