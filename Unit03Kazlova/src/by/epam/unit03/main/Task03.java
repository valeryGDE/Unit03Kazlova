package by.epam.unit03.main;

public class Task03 {

	public static void main(String[] args) {
//		Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
		
		int sum = 0;
		int result = 1;
		
		for(int i = 1; i <= 10; i++) {

			sum = sum + i;
			result = result * sum;	
		}

		System.out.println("Result is " + result);
	}

}
