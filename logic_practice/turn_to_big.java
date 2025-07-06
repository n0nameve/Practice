package practice1;

import java.util.Scanner;

public class turn_to_big {
	public static boolean checktwId(String id) {
		boolean isright = false;
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String number = "0123456789";
		if (id.length() == 10) {
			char c1 = id.charAt(0);
			if (letters.indexOf(c1) != -1) {
				if (id.charAt(1) == '1' || id.charAt(1) == '2') {
					for (int i = 2; i <= 9; i++) {
						char c2 = id.charAt(i);
						if (number.indexOf(c2) != -1) {
							return !isright;
						}
					}
				}
			}
		}
		return isright;

	}
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入身分證字號：");
        String inputId = scanner.nextLine();
        String upper = inputId.toUpperCase();
        if(checktwId(upper) == true) {
        	System.out.println("ok");
        }else {
        	System.out.println("error");
        }
	}

}


