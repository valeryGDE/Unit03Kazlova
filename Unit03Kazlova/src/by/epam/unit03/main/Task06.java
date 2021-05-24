package by.epam.unit03.main;

public class Task06 {

	public static void main(String[] args) {
//		Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
		
		int a = 12350;
		int b = 45670;
		int digitFromA;
		int digitFromB;
		int commonDigit;
		
		for (int i = a; i > 0; i = i/10) {
			digitFromA = i%10;
   		
            for (int j = b; j > 0; j = j / 10) {
            	digitFromB  = j%10;

            	if (digitFromA == digitFromB) {
            		commonDigit = digitFromA;
            		
            		System.out.println("commonDigit is " + commonDigit);
            	}  
            	
            }	 
            
		}
		
		
	}
	
}
