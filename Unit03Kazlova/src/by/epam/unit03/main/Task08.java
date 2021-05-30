package by.epam.unit03.main;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
//		Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). 
//		Вычислить результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, 
//		а также на ввод Y=0 при делении. Организовать возможность многократных вычислений без перезагрузки программа 
//		(т.е. построить цикл). В качестве символа прекращения вычислений принять ‘#’.
		
		Scanner sc = new Scanner(System.in);
		double x;
		double y;
		double z;
		char c;
		
		while (true) {

		System.out.print("Введите операнд X: ");
		while(!sc.hasNextDouble()){
			sc.next();
			System.out.println("Вы ввели не число.");
			System.out.print("Введите операнд X: ");
			}
		x = sc.nextDouble();
		
		System.out.print("Введите операнд Y: ");
		while(!sc.hasNextDouble()){
			sc.next();
			System.out.println("Вы ввели не число.");
			System.out.print("Введите операнд Y: ");
			}
		y = sc.nextDouble();
		
		System.out.print("Введите знак операции (+, –, /, *): ");

		c = sc.next().charAt(0);
		
		switch (c){
		
		case '+':
			z = x + y;
			System.out.println("z = "+ z);
			break;
		case '-':
			z = x - y;
			System.out.println("z = "+ z);
			break;
		case '/':
			if (y == 0) {
				System.out.println("Деление на ноль недопустимо. Повторите ввод.");
				break;
			} else {
			z = x / y;
			System.out.println("z = "+ z);
			}
			break;
		case '*':
			z = x * y;
			System.out.println("z = "+ z);
			break;
		default:
            System.out.println("Вы ввели не (+, –, /, *). Повторите ввод.");
            continue;            
		}	
		System.out.print("Введите # для выхода из программы либо Enter для продолжения: ");	
		if (sc.hasNextLine()) {
			sc.nextLine();
			if (sc.nextLine().equals("#")) {
				break;
				}
		}else if (sc.nextLine().equals ("")) {
			continue;
			}
		
		}
		
	}

}// Молодец. Зачтено


	

