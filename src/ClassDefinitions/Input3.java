package ClassDefinitions;

/**
 * <h2>Fortsetzung von Input</h2><br>
 * 4. Definiere die Eingabe als Schleife, die erst abbricht, wenn die Eingabe 'n' auf die Frage erfolgt
 *
 *
 * 16.02.2021
 */

public class Input3 {

	public static void main(String[] args) {
		Input3 mein = new Input3();
		mein.giveInput();

	}

	// 1.
	double firstOperand, secondOperand, result;
	char operator;
	
	
	
	public void giveInput() {
		do {
			giveInNumber();
			giveOperator();
		}
		while (firstOperand != 0);
	}

	public void giveInNumber() {
		System.out.println("Bitte gib eine Zahl ein");
		firstOperand = new java.util.Scanner(System.in).nextDouble();
		//System.out.printf("Eingabe = %.2f%n", firstOperand);
	}

	public void giveInNumber2() {
		System.out.println("Bitte gib eine Zahl ein");
		secondOperand = new java.util.Scanner(System.in).nextDouble();
		//System.out.printf("Eingabe = %.2f%n", secondOperand);
	}

	public void giveOperator() {
		System.out.println("Gib den Operator ein");
		operator = new java.util.Scanner(System.in).next().charAt(0);
		//System.out.printf("Eingegebener Operator => %s%n", operator);
		giveInNumber2();
		calcResult();
		giveDecission();
	}
	
	public void giveDecission() {
		System.out.println("Willst Du mit dem Ergebnis weiter rechnen ? Antworte mit y or n");
		char decission = new java.util.Scanner(System.in).next().charAt(0);
		if (decission == 'y') {
			firstOperand = result;
//			System.out.println("result = " + result+"\n");
//			System.out.println("firstOperand = " + firstOperand +"\n");
//			System.out.println("secondOperand = " + secondOperand + "\n");
			giveOperator();
		}else {
			giveResult();
			firstOperand = 0;
			
		}
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
		System.out.printf("%.2f %c %.2f = %.2f%n",firstOperand, operator, secondOperand, result);
	}

	public void giveResult() {
		//System.out.printf("Das Ergebnis Deiner Berechnung ist => %.2f%n", result);
		System.out.println("Dank das Du den Calculator benutzt hast");
	}
	
	

}
