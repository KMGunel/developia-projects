package w3resourceTask.javaBasicPart1;

public class Task14 {

	public static void main(String[] args) {
		for(int i = 1;i<=15;i++) {
			for(int j = 1;j<=45;j++) {
				if(i==1 || i==3 || i==5 || i==7 || i==9) {
					if(j==1 || j== 3 || j== 5 || j==7 || j==9 || j==11) {
						System.out.print("*");
					}
					else if (j>12) {
						System.out.print("=");
					}
					else {
						System.out.print(" ");
					}					
				}
				else if(i>9) {
					System.out.print("=");
				}
				else {
					if(j==2 || j== 4 || j== 6 || j==8 || j==10 ) {
						System.out.print("*");
					}
					else if (j>12) {
						System.out.print("=");
					}
					else {
						System.out.print(" ");
					}		
				}
			}
			System.out.println();
		}

	}

}
