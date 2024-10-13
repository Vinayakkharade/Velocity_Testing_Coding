package patternprogram;

public class a9_pattern93 {
	public static void main(String[] args) {
	
			int star = 1;
			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= star; j++) {
					System.out.print("* ");
				}

				if (i < 3) {
					star++;
				} else {
					star--;
				}

				System.out.println();//i=1,2,3,4,5//star=1,2,3,2,1//
         //*
		}//* *
	}    //* * *
	}    //* *
         //*
         //