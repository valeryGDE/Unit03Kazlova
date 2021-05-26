package by.epam.unit03.main;

public class Task07 {

	public static void main(String[] args) {
//		Написать программу, переводящую римские цифры в арабские.
		
		String roman = "IVXLCDM";
		int arabic;
		char romanChar;

		char[] romanArray = roman.toCharArray();

		for (int i = 0; i < roman.length(); i++) {
			romanChar = romanArray[i];

			switch (romanChar) {

			case 'I':
				arabic = 1;
				break;
			case 'V':
				arabic = 5;
				break;
			case 'X':
				arabic = 10;
				break;
			case 'L':
				arabic = 50;
				break;
			case 'C':
				arabic = 100;
				break;
			case 'D':
				arabic = 500;
				break;
			case 'M':
				arabic = 1000;
				break;

			default:
				System.out.println("Что-то не то с программой.");
				return;

			}

			System.out.println(romanChar + " = " + arabic);

		}

	}

}
