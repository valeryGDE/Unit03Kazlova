package by.epam.unit03.main;

public class Task04 {

	public static void main(String[] args) {
//		Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5.
		
		double h = 0.5;
		double y;
		
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");
		
		for(double x = -5; x <= 5; x = x + h) {

			y = 5 - Math.pow(x, 2) / 2;
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
		}
		
		System.out.println("---------------------------------");
	}
	
}
