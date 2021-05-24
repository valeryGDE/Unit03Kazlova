package by.epam.unit03.main;

public class Task01 {

	public static void main(String[] args) {
//		Необходимо вывести на экран таблицу умножения на 3.
		
		int multiplicand = 3;
		int result = 0;
		
		for(int i = 1; i <=10; i++) {
			result = multiplicand * i;
			System.out.println(multiplicand + " * " + i + " = " + result);
		}

	}

}
