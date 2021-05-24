package by.epam.unit03.main;

public class Task02 {

	public static void main(String[] args) {
//		С помощью оператора while напишите программу определения суммы всех
//		нечетных чисел в диапазоне от 1 до 99 включительно.
		
		int x = 1;
		int sum = 0;
		
		while (x < 100) {
			
			if (x % 2 == 1) {
				sum = sum + x;
			}

			x++;

		}
		
		System.out.println("Sum is " + sum);

	}
}
