package by.epam.unit03.main;

public class Task07 {

	public static void main(String[] args) {
//		Написать программу, переводящую римские цифры в арабские.
		
		String roman;
		int arabic;
		
		for(int i = 1; i <=10; i++) {
			arabic = i;

		switch (arabic) {

		case 1:
			roman = "I";
			break;
		case 2:
			roman = "II";
			break;
		case 3:
			roman = "III";
			break;
		case 4:
			roman = "IV";
			break;
		case 5:
			roman = "V";
			break;
		case 6:
			roman = "VI";
			break;
		case 7:
			roman = "VII";
			break;
		case 8:
			roman = "VIII";
			break;
		case 9:
			roman = "IX";
			break;
		case 10:
			roman = "X";
			break;

		default:
			System.out.println("Что-то не то с программой.");
			return;
			
			}
		
		System.out.println(arabic + " = " + roman);
		
		}

	}

}
