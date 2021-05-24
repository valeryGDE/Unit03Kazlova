package by.epam.unit03.main;

public class Task05 {

	public static void main(String[] args) {
//		Составить программу для вычисления значений функции F(x) на отрезке [а, b]
//		с шагом h. Результат представить в виде таблицы, первый столбец которой –
//		значения аргумента, второй - соответствующие значения функции:
		
		double a = -5;
		double b = 5;
		double h = 0.5;
		double y;
		
		System.out.println("---------------------------------");
		System.out.printf("|\t%5s\t|\t%5s\t|\n", "x", "y");
		System.out.println("---------------------------------");
		
		for(double x = a; x <= b; x = x + h) {

			y = 2 * Math.tan(x / 2) + 1;
			System.out.printf("|\t%5.1f\t|\t%5.1f\t|\n", x, y);
		}
		
		System.out.println("---------------------------------");
	}

}
